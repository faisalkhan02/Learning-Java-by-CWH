package Chapter4;

public class logical{
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
// ============== && ===========
        if (a && b ){
            System.out.println("&& is : Yes");   
        }
        else{
            System.out.println("&& is : No");
        }
// ============ || =============
        if (a || b){
            System.out.println("|| is : Yes");
        }
        else{
            System.out.println("|| is : No");
        }
// =========== ! ===============
        if (a!=b){
            System.out.println("True is : False");
        }
        else {
            System.out.println("False is : True");
        }
    }
}