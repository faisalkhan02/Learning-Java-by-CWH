package Chapter7;

public class method_2 {

    static void tellJoke(){
        System.out.println("I am Faisal Khan, This is a method!");
    }
    int mySum(int x,int y){
        int sum = x+y;
        return sum;
        
    }
     public static void main(String[] args) {
        tellJoke();

        method_2 obj = new method_2();
        int a = 5;
        int b = 10;
        
        int result = obj.mySum(a,b);

        System.out.println(result);
    }

}
