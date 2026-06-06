package pers.cjw.DouDiZhuFinal.domain;

import pers.cjw.DouDiZhuFinal.game.GameJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//牌类（准确来说，显示在游戏界面中的牌都是一个个JLabel）
public class Poker extends JLabel implements MouseListener {

    GameJFrame gameJFrame;
    //牌的名字
    String name;
    //牌显示正面还是反面
    boolean up;
    //是否可点击
    boolean canClick = false;
    //当前状态，是否已经被点击
    boolean clicked = false;

    public Poker(GameJFrame m, String name, boolean up) {

        this.gameJFrame = m;
        this.name = name;
        this.up = up;

        //判断当前的牌是显示正面还是背面
        if (this.up) {
            this.turnFront();
        } else {
            this.turnRear();
        }
        //设置牌的宽高大小
        this.setSize(71, 96);
        //把牌显示出来
        this.setVisible(true);
        //给每一张牌添加鼠标监听
        this.addMouseListener(this);
    }

    public Poker() {
    }

    public Poker(GameJFrame gameJFrame, String name, boolean up, boolean canClick, boolean clicked) {
        this.gameJFrame = gameJFrame;
        this.name = name;
        this.up = up;
        this.canClick = canClick;
        this.clicked = clicked;
    }

    //显示正面
    public void turnFront() {
        this.setIcon(new ImageIcon("Day-25\\src\\pers\\cjw\\DouDiZhuFinal\\image\\poker\\" + name + ".png"));
        this.up = true;
    }

    //显示背面
    public void turnRear() {
        this.setIcon(new ImageIcon("Day-25\\src\\pers\\cjw\\DouDiZhuFinal\\image\\poker\\rear.png"));
        this.up = false;
    }


    //出牌时，需要点击牌
    //被点击之后，牌向上移动20个像素
    //再次被点击，牌回落20个像素
    @Override
    public void mouseClicked(MouseEvent e) {
        if (canClick) {
            Point from = this.getLocation();
            int step;
            if (clicked) {
                step = 20;
            } else {
                step = -20;
            }
            clicked = !clicked;
            Point to = new Point(from.x, from.y + step);
            this.setLocation(to);
        }
    }

    public void mouseEntered(MouseEvent arg0) {
    }

    public void mouseExited(MouseEvent arg0) {
    }

    public void mouseReleased(MouseEvent arg0) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public GameJFrame getGameJFrame() {
        return gameJFrame;
    }

    public void setGameJFrame(GameJFrame gameJFrame) {
        this.gameJFrame = gameJFrame;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isCanClick() {
        return canClick;
    }

    public void setCanClick(boolean canClick) {
        this.canClick = canClick;
    }

    public boolean isClicked() {
        return clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public String toString() {
        return "Poker{gameJFrame = " + gameJFrame + ", name = " + name + ", up = " + up + ", canClick = " + canClick + ", clicked = " + clicked + "}";
    }
}
