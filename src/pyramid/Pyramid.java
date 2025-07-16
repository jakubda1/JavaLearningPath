package pyramid;

import java.util.Arrays;

public class Pyramid {
    String[][] pyramidArray;
    PyramidStateMachine state;
    private final int maxHeight;

    Pyramid(int maxHeight) {
        this.maxHeight = maxHeight;
        this.state = new FacingRightState();
        buildPyramid();
    }

    public void buildPyramid() {
        this.pyramidArray = new String[maxHeight * 2][maxHeight * 2];
        for (String[] value : this.pyramidArray) {
            Arrays.fill(value, "   ");
        }

        for (int i = 0; i < maxHeight; i++) {
            String[] rowBuffer = new String[maxHeight * 2];
            Arrays.fill(rowBuffer, "   ");
            for (int j = 0; j <= i; j++) {
                rowBuffer[j] = " 8 ";
            }
            this.pyramidArray[i + 1] = rowBuffer;
            this.pyramidArray[maxHeight * 2 - i - 1] = rowBuffer;
        }
    }

    public void printPyramid() {
        for (String[] strings : this.pyramidArray) {
            for (int j = 0; j < this.pyramidArray[0].length; j++) {
                System.out.print(strings[j]);
            }
            System.out.println("");
        }
    }
}


