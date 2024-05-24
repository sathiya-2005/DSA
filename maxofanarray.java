public class maxofanarray {
    public static void main(String args[]){
        int a[]={5,-3,7,6,2,1,8,3,0,4};
        int b =0;
        for (int i=0;i<a.length;i++){
            if(b<a[i]){
                b=a[i];
            }
        }
        System.out.println(b);

    }
}
