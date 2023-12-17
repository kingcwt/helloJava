package demo1;

public class Girl {

    private int age;

    public void setAge(int age) {

        if(age > 30){
            this.age = 18;
        }else{
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }
}
