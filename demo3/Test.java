package demo3;

public class Test {
    public static void main(String[] args) {
        Girl girl = new Girl();

//        Cat c = new Cat();
//        Dog d = new Dog();

        Animal an;
        Dog d = new Dog();
        an = d;
        girl.animalShot(an);
    }
}
