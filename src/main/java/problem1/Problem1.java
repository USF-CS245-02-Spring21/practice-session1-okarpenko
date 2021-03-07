package problem1;

// Give Theta of the running time (as a function of n) of the following code snippets:
// Your answer:
// (a) Theta(n^2)
// Explanation:
// Consider the k loop. We start with k = 1, go to k = n and multiply k by 2 at every iteration.
// How many times do I need to multiply by 2 before I get to n?
// 2^x = n, when x = log n. So the running time of the k loop is log n.
// The number of iterations of the l loop is n, and sum1++ has a constant running time.
// So the k and l loop combined have Theta (n log n) running time.

// Consider the i and j loops. Since j depends on i, we need to compute the running time of these two loops together.

// for i = 1, how many times will the j loop execute? 0.
// for i = 2, how many times will the j loop execute? 1.
// for i = 3, how many times will the j loop execute? 2.
// ...
// for i = n, how many times will the j loop execute? n - 1.
// To get the running time of both loops, we need to sum up 0 + 1 + 2 + ... + (n-1) =
// (n-1)*n / 2 =  Theta(n^2)

// The total running time of func1 is Theta(n log n) + Theta (n^2) = Theta(n^2).

// (b) Theta(n^4).
// Explanation:
// sum = sum + k + func1(n); has the running time Theta(n^2) becase this is the running time func1(n) from
// question 1a.
// The i loop executes n times, and the k loop executes n times (going backwards). Since they are nested,
// and k does not depend on i, we can the total number of iterations of both loops by
// multiplying n * n = n^2.
// Since the running time of sum = sum + k + func1(n); is Theta(n^2), the total running time of func2  is
// Theta(n^4).

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
