package Chapter11;

interface camera{
    void takeSnap();
    void recordVideo();
}
interface Wifi{
    String [] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting..");
    }
    
}
class MySmartphone extends MyCellPhone implements Wifi , camera{
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
public class c3DefaultMethod {
    public static void main(String[] args) {
        MySmartphone ms = new MySmartphone();
        String [] ar = ms.getNetworks();
        for (String item: ar ){
            System.out.println(item);
        }
    }
}
