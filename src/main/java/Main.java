import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start number: ");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter stop number: ");
        int tableSize = Integer.parseInt(scanner.nextLine());

        printMultiplicationTable(tableSize, number);
    }
    public static void printMultiplicationTable(int tableSize, int number){
        System.out.printf("     ");
        for (int i = number; i<=tableSize; i++){
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.println();

        for (int i = number; i <= tableSize; i++){
            System.out.printf("%4d  ", i);
            for (int j=number; j<= tableSize; j++){
                System.out.printf("%4d", i*j);
           }
            System.out.println();
        }
    }
}
