package Chapter3;

public class String_methods{

    public static void main(String[] args) {
        
        String name = "Faisal";
        System.out.println(name);   //  Faisal

        int num = name.length();
        System.out.println(num);    //  6

        String lower = name.toLowerCase();
        System.out.println(lower);  //  faisal
        
        String upper = name.toUpperCase(); 
        System.out.println(upper);  //  Faisal

        String nonTrimmedString = "     Harry      ";
        System.out.println(nonTrimmedString);  //     Harry    .

        String trimmed = nonTrimmedString.trim();
        System.out.println(trimmed); // Harry

        String cut = name.substring(2);
        System.out.println(cut); // isal
        
        String cut2 = name.substring(1,4); // Faisal
        System.out.println(cut2); // ais

        System.out.println(name.replace('a','e')); //  Feisel
         
         System.out.println(name.replace("a","sh"));   //  Fshisshl
    
        System.out.println(name.startsWith("Fa"));  // True
    
        System.out.println(name.endsWith("al"));  //  true

        System.out.println(name.charAt(2));



    }
}