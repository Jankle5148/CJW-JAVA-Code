package pers.cjw.API.search;

public class A05_BlockSearchDemo {
    public static void main(String[] args) {

        //分块查找：块内无序（每一个块内的元素是无序的），块间有序（下一个块所有元素一定都比前一个块的所有元素大或小）,
        //实现步骤：
        //1.创建数组blockArr存储每一个块的信息。
        //2.查找blockArr，确定要查找的数据在哪一块。
        //3.单独遍历这一块的数据即可。

        //1.一个无序数组
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};

        //2.创建三个块
        Block b1 = new Block(21, 0, 5);//这个块记录数组0-5号元素，块中最大值为21。
        Block b2 = new Block(45, 6, 11);//这个块记录数组6-11号元素，块中最大值为45。
        Block b3 = new Block(73, 12, 17);//这个块记录数组12-17号元素，块中最大值为73。

        //3.定义一个块表，管理三个块
        Block[] blockArr = {b1, b2, b3};

        //4.要查找的元素
        int number = 37;

        //5.调用方法，传递 块表（索引表），要查询的数组，要查找的元素
        int index = getIndex(blockArr, arr, number);

        //6.打印元素所在位置
        System.out.println(index);


    }

    //利用分块查找的原理，查询number的索引
    private static int getIndex(Block[] blockArr, int[] arr, int number) {

        //1.首先确定number在哪个块，返回块号。
        int indexBlock = findIndexBlock(blockArr, number);

        //2.如果findIndexBlock返回值为-1，说明number不在块内，也就不在数组当中。
        if (indexBlock == -1) {
            return -1;
        }

        //运行到这说明number在数组当中。


        //2.确定了块号后，获取这一块对应在数组中的 起始索引 和 结束索引

        int startIndex = blockArr[indexBlock].getStartIndex();
        int endIndex = blockArr[indexBlock].getEndIndex();

        //3.遍历这个块即可
        for (int j = startIndex; j <= endIndex; ++j) {
            //如果这个块里有这个数，返回索引
            if (arr[j] == number) {
                return j;
            }
        }

        return -1;
    }


    //判断要查找的number在哪一块，传参为 块表 和 被查找的元素
    public static int findIndexBlock(Block[] blockArr, int number) { //100

        for (int i = 0; i < blockArr.length; i++) {
            //遍历每一个块
            //如果number小于等于这个块的最大值，说明这个number可能在这个块内
            //于是返回这个块的块号。
            if (number <= blockArr[i].getMax()) {
                return i;
            }
        }

        //如果比所有块的最大值都大，说明此数不存在数组里，于是返回-1
        return -1;
    }
}


