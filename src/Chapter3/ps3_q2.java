package Chapter3;

public class ps3_q2{
    public static void main(String[] args) {

// ============ Problem 2 =================
//  replace " " with "_"
        String name = "faisal khan";
        name =name.replace(' ','_');
        System.out.println(name);
  

//==============Problem 3=================
// replace string data using replace method

String letter= "Dear <|name|> Thanks a lot";
letter = letter.replace("<|name|>","Faisal");

System.out.println(letter);


// =============== Problem 4 =================

// single and double spaces detection program

     String mystring = "This is  string contains double and   triple spaces";

    System.out.println(mystring.indexOf("  ")); // (2 spaces) 
    System.out.println(mystring.indexOf("     ")); // (4 spaces) if false return -1


// ================ Problem 5 =================

// formate letter using escape sequence character

    String myLetter = "Dear Faisal\n\tthis Java course \n\tis good.";
    System.out.println(myLetter);

  }
}
