import java.util.*;
public class primenumber{
    public static void main(String args[]){
        int A = 0;
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        for(int a=2;a<B;a++){
            if(B%a==0){
                A = 1;
            }
        }
        if (A>0){
            System.out.println("It is not a prime number");
        }
        else{
            System.out.println("It is a prime number");
        }
    }
}