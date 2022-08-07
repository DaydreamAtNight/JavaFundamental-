public class typeConversion {
    public static void main(String [] args){
        int num = 'a';
        double d = 80;

        // float try_float1 = d + 2; // Type mismatch: cannot convert from double to float
        // float tyr_float2 = 2.5 + 1; // same error, because default decimal is double
        float tyr_float3 = 2.5F + 1; // right

        // when assign a specific data to byte, first determine if data is within the available interval [-128 - 127]
        byte by = 15; // first determine data, next datatype
        // byte try_by1 = num; // num is an int VARIABLE, non fix number, so int cannot be converted into byte
        byte try_by2 = 'a'; // println : 97
        // char c1 = 'a';
        // byte try_by3 = c1; // Type mismatch: cannot convert from char to byte
         
        // byte short char can be calculated, when calculated, convert to int
        // byte b3 = 1;
        // byte b2 = 1;
        // short s3 = 45;
        // char c3 = 'a';
        // short s4 = b3 + s3 + c3; // Type mismatch: cannot convert from int to short
        // byte b4 = b2 + b3; // Type mismatch: cannot convert from int to byte
        // int try_num = true; // Type mismatch: cannot convert from boolean to int
        // s3 = s3-2 // Type mismatch: cannot convert from int to short


        System.out.println(num);
        System.out.println(d);
        System.out.println(tyr_float3);
        System.out.println(by);
        System.out.println(try_by2);
    }
}

// type auto conversion:
// In JAVA, dataType with lower precision can be auto converted into higher precision
// byte -> short -> int -> long -> float -> double
// char -> int -> long -> float -> double
