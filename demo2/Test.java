package demo2;

public class Test {


    public static void main(String[] args) {
        Student student = new Student();
        student.setSdi("123456");
        student.setAge(18);
        student.setName("chr");
        student.setHeight(180);

       var info = student.getSdi() + " " + student.getAge() + " " + student.getName() + " " + student.getHeight();
       System.out.println(info);
    }
}
