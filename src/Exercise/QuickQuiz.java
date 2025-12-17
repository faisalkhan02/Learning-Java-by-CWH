
class Animal{
    private String name;
    

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    void bark(){
        System.out.println("This animal is bark loudly!");
    }

}
// Derived Class to Dog 
class Dog extends Animal{
    private String breed;

    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    void sleep(){
        System.out.println("This dog sleeps at night");
    }
    void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Breed: " + getBreed());
    }
}

public class QuickQuiz {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.setName("Tiger");
        myDog.setBreed("German");

        myDog.displayInfo();
        myDog.bark();
        myDog.sleep();
    }
}
