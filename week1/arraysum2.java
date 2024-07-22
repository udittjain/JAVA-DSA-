package week1;

public class arraysum2 {
    static int sumArray(int[] arr, int a,int b){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            return sum;
            
        }
    
    }
    


    
}
public static void main(String[]args){
    int arr[]={1,2,3,4,5};
    int a =[2];
    int b =[3];
    system.out.println(sumArray(arr, a, b))


}