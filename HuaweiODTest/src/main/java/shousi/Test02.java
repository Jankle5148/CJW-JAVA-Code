package shousi;

public class Test02 {

    // 由于硬件限制，两个通信节点间每次最大只能传输64字节内容，但实际应用中有多种场景需要发送大于64字节的报文。
    // 假设你所在的部门负责数据接收，而发送数据是其他部门。允许发送端和接收端协商数据传输协议。
    // 请通过软件的方法设计并实现方案，解决大于64字节报文的收发问题。
    //
    // 实现API说明：
    // 功能描述: 接收数据包的回调接口
    // 参数说明: unsigned char* data  数据包起始地址
    //          unsigned char dataLen 接收到的本次报文的大小，范围[1, 64]
    // 返回说明: 接收成功返回0，接收失败返回非0
    // 接口名称：int HW_RecieveData(unsigned char* data, unsigned char dataLen)

    // 依赖API说明：
    // 功能描述: 上报数据包
    // 参数说明: unsigned char* data  数据包起始地址
    //          int dataLen 数据包长度 范围[0,65535]
    // 返回说明: 接收成功返回0，接收失败返回非0
    //int HW_ReportPackage(unsigned char* data, int dataLen);

    //5字节头部，59字节为一片，共64字节。
    //每片段5字节协议头部
    //2消息id，1当前片段编号，1总片段数量，1本片段有效数据长度。
    private static final int N = 59;
    private static final int H = 5;
    private static short mid = 0;


    private static class Msg {
        byte total;
        byte[][] seg;
        int rcv;

        Msg(byte t) {
            total = t;
            seg = new byte[t][];//seg总共t片
        }

        boolean add(byte idx, byte[] dt) {
            if (seg[idx] == null) {
                seg[idx] = dt;//存入一片进入seg
                rcv++;//接收片数+1
            }
            return rcv == total;//如果全部接收成功返回1
        }

        byte[] join() {
            int s = 0;//初始长度为0
            for (byte[] b : seg) {//累加长度
                s += b.length;
            }
            byte[] result = new byte[s];//一个长度为s的字节数组，用于拼装
            int o = 0;
            for (byte[] b : seg) {
                System.arraycopy(b, 0, result, o, b.length);
                o += b.length;
            }
            return result;
        }
    }

    public static int send(byte[] msg) {
        short id = mid++;//发送的消息id
        int total = (msg.length + N - 1) / N;//切分的片段总数
        int off = 0;//当前偏移
        for (int i = 0; i < total; i++) {
            int l = Math.min(N, msg.length - off);//当前片的数据长度
            byte[] pkt = new byte[l + H];//只加1个头的长度即可.
        }

        return 0;
    }

//    public static int HW_RecieveData(char*data, char dataLen) {
//        return 0;
//    }

//    public static int HW_ReportPackage(char*data, int dataLen) {
//        return 0;
//    }

    public static void main(String[] args) {
        byte[] data =new byte[150];
        send(data);

    }


}
