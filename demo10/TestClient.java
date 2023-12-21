package demo10;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TestClient {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动");
        // 套接字：指定服务器的ip和端口号
        Socket s = new Socket("192.168.1.108",8888);

        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        // 传送数据
        dos.writeUTF("你好 服务器，我是客户端");

        // 关闭网络资源
        dos.close();
        os.close();
        s.close();
    }
}
