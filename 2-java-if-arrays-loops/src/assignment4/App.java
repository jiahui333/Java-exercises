package assignment4;

public class App {
    public static void main(String[] args) {
        printPyramid(10);
    }

    public static void printPyramid (int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

}
