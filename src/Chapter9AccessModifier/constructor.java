package Chapter9AccessModifier;

class MyEmployee2{
    private int id;
    private String name;

    public MyEmployee2(){ // constructor
        id = 0;
        name = "Faisal Khan";
    }
    public MyEmployee2(String myName, int myId){ // constructor as argument
        id = myId;
        name = myName;
    }
    public MyEmployee2(String myName){ // constructor as 1 argument
        name = myName;
    }

    
    public void setName(String n) { name = n; }
    public String getName() { return name; }
    public void setId(int i) { id = i; }
    public int getId() { return id; }
}
public class constructor {
    public static void main(String[] args) {
        MyEmployee2 em = new MyEmployee2("Faisal 143"); // passed argument in constructor
        // em.setName("Faisal Khan"); 
        // em.setId(25);
        System.out.println(em.getId());
        System.out.println(em.getName());
    }
}
