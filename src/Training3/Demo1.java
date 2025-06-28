package Training3;

public class Demo1 {
   // character is uppercase or lowercase
   public static void main(String[] args) {
       int ch = 'u';
       if(ch>='a' && ch<= 'z') {
           System.out.println("Smaller Case");
       }
       else if(ch>='A' && ch<= 'Z'){
           System.out.println("Upper Case");
       }
       else{
           System.out.println("Not a character");
       }
   }
}
