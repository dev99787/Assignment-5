public class Program1
{
    public static void main(String args[]) 
    {
        int a = 7; 

        for (int i = 1; i <= a; i++) 
        {
            
            for (int j = 1; j <= a - i; j++) 
            {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) 
            {
                System.out.print((char)('A' + j - 1));
            }
            
            for (int j = i - 1; j >= 1; j--) 
            {
                System.out.print((char)('A' + j - 1));
            }

            System.out.println();
        }
        for (int i = a - 1; i >= 1; i--) 
        {
            
            for (int j = 1; j <= a - i; j++) 
            {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) 
            {
                System.out.print((char)('A' + j - 1));
            }
            
            for (int j = i - 1; j >= 1; j--) 
            {
                System.out.print((char)('A' + j - 1));
            }

            System.out.println();
        }
    }
}
