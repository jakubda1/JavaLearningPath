package pyramid;

public class PyramidController {
    Pyramid pyramid;

    PyramidController(Pyramid pyramid) {
        this.pyramid = pyramid;
    }

    public void handle(String input) {
        switch (input) {
            case "q":
                System.exit(0);
            case "a":
                pyramid.state.faceLeft(pyramid);
                break;
            case "d":
                pyramid.state.faceRight(pyramid);
                break;
            case "w":
                pyramid.state.faceUp(pyramid);
                break;
            case "s":
                pyramid.state.faceDown(pyramid);
                break;
        }
    }

}
