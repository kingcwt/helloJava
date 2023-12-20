package demo7;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException {
        write();
    }



    public static void write() throws IOException {
        // 写入本地文件
        File file = new File("/Users/cuihongran/desktop/demo.txt");
        FileWriter fw = new FileWriter(file);
        fw.write("hello world");
        fw.close();
    }

    public static void read() throws IOException {
        // 读取本地文件
        File file = new File("/Users/cuihongran/desktop/1.txt");

        FileReader fr = new FileReader(file);
        int n = fr.read();
        while ( n != -1) {
            System.out.print((char) n);
            n = fr.read();
        }
        fr.close();
    }
}
