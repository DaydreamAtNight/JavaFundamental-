import java.util.Scanner;
// scanner from java doc:
// A simple text scanner which can parse primitive types and strings using regular expressions.

public class scannerClass {
    public static void main(String [] args){
        // new, a new object
        // !There is no so called pointer in JAVA!
        Scanner scanner = new Scanner(System.in); // new is used to create a new object
        System.out.println("please input something");
        // String s = scanner.nextLine(); // include space, the whole line
        String s = scanner.next();
        System.out.println(s);
        
        int i = scanner.nextInt(); // if not int, Exception in thread "main" java.util.InputMismatchException
        System.out.println(s); 
    }
}
