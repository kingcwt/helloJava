package demo9;

/**
 *
 */
public class Test {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("main for 1----" + i);
        }


        // 创建子线程对象，输出10个数
        TestThread t = new TestThread();
        // 执行任务，不是直接调用run方法，而是将线程启动
        t.start(); // 一旦子线程启动，就会和主线程争抢资源


        // 主线程再加入一个循环
        for (int i = 1; i <= 10; i++) {
            System.out.println("main for 2 ----" + i);
        }
    }
}


/**
 * ps: 主线程 执行1-10 后面 子线程 和 后面的主线程 争抢资源
 * main for 1----1
 * main for 1----2
 * main for 1----3
 * main for 1----4
 * main for 1----5
 * main for 1----6
 * main for 1----7
 * main for 1----8
 * main for 1----9
 * main for 1----10
 * main for 2 ----1
 * main for 2 ----2
 * 子线程1
 * 子线程2
 * main for 2 ----3
 * main for 2 ----4
 * 子线程3
 * 子线程4
 * main for 2 ----5
 * 子线程5
 * 子线程6
 * 子线程7
 * 子线程8
 * 子线程9
 * 子线程10
 * main for 2 ----6
 * main for 2 ----7
 * main for 2 ----8
 * main for 2 ----9
 * main for 2 ----10
 */