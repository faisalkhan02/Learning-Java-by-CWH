package Chapter7;

public class fibonacci {

    static int fibn(int x){
        int store1 =0;  // start with index 0
        int store2=1;
        int store3 =0;
        if(x ==0){
            return 0;
        }
        else if(x ==1){
            return 1;
        }
        
        else {
            // return x= fibn(x-1)+fibn(x-2);   // recursion method
            for (int i =2;i<=x;i++){            // using alterative method
                store3 = store1+store2;
                store1=store2;
                store2 = store3;
            }
            return store3;
        }
    }

    public static void main(String[] args) {
        int n = 7;
        int result = fibn(n);

        System.out.println(result);
    }
    
}
