package demo10;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) throws IOException {

        System.out.println("服务器启动");

        // 套接字
        ServerSocket ss = new ServerSocket(8888);

        // 等待客户端发送数据
        Socket s = ss.accept();
        // 服务器端接收到的输入流
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        // 接收客户端发送的数据
        String str = dis.readUTF();
        System.out.println(str);

        // 向客户端发送数据
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("你好 客户端，我收到你的来信了,我是服务器");

        dos.close();
        os.close();
        // 关闭网络资源
        dis.close();
        is.close();
        s.close();
        ss.close();
    }
}
