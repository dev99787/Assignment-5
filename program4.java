import java.util.Scanner;
class program4 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("enter number 1: ");
        int x = input.nextInt();
        System.out.print("enter number 2: ");
        int y = input.nextInt();
        
        x = (x * y) / (y = x);
        System.out.println("After swapping:" + " x = " + x + ", y = " + y);
    }
}