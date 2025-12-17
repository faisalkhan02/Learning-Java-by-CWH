package Chapter11;

interface sampleInterface{
    void math1();
    void math2();
}
interface childSampleInterface extends sampleInterface{ //we cannot extends class interface
    // void math1();
    // void math2();
    void math3();
    void math4();
}

class MySampleClass implements childSampleInterface{
    
    public void math1(){
        System.out.println("meth1");
    }
    public void math2(){
        System.out.println("meth2");
    }
    public void math3(){
        System.out.println("meth3");
    }
    public void math4(){
        System.out.println("meth4");
    }


}
public class c4Inheritence_Interface {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.math1();
        obj.math2();
        obj.math3();
        obj.math4();
    }
}
