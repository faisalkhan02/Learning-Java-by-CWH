package Chapter11;/*
  Create a clASS  Tv which implements 
  TvRemote interface from q6
 */

// Parent Interface
interface TVRemote2 {
    void hii();
}

// Child Interface extending the parent interface
interface SmartTvRemote3 extends TVRemote2 {
    void greet();
}

// Class implementing the child interface (so must implement both methods)
class Tv implements TVRemote2 {
    public void hii() {
        System.out.println("Hello sir...");
    }
    public void greet() {
        System.out.println("Good morning sir..");
    }
}
public class Ps11_Q7_extendQ6 {
    public static void main(String[] args){

        Tv t = new Tv();
        t.hii();
        t.greet();

        
    }
}
