package Chapter7;

public class Recursion {
    // factorial(0) = 1
    // factorial(n) = n* n-1*....1
    // factorial(5) = 5* 4* 3* 2* 1 = 120
    // factorial(n) = n * factorial(n-1)  (recuesive method)
    
    static int factorial(int n){

        if(n==0 || n==1){
            return 1;
        }

        else{
            return n*factorial(n-1);
        }
    }


    public static void main(String[] args) {
        int x =4;
        int result = factorial(x);

        System.out.println("Factorial of "+x+" is: "+result);
        
    }
}
