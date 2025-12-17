package Chapter11;

interface camera2{
    void takeSnap();
    void recordVideo();
}
interface Wifi2{
    String [] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting..");
    }
    
}
class MySmartphone2 extends MyCellPhone2 implements Wifi2 , camera2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Record video");
    }
    public String [] getNetworks(){
        System.out.println("Getting list of Networks");
        String[] networkList = {"Faisal", "Khan", "Talib"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("connecting to "+ network);
    }
}

public class c5Polymorphism_interface {
    public static void main(String[] args) {
        camera2 cam1 = new MySmartphone2();  // this is a smartphone but, use it as a camera
            // cam1.getNetworks();  // ❌ Not allowed because. we can use only camera method
        cam1.recordVideo();

        MySmartphone2 obj = new MySmartphone2();
        obj.takeSnap();
        obj.recordVideo();
        obj.getNetworks();
        obj.connectToNetwork("Faisal");
        obj.callNumber(12345);
        String[] nets = obj.getNetworks();
    }
}
