import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // printf() = 	an optional method to control, format, and display text to the console window
        //				two arguments = format string + (object/variable/value)
        //				% [flags] [precision] [width] [conversion-character]

        //The format string %4d instructs the formatter to print the integer in 4 character width padding with spaces as necessary

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start number: ");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter stop number: ");
        int tableSize = Integer.parseInt(scanner.nextLine());

        printMultiplicationTable(tableSize, number);
    }
    public static void printMultiplicationTable(int tableSize, int number){
        //prints top table row
        //veido priekšā atstarpi pirms augšējās skaitļu virknes, lai ciparu rinda būtu pretī table cipariem
        System.out.printf("     ");
        //%d - lieto priekš int, kā decimāldaļu, kas nosaka, cik cipari tiks ierakstīti viens aiz otra un kādas būs atstarpes starp skaitļiem
        //%4d - cipars nosaka cik lielas būs atsarpes un cik liels cipars būs uzrakstīts = 2 cipari un 2 atstarpes
        for (int i = number; i<=tableSize; i++){
            System.out.printf("%4d", i);
        }
        //veido atstarpi starp augšējo skaitļu virkni un table
        System.out.println();
        System.out.println();

        for (int i = number; i <= tableSize; i++){
            //prints left table row
            System.out.printf("%4d  ", i);
            //prints table part
            for (int j=number; j<= tableSize; j++){
                System.out.printf("%4d", i*j);
           }
            //printē attālumu starp cipariem no augšas uz leju
            System.out.println();
        }
    }
}
