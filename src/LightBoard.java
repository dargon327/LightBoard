import java.util.Random;

public class LightBoard {

    private boolean[][] lights;

    public LightBoard(int numRows, int numCols)
    {

        lights = new boolean[numRows][numCols];
        Random r = new Random();
        for (int i = 0; i < numRows;i++) {
            for (int j = 0; j < numCols;j++) {
                lights[i][j] = r.nextInt(1,5) <=2;
            }
        }

    }

    public boolean evaluateLight(int row, int col)
    {
        if (!lights[row][col] == true) {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                if (lights[i][col] == true) {
                    sum++;
                }
            }
            if (sum %2 == 0) {
                return false;
            }
        } else {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                if (lights[i][col] == true) {
                    sum++;
                }
            }
            if (sum %3 == 0) {
                return true;
            }
        }
        return lights[row][col];

    }

    public boolean[][] getLights() {
        return lights;
    }

    public void setLights(boolean[][] lights) {
        this.lights = lights;
    }
}
