package Chapter6;

public class ps6_q7 {
    public static void main(String[] args) {
        int [] arr = {9,-2,3,8,5,6,7};
        int min = Integer.MAX_VALUE;
        for (int element : arr) {
            if(element<min){
                min = element;
            }
            
        }
        System.out.println("Minimum element in the array is: "+ min);
    }

    
}