package Chapter7;

public class Ps7_q9_temp_convert {
    static double temp(double x){
        double far = (x*9/5)+32;

        return far;
    }
    public static void main(String[] args) {
        double cel_temp = 30.5;
        double result = temp(cel_temp);

        System.out.println(cel_temp+" degree Celcius == "+result+" Farenheit");
    }
}
