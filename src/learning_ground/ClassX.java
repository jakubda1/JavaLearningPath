package learning_ground;

public class ClassX {
    public void testAccessModifiers(ClassB testObj) {
        System.out.println("This is a method from ClassX");
        System.out.println(testObj.number);
        System.out.println(testObj.getMessage());
        System.out.println(testObj.password); // potomci nebo ve stejnem baliku
        testObj.printGreeting( "John");
    }
}
