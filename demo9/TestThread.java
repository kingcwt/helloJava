package demo9;

/*
* 创建一个线程类
* 想要具备多线程能力 extends Thread
* */
public class TestThread extends Thread{

    @Override
    public void run() {
        for(int i = 1; i<=10;i++){
            System.out.println("子线程" + i);
        }
    }
}
