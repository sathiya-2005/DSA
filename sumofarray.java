public class sumofarray {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int count=0;
        for (int a=0; a<arr.length;a++){
            int b = arr[a];
            count = count+b;
        }
        System.out.println(count);
    }
}
