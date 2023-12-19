package demo6;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    //  书城 项目功能：
    //  1. 展示书籍
    //  2. 上新书籍
    //  3. 下架书籍
    //  4. 退出应用
    // --
    // 书籍信息：
    // 编号 书名 作者
    public static void main(String[] args) {


        ArrayList list = new ArrayList();
        Book b = new Book();
        // 打印菜单：
//        System.out.println("----- 欢迎来到书城 ------");
//        System.out.println("1. 展示书籍");
//        System.out.println("2. 上新书籍");
//        System.out.println("3. 下架书籍");
//        System.out.println("4. 退出应用");
//        System.out.println("----- end ------");

        while (true) {
            // 借助一个类 Scanner类：
            Scanner sc = new Scanner(System.in);
            // 给友好提示用户
            System.out.println("----- 欢迎来到书城 ------");

            System.out.println("1. 展示书籍");
            System.out.println("2. 上新书籍");
            System.out.println("3. 下架书籍");
            System.out.println("4. 退出应用");
            System.out.println("请在下方输入序号回车： ");
            // 利用键盘录入序号：
            int choice = sc.nextInt();

            if (choice == 1) {
//                System.out.println(">>>>> 1. 展示书籍");
                int size = list.size();
                if (size == 0) {
                    System.out.println("暂无书籍");
                } else {
                    for (int i = 0; i < size; i++) {
                        Book cb = (Book) list.get(i);
                        System.out.println("编号：" + cb.getBNo() + "--- 书籍名称：" + cb.getbName() + "--- 书籍作者：" + cb.getbAuthor());
                    }
                }

            }
            if (choice == 2) {
                System.out.println("请根据下方操作添加书籍：");
                System.out.println("请输入书籍编号：");
                int bNo = sc.nextInt();
                System.out.println("请输入书籍名称：");
                String bName = sc.next();
                System.out.println("请输入书籍作者：");
                String bAuthor = sc.next();

                b.setBNo(bNo);
                b.setbName(bName);
                b.setbAuthor(bAuthor);
                list.add(b);
                System.out.println("添加书籍成功");
            }
            if (choice == 3) {
                System.out.println(">>>>> 3. 下架书籍");
                System.out.println("请输入要下架的书籍编号：");
                int bNo = sc.nextInt();
                list.remove(bNo - 1);
                System.out.println("下架书籍成功");
            }
            if (choice == 4) {
                System.out.println(">>>>> 4. 退出应用");
                break;
            }
        }

    }

}
