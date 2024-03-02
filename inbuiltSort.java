import java.util.Arrays;

public class inbuiltSort{
    public static void printArr(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + "  ");
        }
    }
    public static void main(String args[]){
        int arr[] = { 5,4,2,1,3};
        Arrays.sort(arr);
        printArr(arr); 

        System.out.println();

        Arrays.sort(arr,0,3);
        printArr(arr); 

    }
}