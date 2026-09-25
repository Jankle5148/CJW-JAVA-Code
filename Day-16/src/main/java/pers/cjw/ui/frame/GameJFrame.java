package pers.cjw.ui.frame;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import java.util.Random;

//GameJFrame类，继承JFrame类的所有成员变量和方法，我们通过GameJFrame来创建游戏界面
//跟游戏相关的代码，最都写在这个类中。

public class GameJFrame extends JFrame implements ActionListener, KeyListener {

    //定义gameJFrame对象时，我们需要初始化一些参数，所以我们自己写一个新的GameJFrame的无参构造方法
    //如果不自己写，GameJFrame的无参构造就会默认调用JFrame的无参构造，只是一个简单的框。

    //------------------------------------------------------------------------------------------------------------------
    //成员变量：
    //（1）一个二维数组，initData方法会将0-15随机放进此数组，initImage方法根据此数组进行图片的初始化。
    int[][] data = new int[4][4];

    //（2）两个按钮：登录、退出
    //JButton jtb1 = new JButton("登录");
    //JButton jtb2 = new JButton("退出");

    //（3）0号图片的在图片中的位置坐标，第x行第y个，初始化为第0行第0个。
    int x = 0, y = 0;

    //（4）当前展示的拼图包的路径
    String path = "Day-16\\image\\animal\\animal3\\";

    //（5）通关的正确图片顺序二维数组，每次移动完，判断data和win是否相同，如果相同就通关。
    int[][] win = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //（6）记录移动的总步数。
    int step = 0;

    //（7）创建菜单条目。
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem accountItem = new JMenuItem("公众号");

    //------------------------------------------------------------------------------------------------------------------

    public GameJFrame() {

        //1.初始化界面（包括大小，显示效果）
        initJFrame();

        //2.初始化界面上的菜单。
        initJMenuBar();

        //3.初始化图片排列顺序。
        initData();

        //4.初始化游戏界面中的图片、按钮等。
        initImage();

        //让界面能够显示。注意：setVisible(true)必须要写在最后一行。
        //因为我们是做完所有初始化工作才让界面显示，如果放在中间，那在后面的初始化不会显示在界面
        this.setVisible(true);
    }


    //------------------------------------------------------------------------------------------------------------------

