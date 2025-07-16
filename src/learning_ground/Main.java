package learning_ground;

import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- JAV1 example - WHO TOUCH'D MAH SPAGHETT!!");

        sayHi("John");
        sayHiToMe("John");
        sumItUP(1, 2);
        int summedUp = sumItUpAndReturnValue(1, 2);
        System.out.println("Soucet cisel v metode je: " + summedUp);

        final int value = 10;
        System.out.println("Value is: " + value);

        Integer num1 = 10;
        System.out.println(Math.PI);
        System.out.println("XX: " + num1.toString());
        String nn = "jmeno";
        System.out.println(nn.toUpperCase(Locale.ROOT));

        short myShort = 10;
        int myInt = 4567;
        myInt = 57891234;

        myShort = (short) myInt;
        System.out.println(Integer.toString(myShort, 2));
        System.out.println(Integer.toString(myInt, 2));

        int a = 10;

        System.out.println("a = " + ++a);
        System.out.println("a = " + a++);
        System.out.println("a = " + --a);
        System.out.println("a = " + a--);

        for (double fli = 0.0; fli < 1; fli += 0.1) {
            System.out.println(fli);
        }

        System.out.println("\n --- bit operators");
        int bit = 67;
        System.out.println("bit = " + bit);
        bit = bit << 1;
        System.out.println("bit = " + bit);
        bit = bit << 1;
        System.out.println("bit = " + bit);
        bit = bit >> 2;
        System.out.println("bit = " + bit);


        System.out.println(0b10000001);
        System.out.println(0b11111111);
        System.out.println(0b10000001 & 0b11111111); // bit mask
        System.out.println(0b10000001 | 0b11111111);


        int cislo = 50;
        float cislo2 = 8.0f;

        if ((cislo == 50) && (cislo2 == 8)) {
            System.out.println("Podminka je OK!");
        }

        boolean vypinac = false;

        if (!vypinac) {
            System.out.println("ZAPNUTo!");
        } else {
            System.out.println("Vypnuto!");
        }

        String s = "Ternary: " + ((!vypinac) ? "Vypnuto!" : "ZAPNU!");
        System.out.println(s);


        int[] intPle = {44, 25, 13, 789, 2};
        System.out.println(Arrays.toString(intPle));

//        System.out.println(intPle[5]);

        for (int i = 0; i < intPle.length; i++) {
            System.out.printf("Index %s s hodnotou %s\n", i, intPle[i]);
        }

        int[] intArray = new int[10]; // size of list and empty
        intArray[2] = 25;

        System.out.println(intArray[0]);
        System.out.println(intArray[9]);
        System.out.println(intArray[2]);

        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("Index %s s hodnotou %s\n", i, intArray[i]);
        }

        String[] jmena = {"JAmes", "Alan", "Alex", "Rob", "Jennie"};

        for (int i = 0; i < jmena.length; i++) {
            System.out.printf("Index %s s hodnotou %s\n", i, jmena[i]);
        }

        for (String jmeno : jmena) { // GOOD! Remember that one!
            System.out.println(jmeno);
        }

        System.out.println(Arrays.toString(jmena));

        char[][] array2d = new char[8][10];

        System.out.println("Rozmer 1: " + array2d.length);
        System.out.println("Rozmer 2: " + array2d[0].length);


        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                array2d[i][j] = '*';
            }
        }
        array2d[0][0] = 'X';
        array2d[7][9] = 'X';

        printMyArray(array2d);


        int age = 19;
        if (age < 20) {
            System.out.println("Teenagerrs");
        } else {
            System.out.println("Not Teenager");
        }


        String op = "REBOOT";
        switch (op) {
            case "REBOOT", "RESTART" -> System.out.println("REBOOT");
            case "SHUTDOWN" -> System.out.println("SHUTDOWN");
            default -> System.out.println("Unknown operation");
        }


        Ovoce svacina = Ovoce.Meloun;

        if (svacina == Ovoce.Meloun) {
            System.out.println("Je to meloun");
        }

        switch (svacina) {
            case Banán -> System.out.println("Jis banana");
            case Jablko -> System.out.println("Jis jabko");
            case Meloun -> System.out.println("Jis maloun");
            default -> System.out.println("Hladovis");
        }

        int counter = 0;
        do {
            System.out.println("Cislo (do..while): " + counter);
        } while (++counter < 10);

        ClassB cb = new ClassB();
        cb.password = "xxx";
        System.out.println(cb.password);
    }

    public static void printMyArray(char[][] array2d) {
        System.out.println("--- printMyArray");
        for (char[] row : array2d) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void sayHi(String s) {
        System.out.println("Hi!");
    }

    public static void sayHiToMe(String s) {
        System.out.printf("Hi to %s!%n", s);
    }

    public static void sumItUP(int a, int b) {
        System.out.printf("Soucet cisel v metode je: %s", (a + b));
    }

    public static int sumItUpAndReturnValue(int a, int b) {
        return a + b;
    }
}
