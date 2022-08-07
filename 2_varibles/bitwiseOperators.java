public class bitwiseOperators {
    public static void main(String [] args){

        // System.out.println(~2.0);    // The operator ~ is undefined for the argument type(s) double
        System.out.println(~2);     // bitwise NOT -3
        // 2 primitive   00000000 00000000 00000000 00000010
        // 2 inverse     00000000 00000000 00000000 00000010
        // 2 complement   00000000 00000000 00000000 00000010
        // ^2 complement  11111111 11111111 11111111 11111101
        // ^2 inverse    11111111 11111111 11111111 11111100
        // ^2 primitive  10000000 00000000 00000000 00000011
        System.out.println(2&3);    // bitwise AND  10 & 11    -> 10   => 2
        System.out.println(2|3);    // bitwise OR   10 | 11    -> 11   => 3
        System.out.println(~-5);    // bitwise NOT  4
        // -2 primitive   10000000 00000000 00000000 00000101
        // -2 inverse     11111111 11111111 11111111 11111010
        // -2 complement   11111111 11111111 11111111 11111011
        // ^-2 complement  00000000 00000000 00000000 00000100
        // ^-2 inverse    00000000 00000000 00000000 00000100
        // ^-2 primitive  00000000 00000000 00000000 00000100
        System.out.println(13&7);   // bitwise AND  1101 & 0111 -> 0101 => 5
        System.out.println(5|4);    // bitwise OR   101 | 100   -> 101  => 5
        System.out.println(-3^3);   // bitwise XOR -2 
        // -3 primitive    10000000 00000000 00000000 00000011
        // -3 inverse      11111111 11111111 11111111 11111100
        // -3 complement    11111111 11111111 11111111 11111101
        //  3 complement    00000000 00000000 00000000 00000011
        // 3^-3 complement  11111111 11111111 11111111 11111110
        // 3^-3 inverse    11111111 11111111 11111111 11111101
        // 3^-3 primitive  10000000 00000000 00000000 00000010  

        System.out.println("<================>");
        
        // System.out.println(1.0 >> 2);   // The operator >> is undefined for the argument type(s) double, int
        System.out.println(1 >> 2);   // right shift 0-001 => 0-000 => 0
        System.out.println(1 << 2);   // left shift  0-001 => 0-100 => 4
        System.out.println(-1 << 2);  // left shift  1-001 /inverse/1-110 /comp/1-111 => /comp/1-11100 /inverse/1-11001 1-00100 => -4
        System.out.println(-1 >> 2);  // right shift 1-001 /comp/1-111 => /comp/1-111 /inverse/1-110 1-001 => -1
        System.out.println(-15 >> 2); // right shift 1-001111 /comp/1-110001 => /comp/1-111100 /inverse/1-111011 1-000100 => -4
        System.out.println(getComplementStr(-15>>2));  // check complement code
        System.out.println(15 << 2);  // left shift  15 *2 *2 => 60
        System.out.println(1 >>> 2);  // zero fill right shift   0-001 => 0-000 => 0
        System.out.println(-1 >>> 2); // zero fill right shift   1-001 /inverse/1-110 /comp/1-111 => /comp/01000000 00000000 00000000 0000011 -> 2^30+3 = 1073741827
    }

    private static String getComplementStr(int n) {
        StringBuilder str = new StringBuilder(Integer.toBinaryString(n));
        int len = str.length();
        if (len < 32) {
            for (int i = 0; i < 32 - len; i++) {
                str.insert(0, "0");
            }
        }
        return str.substring(0, 8) + " " + str.substring(8, 16) + " " + str.substring(16, 24) + " " + str.substring(24, 32);
    }

}

// Primitive Code Inverse code Complementary code

// Primitive Code               Inverse Code
//   Positive    -- invert -->   unchanged
//   Negative    -- invert -->   the first bit(sign bit) remains unchanged, the rest of the bits are inverted.

// Primitive Code               Complementary code: 
//   Positive    -- complement -->  unchanged 
//   Negative    -- complement -->  its inverse code +1

// Computers use complement to perform operations that unify positive and negative numbers

// bitwise shift
// >>  and << : sign bit unchanged, lower bit overflow, higher bit fill 0, very fast way to /2 and *2
// >>>        : sign bit changed, lower bit overflow, higher bit fill 0
// ! there is no <<< operator
