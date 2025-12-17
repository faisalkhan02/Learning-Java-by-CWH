package Chapter5;

public class ps5_q4 {
    // print a reverse table of 10
    public static void main(String[] args){
        int n=10;
        System.err.println("====== Reverse Table of 10 =======");
        for (int i = 10; i>=1; i--){
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }
}
