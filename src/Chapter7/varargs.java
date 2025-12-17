package Chapter7;

public class varargs {

    static int sum(int ...arr) { // arguement passed as int[] arr
        //  static int sum(int a, int ...arr) {   // this need a compulsary perameter to run
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Varargs tutorial");
        System.out.println("The sum of 4 and 5 is: " + sum(4, 5));
        System.out.println("The sum of nothing is: " + sum());
        System.out.println("The sum of 4, 5, and 3 is: " + sum(4, 3, 5));
        System.out.println("The sum of 2, 3, 4, and 5 is: " + sum(2, 3, 4, 5));
    }
}

