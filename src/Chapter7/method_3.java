package Chapter7;

public class method_3 {
    static int logic(int a){
        a =15;
        return a;
    }
    
    static void logic2(int arr[]){
        arr[0]=25;

    }
    public static void main(String[] args) {
        int a =10;
        int res = logic(a);
        // still print 10 because its like call by value(copy are passed to method)
        System.out.println(a);

        System.out.println("=== Case:2 >> in Case of Arrays ===");
        int arr[] = {1,2,3,4,5,6};

        logic2(arr);
        //  print 25 because in case of array reference is passed to method
        System.out.println("Element 0 is: "+arr[0]);
    }
    
}