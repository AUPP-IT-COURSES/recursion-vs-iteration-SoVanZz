public class recursion {
    public static void main(String[] args) {
        double[] xValues = {2.0, 3.0, 5.0, 6.0}; // Example x values
        int[] nValues = {5, 3, 4, 2};           // Example n values

    //call your recursion fuction
            double x = xValues[i];
            int n = nValues[i];

            // Call your recursion function
            double result = recursionFunction(x, n);

            // Print the result
            System.out.println(x + " to the power of " + n + " is:  " + result);
        }
    }

    public static double recursionFunction(double x, int n) {
        // Base case: x^0 is always 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: x^n = x * x^(n-1)
        else {
            return x * recursionFunction(x, n - 1);
        }
    }
}
