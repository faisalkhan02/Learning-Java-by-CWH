package Chapter7;

public class Ps7_q4_pattern {
    static void pattern(int x){
        for(int i=1;i<=x;i++){
            for(int j=4;j>=i;j--){  //Or  for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

     public static void main(String[] args) {
        int n = 4;
        pattern(n);
    }
}
