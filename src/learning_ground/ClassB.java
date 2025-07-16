package learning_ground;

public class ClassB extends ClassA {
    public int number = 20;

    public void printSomething() {
        System.out.println("This is a method from ClassB");
        System.out.println("Number is: " + number);
        System.out.println("Message in CB: " + getMessage());

    }

    private String processMessage(String message) {
        String t = "* * * * [" + message.toUpperCase() + "] * * * *";
        return t;
    }

    public void printGreeting(String name) {
        String greeting = "greeting: Hello, are you " + name + "?";
        System.out.println(greeting);
        System.out.println(this.processMessage(greeting));
    }

    public void displayPassword() {
        System.out.println("Password is: " + this.password);

    }
}
