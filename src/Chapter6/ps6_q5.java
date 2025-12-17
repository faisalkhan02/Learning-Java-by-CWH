package Chapter6;

public class ps6_q5 {
    //  Reverse an array
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7};
                        
         System.err.println("=== Method 1 ===");
         System.err.println("   Commented");
         // // Actually reverses the array in memory (the original arr becomes reversed).
        //  //  This is called in-place reversal because no new array is used
         // int l = arr.length;
        // int n = Math.floorDiv(l, 2); // give greatest div integer  5/2=2
        // int temp;

        // for(int i = 0;i<n;i++){
        //     // swap a[i] and a[l-1-i]
        //     temp = arr[i];
        //     arr[i] = arr[l-1-i];
        //     arr[l-1-i] = temp;
        // }

        // // print the array
        // for(int element: arr){
        //     System.out.print(element +" ");
        // }

        System.err.println("=== Method 2 ===");
        //  Just prints the elements in reverse order.
        //  The original array arr stays {1, 2, 3, 4, 5, 6, 7} in memory.

        for (int i = arr.length-1;i>=0;i--){
        
            System.out.print(arr[i]+ " ");
        }

    }
    
}
