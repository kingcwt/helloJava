package demo2;

public class Student extends   Person {
    private String sdi;

    public void setSdi(String sdi){
        this.sdi = sdi;
    }
    public String getSdi(){
        return sdi;
    }

    public void study(){
        System.out.println("学习中");
    }
}
