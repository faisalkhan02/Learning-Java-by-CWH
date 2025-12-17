package Chapter7;

public abstract class Ps7_q7_rect_pattern4 {
    static void pattern4rec(int x){
        if (x==0){
            return;
        }
        for(int i=0;i<x;i++){
            System.out.print("* ");
        }
        System.out.println();
        pattern4rec(x-1);
    }
    public static void main(String[] args) {
        int n =4;
        pattern4rec(n);
    }
}
