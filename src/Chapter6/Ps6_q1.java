package Chapter6;// Create a array of 5 float and sum

public class Ps6_q1 {
    public static void main(String[] args) {
        float [] marks = {46.4f, 75.5f, 55.0f, 89.5f, 65.5f};
        float sum = 0f;
        // for(int i = 0;i<marks.length;i++){
        //     sum+=marks[i];
        // }

        for (float element : marks) { // for each elemnt
            sum+=element;
        }
        System.out.println(sum);
    }
}
