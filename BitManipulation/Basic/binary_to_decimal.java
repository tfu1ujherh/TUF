package BitManipulation.Basic;

public class binary_to_decimal {
    public static void main(String[] args) {
        String binary="1011";

        int decimal=Integer.parseInt(binary,2);
        System.out.println("Decimal number is:"+decimal);


    }

}

//String
/* 
public class BinaryToDecimalManual {
    public static void main(String[] args) {
        String binary = "1011";
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            char bit = binary.charAt(binary.length() - 1 - i);
            if (bit == '1') {
                decimal += Math.pow(2, i);
            }
        }
        System.out.println("Decimal: " + decimal);
    }
}
*/



//Integer
/* 

public class BinaryToDecimal {
    public static void main(String[] args) {
        int binary = 1011;
        int decimal = 0;
        int power = 0;

        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, power);
            power++;
            binary /= 10;
        }

        System.out.println("Decimal: " + decimal); // Output: 11
    }
}
*/
