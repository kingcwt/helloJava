package demo1;

import java.sql.*;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);

     while (true){
         System.out.println("欢迎来到书籍商店！");
         System.out.println("-- 按1 进入书籍编号查询 --");
         System.out.println("-- 按4 退出引用 --");
         int choice = sc.nextInt();
         if(choice == 1){
             System.out.println("请输入书籍编号");
             int bno = sc.nextInt();
             Book b = findBookByBno(bno);
             if(b == null){
                 System.out.println("书籍不存在");
             }else{
                 System.out.println("当前查询到一本书《" + b.getName() + "》");
             }
         }
         if(choice == 4){
             break;
         }
     }
    }

    public static Book findBookByBno(int bno) throws ClassNotFoundException, SQLException {
        Book b = null;
        // 1 加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 2 连接数据库
        String url ="jdbc:mysql://localhost:3306/msb?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true";
        String username ="root";
        String password = "1003835955@qq.com";
        Connection conn = DriverManager.getConnection(url, username, password);
        // 3 创建会话
        Statement sta = conn.createStatement();
        // 4 发送sql
        ResultSet rs = sta.executeQuery("select * from t_book where id = " + bno);
        if(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String author = rs.getString("author");
            double price = rs.getDouble("price");

            b = new Book();
            b.setId(id);
            b.setName(name);
            b.setAuthor(author);
            b.setPrice(price);
        }

        // 6 释放资源
        sta.close();
        conn.close();

        return b;
    }
}
