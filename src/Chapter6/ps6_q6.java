package Chapter6;

public class ps6_q6 {
    public static void main(String[] args) {
        int [] arr = {9,2,3,8,5,6,7};
        int max = Integer.MIN_VALUE;
        for (int element : arr) {
            if(element>max){
                max = element;
            }
            
        }
        System.out.println("Max element in the array is: "+ max);
    }
    
}
