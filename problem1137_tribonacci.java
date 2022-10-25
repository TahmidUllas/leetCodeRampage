public class problem1137_tribonacci {
    public static int tribonacci(int n) {
        return n < 1
                ? 0
                : n == 1 || n == 2
                ? 1
                : tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }
}
