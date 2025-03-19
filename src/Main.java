public class Main {
    private static final int SIZE = 8;

    public static void main(String[] args) {
//        Создание матрицы в программе;
        int[][] matrix = createMatrix(SIZE, SIZE);

//        Вывод матрицы до поворота;
        System.out.println("Оригинальная матрица");
        printMatrix(matrix);

//        Разворот матрицы;
        int[][] result = rotateMatrix(matrix);

//        Вывод матрицы после поворота на 90 градусов.
        System.out.println("Перевернутая матрица");
        printMatrix(result);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
