public class ternaryOperator {
    public static void main(String [] args){
        // if (line1){a} else {b}
        // ==
        // (line1) ? a : b
        int age= 19;
        System.out.println(age > 20 ? "older than 20" : "younger than 20" );

        // find the max of 3 numbers
        int num1 = 9;
        int num2 = 10;
        int num3 = 30;

        int max = num3 > (num1 > num2 ? num1 : num2) ? num3 : (num1 > num2 ? num1 : num2);
        System.out.println(max);
    }
}
