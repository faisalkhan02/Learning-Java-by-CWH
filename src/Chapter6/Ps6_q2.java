package Chapter6;

public class Ps6_q2 {
    // find a number is present in the array
    public static void main(String[] args) {
        float [] marks = {46.4f, 75.5f, 55.0f, 89.5f, 65.5f};
        float num_check = 75.5f;
        boolean isInArray = false;

        for (float element : marks) {
            if(num_check==element){
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The value is present in the  array");
        }
        else{
            System.out.println("The value is not present in the array!");

        }
    }
}