    //初始化图片顺序（即打乱图片顺序数组）
    private void initData() {

        //打乱数组的方法：写过很多次了。
        //（1）定义一个数组
        int[] disorder = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        //（2）定义交换时的中间变量temp
        int temp;

        //（3）交换
        Random r = new Random();
        for (int i = 0; i < disorder.length; ++i) {//让当前的第i个元素和一个随机的元素进行交换
            //由r随机产生一个int整数
            int randomIndex = r.nextInt(disorder.length);

            //交换数组两元素
            temp = disorder[i];
            disorder[i] = disorder[randomIndex];
            disorder[randomIndex] = temp;
        }

        //将打乱的大小为16的数组，放入一个4*4的二维数组。
        //用到了int的除法和取模，很巧妙的将 一维索引 转换成 行列索引。
        for (int i = 0; i < disorder.length; ++i) {

            //将一维数组disorder的元素添加到二维数组data中。
            this.data[i / 4][i % 4] = disorder[i];

            //如果此时移动的元素为元素0，记录它在二维数组中的存放位置并记录，因为后续的移动全靠移动0号图片的上下左右完成。
            if (disorder[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
        }

    }

    //------------------------------------------------------------------------------------------------------------------

    //初始化界面图片
    private void initImage() {

        //ImageIcon：描述图片的类，可以关联任意位置的图片。（一般会把图片拷贝到当前项目的文件夹中）。
        //JLabel：用来管理图片、文字的类。可以用来设置图片位置，宽高。

        //简单来说：先用ImageIcon来存图片，JLabel相当于一个容器，可以管理放在JLabel里的ImageIcon。
        //通过setBounds自定义JLabel位置，然后把这个JLabel加入界面中即可。
        //但是我们不是真正加在JFrame中，JFrame只是一个框架，它自带一个 装载组件 的隐藏容器ContentPane。
        //我们需要调用 JFrame 的 getContentPane 这个方法获取这个容器，然后把组件 add 到容器里。
        //这个容器会默认将传入的组件居中，我们需要在界面初始化的时候将这个默认取消，这样我们的setBounds才起作用
        //默认取消放在界面初始化initJFrame里了，详见initJFrame的this.setLayout(null);

        //先添加的图片在上方，后添加的图片在下方。所以先添加图片，后添加背景。

        //1.健壮性：不管当前是否由图片，先全部清空。要不然后添加的图片会藏在已有的图片下面。
        this.getContentPane().removeAll();

        //2.如果操作过后胜利，显示“胜利”的图标（因为当胜利时会显示在最上层，所以最先写）
        if (victory()) {
            JLabel winjLabel = new JLabel(new ImageIcon("Day-16\\image\\win.png"));
            winjLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winjLabel);
        }

        //3.添加一个步数step显示。
        JLabel stepjLabel = new JLabel("步数：" + step);
        stepjLabel.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepjLabel);

        //4.添加16张小图。
        //用双层循环，像界面中加入4*4个jLabel，number=16最后一个jLabel加载一个空白图片
        //因为没有0.jpg，所以第0张图片为空白
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                //（1）定义ImageIcon的代码和传入jLabel的代码可以合并，少写代码。
                JLabel jLabel = new JLabel(new ImageIcon(path + data[i][j] + ".jpg"));
                //（2）定义位置和宽高
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //（3）为jLabel的边界border设置为BevelBorder（斜面边界，RAISED=0，图片凸，LOWERED=1，图片凹，）。
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                //（4）把jLabel添加到界面的ContentPane。
                this.getContentPane().add(jLabel);
            }
        }

        //5.添加背景图片，因为背景图在图片下方，所以后添加
        JLabel background = new JLabel(new ImageIcon("Day-16\\image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        //把背景图片添加到界面当中。
        this.getContentPane().add(background);

        //6.刷新界面
        this.getContentPane().repaint();

    }

    //------------------------------------------------------------------------------------------------------------------

    //初始化界面菜单
    private void initJMenuBar() {

        //1.创建一个菜单栏
        JMenuBar jMenuBar = new JMenuBar();

        //2.创建几个菜单项
        JMenu functionMenu = new JMenu("功能");//功能菜单
        JMenu aboutMenu = new JMenu("关于我们");//关于我们菜单

        //现在将他们一一联系起来，放入正确的位置
        //1.将成员变量中的条目放入正确的菜单项
        functionMenu.add(replayItem);
        functionMenu.add(reLoginItem);
        functionMenu.add(closeItem);
        aboutMenu.add(accountItem);

        //2.给各个条目绑定事件，因为都是单击，所以用动作监听即可.
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

        //2.再将菜单项放到菜单栏
        jMenuBar.add(functionMenu);
        jMenuBar.add(aboutMenu);

        //3.再将菜单栏加入界面
        this.setJMenuBar(jMenuBar);

    }

    //------------------------------------------------------------------------------------------------------------------

    //初始化界面菜单
    private void initJFrame() {

        //设置界面的宽高
        this.setSize(603, 680);

        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");

        //设置界面置顶，这个置顶是说windows点到其他页面的时候，就会把其他页面置顶，这个设置是无论如何我点其他的页面，这个界面都保持在windows的置顶
        this.setAlwaysOnTop(true);

        //设置界面在屏幕上居中
        this.setLocationRelativeTo(null);

        //设置关闭模式，这个WindowConstants.EXIT_ON_CLOSE的数值是3，代表了点击界面右上角的x，就会退出界面
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //1：怎么都不关
        //2：关掉，但不退出程序，只有当最后一个也关了，退出程序
        //3：只要关了一个，就全部退出
        //为什么我们不选2，因为三个界面同时出现的情况几乎没有，所以直接选3即可。

        //取消默认的添加组件居中放置，方便我们后续自定义组件的位置
        this.setLayout(null);

        //为整个界面添加键盘监听。
        this.addKeyListener(this);


    }

    //------------------------------------------------------------------------------------------------------------------

    //动作监听重写方法。
    @Override
    public void actionPerformed(ActionEvent e) {

        //获取事件的来源
        Object source = e.getSource();

        if (source == replayItem) {
            //如果监听到的是重新游戏的条目

            //（1）计步器清零
            step = 0;
            //（2）再次打乱二维数组中的数据
            initData();
            //（3）根据打乱的data重新加载图片
            initImage();

        } else if (source == reLoginItem) {
            //如果监听到的是重新登录的条目

            //不关闭，而是隐藏游戏界面，让游戏界面不visible
            this.setVisible(false);
            //打开一个登录界面
            new LoginJFrame();

        } else if (source == closeItem) {
            //如果监听到的是关闭游戏的条目

            //直接关闭虚拟机即可
            System.exit(0);

        } else if (source == accountItem) {
            //如果监听到的是公众号的条目

            //（1）创建一个弹框对象，与界面稍有不同
            JDialog jDialog = new JDialog();

            //（2）创建一个管理图片的容器对象JLabel
            JLabel jLabel = new JLabel(new ImageIcon("Day-16\\image\\about.png"));
            jLabel.setBounds(0, 0, 258, 258);

            //（3）先把公众号图片添加到弹框当中
            jDialog.getContentPane().add(jLabel);

            //（4）给弹框设置大小
            jDialog.setSize(344, 344);

            //（5）让弹框在所有界面最顶上
            jDialog.setAlwaysOnTop(true);
            //弹框居于屏幕中央
            jDialog.setLocationRelativeTo(null);
            //将弹框设置为“模态”：如果弹框不关闭，则无法操作下面的界面
            jDialog.setModal(true);

            //最后让弹框显示出来
            jDialog.setVisible(true);

        }
    }

    //------------------------------------------------------------------------------------------------------------------

    //键盘监听重写方法。
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按下不松
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            //按a不松时，展示完整图片。分以下步骤

            //（1）先移除界面所有图片
            this.getContentPane().removeAll();

            //（2）加载完整的大图片
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);

            //（3）加载背景图片（后加载的在下面）
            JLabel background = new JLabel(new ImageIcon("Day-16\\image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);

            //（4）刷新界面
            this.getContentPane().repaint();

        }


    }

    //松开一个键
    @Override
    public void keyReleased(KeyEvent e) {

        //首先判断游戏是否已经胜利，如果胜利，按任何上下左右键都不会有反应
        if (victory()) {
            return;//退出方法
        }

        //如果运行到这说明没胜利，游戏没结束，所以开始监听上下左右。
        int code = e.getKeyCode();
        //主要监听上下左右：左37，上38，右39，下40

        if (code == 37) {
            //将白图右边的图片左移，即白图和右图交换
            //前提是白图不在最右边一列，即y != 3
            //如果y == 3，直接退出此次监听
            if (y == 3) {
                return;
            }

            //能运行到这说明y != 3
            //（1）交换两个值
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;

            //（2）将白图更新为新的坐标
            ++y;

            //（3）步数+1
            ++step;

            //（4）重新加载图片
            initImage();


        } else if (code == 38) {
            //将白图下面的图片上移，即白图和下图交换
            //前提是白图不在最下面一行，即x != 3
            //如果x == 3，直接退出此次监听
            if (x == 3) {
                return;
            }

            //能运行到这说明x != 3
            //（1）交换两个值
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;

            //（2）将白图更新为新的坐标
            ++x;

            //（3）步数+1
            ++step;

            //（4）重新加载图片
            initImage();


        } else if (code == 39) {
            //将白图左边的图片右移，即白图和左图交换
            //前提是白图不在最左边一列，即y != 0
            //如果y == 0，直接退出此次监听
            if (y == 0) {
                return;
            }

            //能运行到这说明y != 0
            //（1）交换两个值
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;

            //（2）将白图更新为新的坐标
            --y;

            //（3）步数+1
            ++step;

            //（4）重新加载图片
            initImage();


        } else if (code == 40) {
            //将白图上面的图片下移，即白图和上图交换
            //前提是白图不在最下面一行，即x != 0
            //如果x == 0，直接退出此次监听
            if (x == 0) {
                return;
            }

            //能运行到这说明x != 0
            //（1）交换两个值
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;

            //（2）将白图更新为新的坐标
            --x;

            //（3）步数+1
            ++step;

            //（4）重新加载图片
            initImage();


        } else if (code == 65) {

            //松开a，重新加载15张小图片，因为数组顺序没有重新打乱，所以还是会还原原来的拼图
            initImage();

        } else if (code == 87) {
            //按下w时，作弊通关


            //(1)直接初始化data数组为原始顺序1-15，最后一张为0，然后根据这个数组加载图片即可。
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };

            //（2）让空白图片的坐标始终保持在右下角
            x = 3;
            y = 3;

            //（3）重新加载图片
            initImage();

        }
    }

    //------------------------------------------------------------------------------------------------------------------

    //判断是否胜利：判断data数组和win数组是否完全相同
    public boolean victory() {

        return Arrays.deepEquals(data, win);

    }

    //------------------------------------------------------------------------------------------------------------------

}
