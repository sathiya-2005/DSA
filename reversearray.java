import java.util.*;
public class reversearray {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int i=0;
        int a = arr.length;
        int j = a- 1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
