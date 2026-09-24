import java.util.Scanner;

public class LoopDemo {
    public static void printMultiplicationTable() {
        System.out.println("9x9 乘法表：");
        for (int row = 1; row <= 9; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.printf("%dx%d=%-2d  ", col, row, col * row);
            }
            System.out.println();
        }
    }

    public static void printTriangle(int rows) {
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printMultiplicationTable();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入三角形行数（正整数）：");
        if (!scanner.hasNextInt()) {
            System.out.println("输入错误：请输入正整数。");
            return;
        }
        int rows = scanner.nextInt();
        if (rows <= 0) {
            System.out.println("输入错误：行数必须大于 0。");
            return;
        }
        System.out.println("直角三角形：");
        printTriangle(rows);
    }
}
