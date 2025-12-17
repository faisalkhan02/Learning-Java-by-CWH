package Chapter9AccessModifier;

class MyEmployee{
    private int id;
    private String name;
    
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}
public class Private_modifier {

    public static void main(String[] args) {
        MyEmployee me = new MyEmployee();
        // me.id = 24;
        // me.name = "Faisal Khan";
        me.setName("Faisal Khan");
        me.setId(24);
        System.out.println(me.getName());
        System.out.println(me.getId());

    }
}
