package Chapter7;

public class Ps7_q6_find_avg{
    // Method to calculate average using varargs
    static double avg(int ...number){
        int sum =0;
        // calculate sum
        for (int i : number) {
            sum+=i;
        }
       
        return sum/number.length;

    }
    public static void main(String[] args) {
        System.out.println("The avg of 5,6,7,8,9 is= "+ avg(5,6,7,8,9));
    }
    
}
