package learning_ground;

public class ClassA {
    // primy pristup odkudkoli
    private String message;
    // primy pristup maji jenom metody ve stejne tride
    public int number = 10;
    // primy pristup maji pouze v TOMOT baliku nebo POTOMCI v jinych balicich
    protected String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public String getMessage() {
        return this.message;
    }

}
