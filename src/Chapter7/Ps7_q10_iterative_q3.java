package Chapter7;

public class Ps7_q10_iterative_q3 {
    static int sum_natural(int x){
        int sum = 0;
        for(int i=1;i<=x;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 50;
        int result = sum_natural(n);
        System.out.println("Sum of first "+n+" natural number is: "+result);
    }
}
