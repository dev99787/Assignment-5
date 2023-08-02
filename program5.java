import java.util.*;

public class program5 {

    public static void main(String[] args) {
        // int[] arr = new int[]{1,2,3,4,5};
                Scanner input = new Scanner(System.in);
         int n;
        System.out.println("enter the how many element do you want in array");
        n = input.nextInt();
         System.out.println("enter element in arr");
        int arr[] = new int[20];
        for(int i=0;i<n;i++){
        arr[i]=input.nextInt();
        }
        int[] arr_new = new int[arr.length-1];

        System.out.print("enter index number to remove element: ");
        int j = input.nextInt();
        for(int i=0, k=0;i<arr.length;i++){
            if(i!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr_new));

    }
}