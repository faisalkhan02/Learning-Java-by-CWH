package Chapter5;

public class ps5_q7 {
    // print pattern using while loop
    public static void main(String[] args) {
        int n=5;
        
        while (n>=1) {
            int i=1;
            while (i<=n) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            n--;
        }
    }
}
