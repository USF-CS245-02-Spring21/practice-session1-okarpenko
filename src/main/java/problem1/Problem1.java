package problem1;

// Give Theta of the running time (as a function of n) of the following code snippets:
// Your answer:
// (a)
// (b)
public class Problem1 {

    // (a)
    public static int func1(int n) {
        int sum1 = 0, sum2 = 0;
        for (int k = 1; k <= n; k = k * 2) {
            for (int l = 1; l <= n; l++)
                sum1++;

        }

        for (int i=1; i <= n; i++) {
            for (int j = 1; j < i; j++)
                sum2++;
        }

        return sum1 * sum2;
    }

    // (b)
    public static void func2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int k = n; k >= 1; k--)
                sum = sum + k + func1(n); // here we call func1 from (a)

        }
        System.out.println(sum);
    }

}
