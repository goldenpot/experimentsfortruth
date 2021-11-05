import java.util.Scanner;

public class FirstClass {

    public static void main(String[] args) {
        System.out.println("Hare Krishna");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = scan.nextInt();
        int[] yourArray = new int[size];
       for(int i=0; i <= yourArray.length-1; i++)
        {
            yourArray[i] =  scan.nextInt();
        }

       System.out.println(yourArray.length);
    }
}