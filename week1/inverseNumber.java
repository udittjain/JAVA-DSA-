package week1;


public class inverseNumber {
    static int inverseNumber(int n ){
        int temp=0;
        while (n!=0) {
            temp=temp*10+ n%10;
            n/=10;
            
        }
        return temp;
    }

}
public static void main(String[] args){
    system.out.println(inverseNumber(n 1076));
}