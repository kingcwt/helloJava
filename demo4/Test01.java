package demo4;

import java.util.InputMismatchException;

public class Test01 {

    public static void main(String[] args) {
        try {
            int num1 = 12;
            int num2 = 0;
            System.out.println(num1 / num2);
        } catch (Exception e) {
             //err type:  Exception / InputMismatchException

            System.out.println("catch: 出现异常了!"+e.getMessage());
        }finally {
            System.out.println("finally: 一定会执行的代码");
        }


        System.out.println("hello world");
    }
}
