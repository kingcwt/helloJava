package demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
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
        int i = sta.executeUpdate("insert into t_book(id,name,author,price) values (111,'西游记','吴承恩',100.0)");
        // 5 处理结果
        if(i > 0){ // 证明对数据库的数据条数有影响
            System.out.println("插入成功");
        }else{
            System.out.println("插入失败");
        }
        // 6 释放资源
        sta.close();
        conn.close();
    }
}
