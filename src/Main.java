import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество строк матрицы");
        int rows = console.nextInt();
        System.out.println("Введите количество столбцов матрицы");
        int columns = console.nextInt();
        int[][] numbers = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.println("Введите " + " элемент матрицы строки " + i + ", столбца " + j);
                numbers[i][j] = console.nextInt();
            }
        }

        System.out.println("Элементы первой строки матрицы, перемноженные на 3:");
        System.out.print("{");
        for (int j = 0; j < rows; j++) {
            System.out.print(3 * numbers[0][j] + ((j != columns - 1)?",":""));
        }
        System.out.println("}");
    }
}