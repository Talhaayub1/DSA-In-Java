package RecursionQuetions;

public class Factorial {
    public static int getFact(int n) {

        if (n == 0) {
            return 1;
        }
        int fnm1 = getFact(n - 1);
        int fn = n * fnm1;
        return fn;

    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("The Factorial of " + n + " is " + getFact(n));
    }
}
