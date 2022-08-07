public class assignOperator {
    public static void main(String [] args){
        byte b1 = 1;
        // b1 = b1 + 3; // Type mismatch: cannot convert from int to byte
        b1 += 3; // an underlying force dataType conversion exist
        b1 ++; // same, an underlying force dataType conversion exist
        System.out.println(b1);
    }
}
