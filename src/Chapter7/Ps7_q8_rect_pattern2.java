package Chapter7;

public class Ps7_q8_rect_pattern2 {
    static void pattern_rec(int x){
        if(x==0)
        return;
            pattern_rec(x-1);
            for(int i=0;i<x;i++){
                System.out.print("* ");
            }
            System.out.println();
            
    }
    public static void main(String[] args) {
        int n =5;
        pattern_rec(n);
    }
}
