package pyramid;

import java.util.Scanner;

public class PyramidApp {
    Pyramid pyramid;

    public void loop(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PointDirection currentDirection;
        System.out.println("How big pyramid do you want?");
        String maxHeightRaw = scanner.next();
        int maxHeight = Integer.parseInt(maxHeightRaw);
        this.pyramid = new Pyramid(maxHeight);
        this.pyramid.buildPyramid();
        PyramidController controller = new PyramidController(this.pyramid);
        this.pyramid.printPyramid();
        while (true) {
            System.out.println("Press a key to rotate (w/s/a/d) or q to quit");
            String input = scanner.next();
            controller.handle(input);

            this.render();
        }
    }

    public void render() {
        clearConsole();
        this.pyramid.printPyramid();
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

