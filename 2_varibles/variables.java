public class variables{
    public static void main(String[] args){
        int v_int = 100;
        long v_longL = 100L; // L or l define the long int
        long v_long = 100;   // 100 is int, then converted into long
        // int v_int_L = 100L;   // Type mismatch: cannot convert from long to int
        double v_double = 2.7;
        double v_doublef = 2.33e-2F;
        float v_float= .33F;
        char gender_cn = '男';
        char gender_ASC = 97; // char is actually an int, Unicode
        char gender_anti_ASC = 'a'; // char is actually an int, Unicode
        String name_en = "Jack";
        boolean is_true = true;
        // boolean is_true_error = 1; // Type mismatch: cannot convert from int to boolean

        // print all
        System.out.println(v_int);
        System.out.println(v_long);
        System.out.println(v_longL);
        System.out.println(v_double);
        System.out.println(v_doublef);
        System.out.println(v_float);
        System.out.println(gender_cn);
        System.out.println(gender_ASC);
        System.out.println((int)gender_anti_ASC); // change char to int
        System.out.println(name_en);
        System.out.println(is_true);

        // pitfall using decimal
        // avoid == with 2 calculated decimals
        double v_pitfall = 8.1/3;
        System.out.println(v_double);  // 2.7
        System.out.println(v_pitfall); // 2.6999999999999997
        System.out.println(v_double == v_pitfall); // false
        System.out.println(Math.abs(v_pitfall - v_double) < 1e-9); // true

        // if statement in JAVA
        if (is_true == true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

// java data types
    // basic data type
        // integer: 
            // byte[1], [-128 - 17]         // 1 byte = 8 bits
            // short[2], [-32768(12^15), 32767(2^15-1)]
            // int[4],  [-2^31, 2^31-1]   // default
            // long[8]  [-2^63, 2^6-1]
        // decimal: 
            // float[4], [-3.403e38, 3.403e38]
            // double[8] [-1.798e308, 1.798e308]  // default
        // character: char[2]
        // boolean[1]
    // reference data types
        // class                                // String is a class
        // interface
        // array[]