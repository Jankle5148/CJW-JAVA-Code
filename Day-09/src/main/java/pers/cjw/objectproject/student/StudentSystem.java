package pers.cjw.objectproject.student;

public class StudentSystem {
    public static void main(String[] args) {

        //定义长度为3的学生数组，存2名学生，属性：学号、姓名、年龄
        Student[] students = new Student[3];
        Student s1 = new Student("heima002", "cjw", 24);
        Student s2 = new Student("8ak488d", "cht", 15);
        students[0] = s1;
        students[1] = s2;

        //1.在添加一个学生对象，并添加进行学号的唯一性判断。
        addStudent(students, "241882u8", "cjh", 11);

        //2.添加完毕之后遍历所有学生信息
        for (int i = 0; i < students.length; ++i) {
            if (students[i] != null) {
                System.out.printf("第%s位学生的id是%s，姓名为%s，今年%s岁。", i + 1, students[i].getId(), students[i].getName(), students[i].getAge());
                System.out.println();
            }
        }

        //3.通过id删除学生信息
        deleteStudent(students, "8ak488d");

        //4.删除完毕之后遍历所有学生信息
        for (int i = 0; i < students.length; ++i) {
            if (students[i] != null) {
                System.out.printf("第%s位学生的id是%s，姓名为%s，今年%s岁。", i + 1, students[i].getId(), students[i].getName(), students[i].getAge());
                System.out.println();
            }
        }

        //5.查找id为heima002的学生，如果存在，将他的年龄+1岁
        int index = getIndex(students, "heima002");//找到它的位置
        int Age = students[index].getAge();//得到它的年龄
        students[index].setAge(Age + 1);//将他的年龄加一

        //4.修改完毕之后遍历所有学生信息
        for (int i = 0; i < students.length; ++i) {
            if (students[i] != null) {
                System.out.printf("第%s位学生的id是%s，姓名为%s，今年%s岁。", i + 1, students[i].getId(), students[i].getName(), students[i].getAge());
                System.out.println();
            }
        }
    }

    public static void addStudent(Student[] arr, String id, String name, int age) {
        int flag = checkID(arr, id);
        if (flag == 1) {//flag=1，说明i已存在，不能添加
            System.out.println("存在id重复，请重新输入。");
        } else if (flag == 0) {//flag=0，说明id不存在，可以添加
            if (getCount(arr) < arr.length) {//数组没满
                Student stu = new Student(id, name, age);
                arr[getCount(arr)] = stu;
            }
            System.out.println("添加成功。");
        }
    }

    public static void deleteStudent(Student[] arr, String id) {
        int flag = checkID(arr, id);
        if (flag == 0) {
            System.out.println("id无效。");
        } else if (flag == 1) {
            arr[getIndex(arr, id)] = null;//getIndex找到id所在位置，将那一位元素置空
            System.out.println("删除成功。");
        }
    }

    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] != null) {
                ++count;
            }
        }
        return count;
    }//返回数组实际的元素个数。
    // 注意遍历的时候数组如果没满，就代表存在元素为空，
    // 那么要加上if(arr[i]!=null)进行一个判断，不然遍历到空元素会报错。
    // 如果一个数组已经是满的了，那么遍历就不用加这个判断。

    public static int getIndex(Student[] arr, String id) {
        int index = 0;
        while (!arr[index].getId().equals(id)) {
            ++index;
        }
        return index;
    }//根据id，查找这个学生在第几个

    public static int checkID(Student[] arr, String id) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] != null) {
                if (arr[i].getId().equals(id)) {
                    return 1;//代表有这个id
                }
            }
        }
        return 0;//0代表没有这个id
    }

}
