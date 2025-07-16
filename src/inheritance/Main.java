package inheritance;


import learning_ground.ClassB;
import learning_ground.ClassX;

public class Main {
    public static void main(String[] args) {
        ClassB cb = new ClassB();
        cb.setPassword("XX");
        System.out.println(cb.getPassword());
        cb.printSomething();
        cb.displayPassword();

        cb.printGreeting("PP");
//        cb.printSomethingPrivate();

        ClassX cx = new ClassX();
        cx.testAccessModifiers(cb);
    }
}
