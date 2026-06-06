import pers.cjw.ui.frame.GameJFrame;
import pers.cjw.ui.frame.LoginJFrame;
import pers.cjw.ui.frame.RegisterJFrame;

public class App {
    public static void main(String[] args) {

        //app的main方法最终只处理业务逻辑，各个功能代码分别写在各个类中，如果全写在main中，会变得非常臃肿

        //创建三个界面loginJFrame\registerJFrame\gameJFrame

//        LoginJFrame loginJFrame = new LoginJFrame();
//        RegisterJFrame registerJFrame = new RegisterJFrame();
        GameJFrame gameJFrame = new GameJFrame();


    }
}
