import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // 1. Create the Scanner object
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        
        // 2. Use the object name (myScanner), not the class name (Scanner)
        int num = myScanner.nextInt();

        System.out.println("\nMulti of " + num + ":");

        for(int i = 0; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }

        // 3. Close the specific object you opened
        myScanner.close();
    }
}
