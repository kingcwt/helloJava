package type;

import java.util.Arrays;

public class TestType {
    public static void main(String[] args) {
        // 基本数据类型：

        // 整数类型：byte,short,int,long
        byte b = 1; // -128~127
        short s = 2; // -32768~32767
        int j = 3; // -2147483648~2147483647
        long l = 4; // -9223372036854775808~9223372036854775807
        // 浮点数类型：float,double
        float f = 5; // -3.4028235E38~3.4028235E38
        double d = 6; // -1.7976931348623157E308~1.7976931348623157E308
        // 字符类型：char
        char c = 'a'; // 'a'~'z' or 'A'~'Z'
        // 布尔类型：boolean
        boolean bool = true; // true or false


        int num = 10;
        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }

        System.out.println(sub(10, 20));
        System.out.println(Tool.add(10, 20));


        // 引用数据类型
        // 数组
        int[] arr ={10,23,40};
        System.out.println(Arrays.toString(arr));


        for(int item:arr){
            System.out.println(item+ "----增强for循环");
        }
        // 对象

    }


    public static int sub(int num1, int num2) {
        return num1 + num2;
    }
}



