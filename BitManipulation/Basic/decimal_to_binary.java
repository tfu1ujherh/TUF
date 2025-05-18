package BitManipulation.Basic;

public class decimal_to_binary {
    public static void main(String[] args) {
        
        int decimal=11;

        String binary=Integer.toBinaryString(decimal);
        System.out.println(binary);
    }
}


//String
/*
  public class DecimalToBinaryManual {
    public static void main(String[] args) {
        int num = 11;
        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num = num / 2;
        }
        System.out.println("Binary: " + binary);
    }
}

 */

 //Integer
 /*
  public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 11;
        int binary = 0;
        int place = 1;

        while (decimal > 0) {
            int rem = decimal % 2;
            binary += rem * place;
            place *= 10;
            decimal /= 2;
        }

        System.out.println("Binary: " + binary); // Output: 1011
    }
}

  */