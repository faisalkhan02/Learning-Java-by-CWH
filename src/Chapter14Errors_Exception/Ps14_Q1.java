package Chapter14Errors_Exception;
// write a program which have logical error, syntax error and runtime error
public class Ps14_Q1{
    public static void main(String[] args) {
        //syntax error  - int a=5

        int age = 25;
        int year_born = 2000-age; // logical error
        System.out.println(year_born);

        System.out.println(6/0); // runtime error
    }
}
