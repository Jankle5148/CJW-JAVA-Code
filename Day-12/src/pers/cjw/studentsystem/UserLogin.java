package pers.cjw.studentsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserLogin {

    //2024.04.29学完final进行的修改
    //将case中的1、2、3、4、5进行常量化、私有化
    //（1）private，并且不提供其外部方法，使其不可被外部访问，以免黑客修改你的变量值。
    //比如原先1代表登录，就令SIGN_IN=1，但是如果不private，黑客若修改SIGN_IN=2,将造成功能性破坏。
    //（2）static一旦确定值，所有的UserLogin对象都共享此值
    //（3）final不仅使其更加直观，而且外部不可更改，比如输入1代表登录，那就令SIGN_IN=1；
    private static final int SIGN_IN=1;
    private static final int SIGN_UP=2;
    private static final int FIND_PASSWORD=3;
    private static final int PRINT_LIST=4;
    private static final int EXIT=5;
    //再将下面的case1、2、3、4、5改为对应的常量即可

    public static void main(String[] args) {

        //为管理系统写一个登陆界面，包含注册、登录、忘记密码。只有登陆成功，才能进行学生的增删改查
        Scanner sc = new Scanner(System.in);
        ArrayList<User> userList = new ArrayList<>();
        User user1 = new User("cjw", "123456", "440281200006121311", "13928405148");
        User user2 = new User("cht", "654321", "346146864871367135", "13928405148");
        User user3 = new User("cjh", "135790", "356139461374231847", "13928405148");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        loop:
        while (true) {
            System.out.println("-------------欢迎来到学生管理系统------------");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.忘记密码");
            System.out.println("4.查看账户列表");
            System.out.println("5.退出");
            System.out.print("请输入您的选择：");
            int choice = sc.nextInt();
            switch (choice) {
                case SIGN_IN:
                    System.out.println("----------------1.登录----------------");
                    signIn(userList);
                    break;
                case SIGN_UP:
                    System.out.println("----------------2.注册----------------");
                    signUp(userList);
                    break;
                case FIND_PASSWORD:
                    System.out.println("---------------3.忘记密码--------------");
                    findPassword(userList);
                    break;
                case PRINT_LIST:
                    System.out.println("-----------4.查看已注册账户列表----------");
                    printList(userList);
                    break;
                case EXIT:
                    System.out.println("----------------5.退出----------------");
                    System.out.println("-------------谢谢使用，再见-------------");
                    break loop;
                default:
                    System.out.println("---------------没有此选项--------------");
            }
        }
    }


    //1.注册：判断以下条件是否满足
    //（1）用户名：唯一，长度3-15，必须字母加数字，不能纯数字，
    //（2）密码：输入两次密码，一致才注册成功
    //（3）身份证号码：长度18，不以0作为开头，前17位必须是数字，最后一位可以是数字可以是字母
    //（4）手机号：长度11位，不以0作为开头，全数字
    private static void signUp(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        String userName;
        while (true) {
            System.out.print("请输入用户名：");
            userName = sc.next();
            //检查格式是否合格，不合格直接打回重写
            if (!checkUserName(userName)) {
                System.out.println("格式错误，请重新输入。");
                continue;//continue回到while循环开头，让用户继续输入用户名
            }
            //能到这里证明username格式没问题，检测username是否唯一，不唯一打回重写
            if (getIndex(list, userName) != -1) {//不等于-1，说明在表中有索引，说明表中已有username
                System.out.println("用户名已占用，请重新输入。");
            } else {
                System.out.println("用户名可用。");
                break;
            }
        }
        //能够break说明用户名是格式和唯一性都是合格的，可以执行下面的密码的设置
        String password;
        while (true) {
            System.out.print("请输入密码：");
            password = sc.next();
            System.out.print("请再次输入密码：");
            String passwordRepeat = sc.next();
            if (!passwordRepeat.equals(password)) {
                System.out.println("两次密码不一致。");
            } else {
                System.out.println("两次密码一致。");
                break;
            }
        }
        //能够break说明密码是合格的，可以执行下面的身份证号码的设置
        String idNumber;
        while (true) {
            System.out.print("请输入身份证号码：");
            idNumber = sc.next();
            if (!checkIDNumber(idNumber)) {
                System.out.println("身份证号码格式有误，请重新输入。");
            } else {
                System.out.println("身份证格式正确。");
                break;
            }
        }
        //能够break说明身份证号是合格的，可以执行下面的电话号码的设置
        String phoneNumber;
        while (true) {
            System.out.print("请输入手机号码：");
            phoneNumber = sc.next();
            if (!checkPhoneNumber(phoneNumber)) {
                System.out.println("手机号码格式有误，请重新输入。");
            } else {
                System.out.println("手机号码格式正确。");
                break;
            }
        }
        //能够break说明手机号码是合格的，可以执行下面的注册。
        User user = new User(userName, password, idNumber, phoneNumber);
        list.add(user);
        System.out.println("用户注册成功。");
    }


    //2.登录：
    //（1）输入用户名，列表里有账号，才可登录。没有账号，提示需要注册，然后退出方法
    //（2）输入密码。
    //（3）发送一个验证码到该用户的手机号码上
    //（4）用户输入验证码，一致，就去判断用户名和密码是否正确。共三次机会
    private static void signIn(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; ++i) {
            System.out.print("请输入用户名：");
            String userName = sc.next();
            if (getIndex(list, userName) == -1) {//检查该用户名是否存在，-1说明不存在,不存在需要他去注册
                System.out.println("用户不存在，请注册。");
                return;//直接退出此方法，不执行后面登录代码。
            }
            //能执行到这说明用户名没问题。
            System.out.print("请输入密码：");
            String password = sc.next();
            while (true) {//验证码可以一直输，直到输对为止。
                String code = getCode();
                System.out.println("你的验证码是:" + code);
                System.out.print("请输入验证码：");
                String codeRepeat = sc.next();
                if (codeRepeat.equals(code)) {
                    break;
                } else {
                    System.out.println("验证码错误。");
                }
            }
            //封装思想：如果说传递的参数非常多，非常零散，且这些参数都是某对象的属性，那么把这些数据封装成一个对象，再传递对象即可
            //比如，接下来的方法，要传递用户输入的用户名和密码，那么我们假定一个用户，他的用户名和密码就是我们输入的。然后将这个用户传入方法。
            User userInfo = new User(userName, password, null, null);
            boolean result = checkUserInfo(list, userInfo);//正确与否的结果
            if (result) {
                System.out.println("登录成功。");
                //!!!!!!!!!!!!!!!唯一进入系统的入口，就是登陆成功。!!!!!!!!!!!!!!!!!!!!
                //涉及到类之间的协同。
                //这里创建一个studentSystem类对象，然后调用对象的main方法，就可以使用了一个学生系统了。
                //这里提前把studentSystem类中的主方法main改名为了一个叫startStudentSystem的方法，且不用传参。
                //调用这个startStudentSystem方法即可。
                StudentSystem.startStudentSystem();
                break;
            } else {
                if (i != 2) {
                    System.out.println("登录失败，用户名或密码错误,你还有" + (2 - i) + "次机会。");
                }
                if (i == 2) {//能运行到这，首先一定是登陆失败了，其次已经用完了i等于012时的三次机会，所以锁定
                    System.out.println("登录失败，当前帐号" + userName + "被锁定。");
                }
            }
        }
    }


    //3.忘记密码：
    //（1）输入想找会密码的账户的用户名，列表里有账号，才可继续。不存在，则结束方法
    //（2）输入身份证号和手机号，且格式要正确。
    //（3）判断与该账户的是否一致。
    //（4）不一致，直接结束方法。一致，则进行修改，
    private static void findPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String userName = sc.next();
        int index = getIndex(list, userName);
        if (index == -1) {
            System.out.println("用户名不存在。");
            return;
        }
        User u = list.get(index);//把对象从列表里拿出来
        String idNumber;
        String phoneNumber;
        while (true) {
            System.out.print("请输入身份证号码：");
            idNumber = sc.next();
            if (!checkIDNumber(idNumber)) {
                System.out.println("身份证号码格式有误,请重新输入身份证号码。");
            } else {
                break;
            }
        }
        while (true) {
            System.out.print("请输入电话号码：");
            phoneNumber = sc.next();
            if (!checkPhoneNumber(phoneNumber)) {
                System.out.println("电话号码格式有误,请重新输入电话号码。");
            } else {
                break;
            }
        }
        if (!u.getIdNumber().equals(idNumber) || !u.getPhoneNumber().equals(phoneNumber)) {
            System.out.println("身份证号码或电话号码错误，不能修改密码。");
            return;//退出方法
        }
        while (true) {
            System.out.print("请输入新密码：");
            String password = sc.next();
            System.out.print("请再次输入密码：");
            String password2 = sc.next();
            if (!password2.equals(password)) {
                System.out.println("密码输入有误。");
            } else {
                list.get(index).setPassword(password);
                System.out.println("密码修改成功。");
                break;
            }
        }
    }


    //打印集合
    private static void printList(ArrayList<User> list) {
        for (int i = 0; i < list.size(); ++i) {
            User u = list.get(i);
            System.out.println(u.getUserName() + "\t" + u.getPassword() + "\t" + u.getIdNumber() + "\t" + u.getPhoneNumber());
        }
    }


    //返回userName所在的索引
    private static int getIndex(ArrayList<User> list, String userName) {
        //如果表中有id，返回索引位。没有id，则返回-1
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i).getUserName().equals(userName)) {
                return i;
            }
        }
        return -1;
    }


    //检查用户名格式是否正确
    private static boolean checkUserName(String userName) {
        //用户名：唯一，长度3-15，必须字母加数字，不能纯数字，
        if (userName.length() < 3 || userName.length() > 15) {
            return false;
        }//长度不满足要求，报错
        for (int i = 0; i < userName.length(); i++) {
            char c = userName.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }//c既不是数字也不是大小写字母，报错
        }
        int flag = 0;//0:代表没有字母，1:代表有字母
        for (int i = 0; i < userName.length(); ++i) {
            char c = userName.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {//c是字母
                flag = 1;//但凡有一个字母，就让flag置为1，表示有字母，然后break出for循环。
                break;
            }
        }
        return flag == 1;//正则表达式，flag为1，返回true，flag为0，返回false
    }


    //检查身份证格式是否正确
    private static boolean checkIDNumber(String idNumber) {
        //身份证号码：长度18，不以0作为开头，前17位必须是数字，最后一位可以是数字可以是字母
        if (idNumber.length() != 18) {
            return false;
        }//长度不为18，报错
        if (idNumber.charAt(0) == '0') {
            return false;
        }//开头为0，报错
        for (int i = 0; i < idNumber.length() - 1; ++i) {//
            char c1 = idNumber.charAt(i);
            if (!(c1 >= '0' && c1 <= '9')) {
                return false;
            }
        }//前17位不是0-9，报错
        char c2 = idNumber.charAt(idNumber.length() - 1);//身份证最后一位
        if (!(c2 == 'x' || c2 == 'X' || (c2 >= '0' && c2 <= '9'))) {
            return false;
        }//最后一位不满足要求，报错
        return true;
    }


    //检查电话号码格式是否正确
    private static boolean checkPhoneNumber(String phoneNumber) {
        //手机号码：长度11，不以0作为开头，全数字
        if (phoneNumber.length() != 11) {
            return false;
        }//长度不是11，报错
        if (phoneNumber.charAt(0) == '0') {
            return false;
        }//开头为0，报错
        for (int i = 0; i < phoneNumber.length(); ++i) {
            char c = phoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }//但凡有不是数字，报错
        return true;
    }


    //返回一个验证码，6位随机的大小写字母和数字
    private static String getCode() {
        Random r = new Random();
        //首先得到一个符号集，里面大小写字母加数字共62个，
        char[] code = new char[62];
        for (int i = 0; i < code.length; ++i) {
            if (i < 10) {
                code[i] = (char) (i + 48);//数字
            } else if (i < 36) {
                code[i] = (char) (65 + i - 10);//大写字母
            } else {
                code[i] = (char) (97 + i - 36);//小写字母
            }
        }
        String codeResult = "";
        for (int i = 0; i < 6; ++i) {
            codeResult = codeResult + code[r.nextInt(code.length)];
        }
        return codeResult;
    }


    //检查用户名、密码是否正确
    private static boolean checkUserInfo(ArrayList<User> list, User user) {
        User u = list.get(getIndex(list, user.getUserName()));//先在列表找到这个用户名对应的位置的对象
        String n = u.getUserName();//找到他的用户名
        String p = u.getPassword();//找到他的密码
        if (user.getUserName().equals(n) && user.getPassword().equals(p)) {
            return true;
        }
        return false;
    }
}
