package demo5;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        // 添加
        list.add("aa");
        list.add("bb");
        list.add("eee");

        System.out.println(list);


        // 删除
        list.remove("bb");

        System.out.println(list);

        // 修改 只能修改数组里面有的元素
        list.set(0, "cc");

        System.out.println(list);




        System.out.println(list.getFirst());

        System.out.println(list);
    }
}
