package Chapter11;/*
Create  an interface TvRemote 
and use it to inherit another 
Interfacce SmartTvremote 
 */

// Parent Interface
interface TVRemote {
    void hello();
}

// Child Interface extending the parent interface
interface SmartTvRemote2 extends TVRemote {
    void greet();
}

// Class implementing the child interface (so must implement both methods)
class Welcome implements SmartTvRemote2 {
    public void hello() {
        System.out.println("Hello sir...");
    }
    public void greet() {
        System.out.println("Good morning sir..");
    }
}

public class Ps11_q6_Interface_Inherit {
    public static void main(String[] args) {
        Welcome w = new Welcome();
        w.hello();
        w.greet();
    }
}

