package Chapter7;

public class Ps7_q5_fibonacci_rect {

    static int fibn(int x){
        // start with 1 if index is not given
        if(x ==1){  // if index is given then start with 0 index
            return 0;
        }
        else if(x ==2){
            return 1;
        }
        // if(n==1 || n==2){
        // return (n-1)}
        
        else {
            return x= fibn(x-1)+fibn(x-2);   // recursion method
           
        }
    }

    public static void main(String[] args) {
        int n = 2;
        int result = fibn(n);

        System.out.println(result);
    }
    
}

    

