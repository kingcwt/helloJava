package demo1;

import javax.xml.transform.Result;
import java.sql.*;
import java.sql.DriverManager;

public class Test2 {
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
        ResultSet rs = sta.executeQuery("select * from t_book where price > 50");
        while(rs.next()){ // 判断是否有记录存在
            System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getString("author") + " " + rs.getDouble("price"));
        }
        // 6 释放资源
        sta.close();
        conn.close();
    }
}
