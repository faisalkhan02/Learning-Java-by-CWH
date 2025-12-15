package Chapter2;

public class Opr_precedence{

    public static void main(String[] args) {
        

//        int a  = 6*5-34/2;
            /*
                = 30-34/2
                = 30-17
                = 13
            */
    //    int b  = 60*5-34/2;
        /*
            = 12-34*2
            = 12-68
            = -56
        */
    //    System.out.println(a);

        // quick quiz

        int x = 6;
        int y = 1;
        int k = x * y/2;
//        System.out.println(k);


        int b  = 1;
        int c = 4;
        int a = 5;
        int n = b*b - (4*a*c)/(2*a);
        int m = b*b - 4*a*c/2*a;

        System.out.println(n);
        System.out.println(m);

    }
}