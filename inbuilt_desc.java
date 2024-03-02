import java.util.Arrays;
import java.util.Collections;

public class inbuilt_desc{

    public static void printArr(Integer arr[]){
        for(Integer i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + "  ");
        }
    } 

    public static void main(String args[]){
        Integer arr[] = { 5,4,1,3,2};
        
        // Arrays.sort(arr,Collections.reverseOrder());
        // printArr(arr); 

        System.out.println();

        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printArr(arr); 
        
        

    }
}