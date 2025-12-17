package Chapter7;

public class methods {
    static int logic(int x, int y){
        int z = 0;
        if(x>y){
           z = (x+y)*5;
        }
        else{
            z =x+y;
        }
        
        return z;
    }

    static int sum(int x,int y){
        int z = 0;

        z = (x+y);

        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int res = logic(a, b);

        int a1 = 2;
        int b1 = 8;
        int res1 = logic(a1, b1);

        int a2 = 5;
        int b2 = 10;

        int res2 = sum(a2, b2);

        System.out.println("res is: "+res);
        System.out.println("res1 is: "+res1);
        System.out.println("Sum is: "+res2);
    }
}
