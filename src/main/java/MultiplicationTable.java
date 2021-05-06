import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println("How many times: ");
        int howManyTimes = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i<= howManyTimes; ++i){
            System.out.printf("%d * %d = %d \n", number, i, number * i);
        }
    }
}
