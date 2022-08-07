public class typeForcedConversion {
    public static void main(String [] args){
        System.out.println((int)1.9); // 1 Precision loss
        System.out.println((byte)2000); // -48， Data overflow
        
        // be careful to the priority
        System.out.println((int)10+3.5*3); // double, 20.5
        System.out.println((int)(10+3.5*3)); // int, 20

        byte by = 15; // first determine data, next datatype
        int num = 15;
        // byte try_by1 = num; // num is an int VARIABLE, non fix number, so int cannot be converted into byte
        byte try_by2 = (byte)num; // num is an int VARIABLE, non fix number, so int cannot be converted into byte
        System.out.println(try_by2); // 15

        // primitive datatype to String
        int n1 = 10;
        String s1 = n1 + ""; // success 
        System.out.println(s1); // 15
         
        // use wrapper class to convert Sting into primitive dataType
        String s2 = "123";
        int n2 = Integer.parseInt(s2); // parse: 解析
        System.out.println(n2); // 15
        System.out.println(Double.parseDouble(s2)); // 15.0
        System.out.println(Long.parseLong(s2)); // 15
        System.out.println(Float.parseFloat(s2)); // 15
        char c2 = s2.charAt(0);              // use first entry of String as char
        System.out.println(c2); 

        // Exception will rise if wrong String format
        int tryInt = Integer.parseInt("hello"); // Exception in thread "main" java.lang.NumberFormatException: For input string: "hello"
        System.out.println(tryInt); 

    }
}

// forced conversion loses information
// from higher precision to lower precision 