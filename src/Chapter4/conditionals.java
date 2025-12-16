package Chapter4;

public class conditionals{
    public static void main(String[] args) {
        
        int age = 19;
        if (age>18){
            System.out.println("Yes, You can drive");
    
        }
        else{
            System.out.println("No, You can not drive");
        }

        boolean check1 = (age==19);
        if (check1){
            System.out.println("You are a young boy");
        }
        else {
            System.out.println("You are not!");
        }
    }
}  