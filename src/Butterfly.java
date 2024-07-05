public class Butterfly {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // 1st part of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 2nd for spaces--> spaces= 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // 3rd for Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            // 1st part of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 2nd part of spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // 3rd part for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// o/p:-
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *
