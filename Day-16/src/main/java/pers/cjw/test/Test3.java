package pers.cjw.test;

import javax.swing.*;
import java.awt.event.*;

public class Test3 {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        //事件和监听：
        //（1）事件：被组件识别到的操作，比如输入、点击、划入等
        //（2）监听：组件对事件要进行监听，一旦监听到某事件，说明外部对组件进行了操作，那么可以执行对应代码。
        //常见监听：
        // ActionListener：动作监听
        // KeyListener:键盘录入监听
        // MouseListener：鼠标监听操作
        //--------------------------------------------------------------------------------------------------------------

        //首先：创建一个界面并初始化
        JFrame jFrame = new JFrame();
        jFrame.setSize(603, 680);
        jFrame.setTitle("事件演示");
        jFrame.setAlwaysOnTop(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        //--------------------------------------------------------------------------------------------------------------

        //动作监听：主要监听左键点击和空格

        //（1）创建一个按钮对象jtb1，设置按钮显示的文本、位置、宽高
        JButton jtb1 = new JButton("点我啊");
        jtb1.setBounds(0, 0, 100, 50);

        //（2）给按钮itb添加动作监听ActionListener，主要监听左键点击和键盘空格
        //使用方法addActionListener进行ActionListener的添加

        //ActionListener是一个接口根据，多态，传参需要传入一个ActionListener的实现类对象。
        //ActionListener的特点是：一旦传入，就会自动执行默认的actionPerformed这个方法。
        //actionPerformed：顾名思义，就是动作的表现，那么我们需要重写方法：设置动作表现为输出一个语句。
        //但再此种情况，我们主要只用actionPerformed方法，所以没必要专门为ActionListener写一个实现类，然后在实现类中重写方法。
        //因此，我们直接使用匿名内部类。
        //传入接口名，然后大括号重写方法，二者结合作为addActionListener的传参。
        //最终效果：ActionListener监听到左键点击和空格，实行actionPerformed方法，输出“不要点我”。

        jtb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("不要点我");
            }
        });

        //（3）把按钮添加到界面当中
        jFrame.getContentPane().add(jtb1);

        //--------------------------------------------------------------------------------------------------------------

        //鼠标监听：包括监听：单击（按+松）、按下不松、松开、划入、划出。

        //（1）创建一个按钮对象jtb2，设置显示文本、位置、宽高
        JButton jtb2 = new JButton("点我啊");
        jtb2.setBounds(0, 200, 100, 50);

        //（2）给按钮itb添加鼠标监听MouseListener，
        //使用方法addMouseListener进行MouseListener的添加。
        //同理使用匿名内部类，重写所有操作代码。
        jtb2.addMouseListener(new MouseListener() {

            //每个方法的方法名都很直观，一看就知道是干什么的
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("单击");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("按下不松");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("松开");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("划入");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("划出");
            }
        });

        //(3)把按钮添加到界面当中
        jFrame.getContentPane().add(jtb2);

        //--------------------------------------------------------------------------------------------------------------

        //键盘监听 keyListener ，监听键盘按下，键盘松开。
        //我们目前不用单独为某个按钮添加键盘监听，而是为整个界面jFrame添加键盘监听。
        //同样使用匿名内部类。
        //但是，这种只适合界面上没有按钮的情况。
        //如果你的界面上有按钮，那么界面的键盘监听会不起作用。
        //原因是焦点 Focus 。默认情况下，界面上的 JButton 等组件可能会自动获取焦点，因此键盘事件优先发送给这些组件。
        //而这些组件没有 KeyListener ，因此不会作出反应。而 JFrame 上的 KeyListener 无法接收到键盘事件。

        //解决办法：将键盘监听加入界面的 ContentPane ，而不是界面本身。
        //虽然键盘监听已经加入 ContentPane ，但此时焦点 focus仍在 ContentPane 中的组件上。
        //所以还要将焦点设置在 ContentPane 上，ContentPane 中的 KeyListener 才会接收到事件。

        jFrame.getContentPane().addKeyListener(new KeyListener() {

            //键入时
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("按下不松");

            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("松开按键");

                //怎么知道我松开了哪个键？
                //获取键盘上每一个按键的编号。刚好和ascii一样从65开始。
                //但与ascii表无关。

                int code = e.getKeyCode();
                if (code == 65) {
                    System.out.println("现在按的是A");
                } else if (code == 66) {
                    System.out.println("现在按的是B");
                }

            }
        });

        //将 ContentPane 设置为可聚焦的。
        jFrame.getContentPane().setFocusable(true);
        //使 ContentPane 请求立即获得焦点，系统会尽快将焦点转移到这个界面。
        jFrame.getContentPane().requestFocusInWindow();

        //--------------------------------------------------------------------------------------------------------------


        //5.将最终界面进行展示
        jFrame.setVisible(true);


        //--------------------------------------------------------------------------------------------------------------
        //还有一种更好的办法：
        //那就是直接让要放按钮的界面类实现监听接口。然后在界面类中，重写actionPerformed的方法。
        //这样，每当在界面定义一个按钮并实现监听，根据多态，addActionListener的传参可以直接传this，因为this是实现了监听接口的实现类对象。
        //这种方法的缺点就是所有的按钮都会共用界面类的actionPerformed的方法。
        //所以我们只要在 actionPerformed 方法中,对按钮进行 if 判断即可，首先使用 getSource 获取调用此方法的对象。
        //然后我们对这个按钮进行判断，编写不同的代码。

    }
}
