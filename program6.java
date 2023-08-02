import java.util.*;
 
class program6 {
    public static void swap(int[] A, int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
 

    public static void partition(int[] A)
    {
        int j = 0;
 
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] != 0)        // pivot is 0
            {
                swap(A, i, j);
                j++;
            }
        }
    }
 
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("enter the how many element do you want in array");
        n = input.nextInt();
         System.out.println("enter element in A");
        int A[] = new int[20];
        for(int i=0;i<n;i++){
        A[i]=input.nextInt();
        }
        // int[] A = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
 
        partition(A);
        System.out.println(Arrays.toString(A));
    }
}