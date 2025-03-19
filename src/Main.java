import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        int[][] rotatedColors = new int[SIZE][SIZE];

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        showMatrix(colors);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите угол поворота матрицы (90, 180, или 270): ");
        int angle = scanner.nextInt();

        switch (angle) {
            case 90:
                rotatedColors = rotateMatrix(colors);
                break;
            case 180:
                rotatedColors = rotateMatrix(rotateMatrix(colors));
                break;
            case 270:
                rotatedColors = rotateMatrix(rotateMatrix(rotateMatrix(colors)));
                break;
        }

        System.out.println("Повернутая матрица:");
        showMatrix(rotatedColors);
    }

    public static void showMatrix(int[][] colors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix(int[][] colors) {
        int[][] rotated = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotated[j][SIZE - 1 - i] = colors[i][j];
            }
        }
        return rotated;
    }
}
