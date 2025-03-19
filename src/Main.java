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
}
