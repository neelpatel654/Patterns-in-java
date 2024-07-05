public class InvertedHalfPyramid2 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <=4 ; i++) {
            //inner loop for space
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
//o/p:-
//           *
//          **
//         ***
//        ****
