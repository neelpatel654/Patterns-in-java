public class Palindromic {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            //for spaces
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            //for first part of numbers to 1
            for (int j = i; j >=1 ; j--) {
                System.out.print(i);
            }
            //for second part of numbers
            for (int j = 2; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
//o/p:-
//    1
//   212
//  32123
// 4321234
//543212345

//o/p:- for printing i
//    1
//   222
//  33333
// 4444444
//555555555