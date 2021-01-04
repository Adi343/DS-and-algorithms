
class pow {
    public static void main(String[] args) {
        double x = 3;
        int n = 5;
        System.out.println("ans is " + myPow(x, n));
    }

    public static double myPow(double x, int n) {
        double res = x;
        if (n == 1) {
            return res;
        } else {
            n--;
            return res * myPow(x, n);
        }
    }
}