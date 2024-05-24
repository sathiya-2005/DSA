import java.util.*;
public class array {
    public static void main(String args[]){
        int [] arr = new int [5];
        System.out.println(arr[2]);
        arr[2]=30;
        System.out.println(arr[2]);
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if(A<5){
            System.out.println("Take more chocolates");
        }
        else if(A==5){
            String arrr[]= new String[5];
            for(int i =0;i<A;i++){
                String B = sc.nextLine();
                arrr[i]=B;
            }
            System.out.println(arrr);
        }
        else{
            System.out.println("Overflow");
        }


    }
}
