package Chapter6;

public class Array {
    public static void main(String[] args) {
        
        int [] marks = new int[5];
        marks [0]=100;
        marks [1]=80;
        marks [2]=60;
        marks [3]=30;
        marks [4]=10;

        System.out.println(marks[3]);

        System.out.println("=== Another method ===");
    
        int number[] = {20,30,40,50,60,80};
        System.out.println (number[3]);
        System.out.println(number.length);

        System.out.println("=== Another method ===");
        String arr1 [] = {"Faisal","Khan","Saifi","Talib","Ali"};

        //  print array
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        // print in reverse order
        System.out.println("=== In Reverse order ===");

        for(int j = arr1.length-1;j>=0;j--){
            System.out.println(arr1[j]);
        }
        System.out.println("=== print by for-each loop ===");
        for(String element: arr1){
            System.out.println(element);
        }
    }
}
