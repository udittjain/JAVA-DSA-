package week1;

public class arraysum {
    static int add(int[] arr){
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            sum+=(arr[i]);
        }
        return sum;

    }
    
    public static void main(String[] args){
        int arr[]={1,3,4,5};
        System.out.println(add(arr));
    }
}

