package Chapter5;

public class break1 {
    public static void main(String[] args) {
        for(int i = 1;i<=10;i++) {
            if (i == 4) {
                continue;

            }
            System.out.print(i + " ");
            System.out.println("Java is great ");
            if (i == 8) break;

        }

    }
}
