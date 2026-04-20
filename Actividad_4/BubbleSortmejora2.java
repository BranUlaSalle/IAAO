package Actividad_4;
import java.util.Arrays;

public class BubbleSortmejora2 {
    public static void main (String[] args){
        int[] arr = {5,4,3,2,1};
        int swapped=0;

        for (int i = 0; i< arr.length - 1; i++){
            swapped=0; 
            //mejora 2
            for (int j = 0; j < arr.length - i - 1; j++ ){
                if (arr[j] > arr[ j+1]){
                    int tmp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    swapped=1;
                }
            }
            if(swapped !=0){
                break; 
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
