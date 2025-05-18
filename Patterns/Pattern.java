import java.util.*;

public class Pattern {

    // *****
    // *****
    // *****
    // *****
    // *****
    public static void pattern1(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // *
    // **
    // ***
    // ****
    // *****
    public static void pattern2(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    // *****
    // ****
    // ***
    // **
    // *

    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5

    public static void pattern4(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *

    public static void pattern5(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // *
    // **
    // ***
    // ****
    // *****

    public static void pattern6(int n) {

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // *****
    // ****
    // ***
    // **
    // *

    public static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // *
    // ***
    // *****
    // *******
    // *********

    public static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k < n - i + 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // *********
    // *******
    // *****
    // ***
    // *

    public static void pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // *
    // * *
    // * * *
    // * * * *
    // * * * * *

    public static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // * * * * *
    // * * * *
    // * * *
    // * *
    // *

    public static void pattern11(int n) {

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *

    public static void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // *
    // * *
    // * *
    // * *
    // *********
    public static void pattern13(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i != 1) {
                for (int k = 1; k <= i * 2 - 3; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n * 2 - 1; i++) {
            System.out.print("*");
        }
    }

    // *********
    // * *
    // * *
    // * *
    // *
    public static void pattern14(int n) {
        for (int i = 1; i <= n * 2 - 1; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i < n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            System.out.print("*");
            int spaces = 2 * (n - i) - 3;
            if (spaces > 0) {
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // *
    // * *
    // * *
    // * *
    // * *
    // * *
    // * *
    // * *
    // *

    public static void pattern15(int n) {

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i != 1) {
                for (int j = 1; j <= i * 2 - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {

            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (i != n - 1) {

                for (int j = 1; j <= 2 * (n - i) - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 1
    // 1 1
    // 1 2 1
    // 1 3 3 1
    // 1 4 6 4 1

    public static void pattern16(int n) {

        for (int i = 0; i <= n; i++) {

            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }

            int val = 1;// Doubt is it will updated every time

            for (int j = 0; j <= i; j++) {
                System.out.printf(val + " ");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();

        }
    }

    // 1
    // 212
    // 32123
    // 4321234
    // 32123
    // 212
    // 1

    public static void pattern17(int n) {

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k < n - i + 1; k++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int k = 1; k < n - i + 1; k++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    // **********
    // **** ****
    // *** ***
    // ** **
    // * *
    // * *
    // ** **
    // *** ***
    // **** ****
    // **********

    public static void pattern18(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(" ");
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(" ");
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // * *
    // ** **
    // *** ***
    // **** ****
    // **********
    // **** ****
    // *** ***
    // ** **
    // * *
    public static void pattern19(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k < n - i + 1; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k < n - i + 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < n - i + 1; k++) {
                System.out.print(" ");
            }
            for (int k = 2; k < n - i + 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ****
    // * *
    // * *
    // * *
    // ****

    public static void pattern20(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            for (int k = 1; k <= n - 2; k++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }

    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15

    public static void pattern21(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 1;
            }
            System.out.println();
        }
    }

    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1

    public static void pattern22(int n) {
        for (int i = 1; i <= n; i++) {

            int start;
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();

        }
    }

    //        *      *
    //      *   *  *   *
    //    *      *      *

    public static void pattern23(int n) {

    }

    //    *        *
    //    **      **
    //    * *    * *
    //    *  *  *  *
    //    *   **   *
    //    *   **   *
    //    *  *  *  *
    //    * *    * *
    //    **      **
    //    *        *

    public static void pattern24(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print("*");
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int k = 1; k < (n - i + 1) * 2; k++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            System.out.println("*");

        }

        for (int i = n; i >= 0; i--) {
            System.out.print("*");
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int k = 1; k < (n - i + 1) * 2; k++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            System.out.println("*");

        }
    }


    //       *****
    //      *   *
    //     *   *
    //    *   *
    //   *****

    public static void pattern25(int n) {
    for (int i = 1; i < n; i++) {
        System.out.print(" ");
    }
    for (int i = 1; i <= n; i++) {
        System.out.print("*");
    }
    System.out.println();

    for (int i = 2; i < n; i++) {
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }
        System.out.print("*");
        for (int j = 1; j <= n - 2; j++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
    for (int i = 1; i <= n; i++) {
        System.out.print("*");
    }
    System.out.println();
}



    //   1 1 1 1 1 1
    //   2 2 2 2 2
    //   3 3 3 3
    //   4 4 4
    //   5 5
    //   6


public static void pattern26(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(i+" ");

        }
        System.out.println();
    }
}


    //   1 2 3 4  17 18 19 20
    //     5 6 7  14 15 16
    //       8 9  12 13
    //         10 11

    public static void pattern27(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print(num);
                num+=1;
            }
            System.out.println();
        }
    }



    //      *
    //     * *
    //    * * *
    //   * * * *
    //  * * * * *
    //   * * * *
    //    * * *
    //     * *
    //      *

    public static void pattern28(int n){

        for(int i=1;i<=n;i++){
            for(int k=1;k<n-i+1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int k=1;k<n-i+1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    //    *        *
    //    **      **
    //    ***    ***
    //    ****  ****
    //    **********
    //    ****  ****
    //    ***    ***
    //    **      **
    //    *        *


    public static void pattern29(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<(n-i+1)*2-1;k++){
                System.out.print(" ");
            }
            //  for(int k=1;k<n-i+1;k++){
            //     System.out.print(" ");
            // }
            for(int j=1;j<=i;j++){

                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<(n-i+1)*2-1;k++){
                System.out.print(" ");
            }
            //  for(int k=1;k<n-i+1;k++){
            //     System.out.print(" ");
            // }
            for(int j=1;j<=i;j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }


    //         1
    //       2 1 2
    //     3 2 1 2 3
    //   4 3 2 1 2 3 4
    // 5 4 3 2 1 2 3 4 5

    public static void pattern30(int n){

        for(int i=1;i<=n;i++){
            for(int k=1;k<n-i+1;k++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }



        //  4 4 4 4 4 4 4
        //  4 3 3 3 3 3 4
        //  4 3 2 2 2 3 4
        //  4 3 2 1 2 3 4
        //  4 3 2 2 2 3 4
        //  4 3 3 3 3 3 4
        //  4 4 4 4 4 4 4

        public static void pattern31(int n){
            for(int i=n;i>1;i--){
                for(int j=n;j>i;j--){
                    System.out.print(j+" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }
                for(int j=2;j<=i;j++){
                    System.out.print(i+" ");
                }
                for(int j=i+1;j<=n;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            for(int i=1;i<=n;i++){

                for(int j=n;j>i;j--){
                    System.out.print(j+" ");
                }

                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }
                for(int j=2;j<=i;j++){
                    System.out.print(i+" ");
                }
                for(int j=i+1;j<=n;j++){
                    System.out.print(j+" ");
                }
                System.out.println();

            }
        }

    //    E
    //    D E
    //    C D E
    //    B C D E
    //    A B C D E

        public static void pattern32(int n){

        }

    //    a
    //    B c
    //    D e F
    //    g H i J
    //    k L m N o
        public static void pattern33(int n){

        }


    //    E D C B A
    //    D C B A
    //    C B A
    //    B A
    //    A

        public static void pattern34(int n){

        }


    //    1      1
    //    12    21
    //    123  321
    //    12344321

        public static void pattern35(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                for(int k=1;k<n-i+1;k++){
                    System.out.print(" ");
                }
                for(int k=1;k<n-i+1;k++){
                    System.out.print(" ");
                }
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
                System.out.println();
            }
        }

        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        // pattern5(n);
        // pattern6(n);
        // pattern7(n);
        // pattern8(n);
        // pattern9(n);
        // pattern10(n);
        // pattern11(n);
        // pattern12(n);
        // pattern13(n);
        // pattern14(n);
        // pattern15(n);
        // pattern16(n);
        // pattern17(n);
        // pattern18(n);
        // pattern19(n);
        // pattern20(n);
        // pattern21(n);
        // pattern22(n);
        // pattern23(n);/////
        // pattern24(n);/////
        // pattern25(n);
        // pattern26(n);
        // pattern27(n);/////
        // pattern28(n);
        // pattern29(n);
        // pattern30(n);
        // pattern31(n);
        // pattern32(n);/////
        // pattern33(n);/////
        // pattern34(n);/////
        pattern35(n);
    }
}
