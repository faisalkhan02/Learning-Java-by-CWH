package Chapter8OOPs;

class Employee2{
        int salary;
        String name;

        public int getSalary(){return salary;
        }
        public String getName(){
            return name;
        }
        public void setName(String n){
            name=n;
        }
    }
public class Ps8_q1_class {
    public static void main(String[] args) {
        // create object
        Employee2 khan = new Employee2();

        khan.setName("Faisal Khan");
        System.out.println(khan.getName());

        khan.salary = 10000;
        // khan.getSalary();
        System.out.println(khan.getSalary());
    }
}
