package pers.cjw.ui.frame;

import javax.swing.*;

public class RegisterJFrame extends JFrame {

    public RegisterJFrame() {

        //设置界面的大小
        this.setSize(488, 500);

        //设置界面的标题
        this.setTitle("拼图 注册");

        //设置界面置顶，这个置顶是说windows点到其他页面的时候，就会把其他页面置顶，这个设置是无论如何我点其他的页面，这个界面都保持在windows的置顶
        this.setAlwaysOnTop(true);

        //设置界面居中
        this.setLocationRelativeTo(null);

        //设置关闭模式，这个WindowConstants.EXIT_ON_CLOSE的数值是3，代表了点击界面右上角的x，就会退出界面
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //让界面能够显示出来，注意：jFrame.setVisible(true);必须要写在最后一行。
        this.setVisible(true);

        getContentPane();
    }
}
