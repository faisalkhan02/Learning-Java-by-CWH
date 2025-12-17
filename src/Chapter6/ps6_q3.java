package Chapter6;

public class ps6_q3 {
    // find avg of marks
    public static void main(String[] args) {
        float marks[] = {75.5f, 80.0f, 69.5f, 90.0f, 78.5f};
        float sum = 0;

        for (float element : marks) {
            sum+=element;
        }
        // find average
        float avg = sum/marks.length;

        System.out.println("The Avg is: "+ avg );
    }
}
