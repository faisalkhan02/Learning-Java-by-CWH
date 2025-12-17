package Chapter8OOPs;

class Employee{
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("My name is: "+name);
        System.out.println("My id is: "+id);
    }
    public int getSalary(){
        return salary;
        
    }
}
public class custom_class {
    public static void main(String[] args) {
        
        System.out.println("This is our customer class");
        Employee faisal = new Employee(); // Instantiating a new object
        Employee harry = new Employee();

        // setting Attributes for faisal
        faisal.id =12; 
        faisal.name = "Faisal Khan";
        faisal.salary = 10000;

        // setting Attributes for harry
        harry.id = 20;
        harry.name = "Harish Saifi";
        harry.salary = 15000;

        //call the method
        faisal.printDetails();
        harry.printDetails();
        int salary = harry.getSalary();

        System.out.println("My salary is: "+salary);
    }
}
