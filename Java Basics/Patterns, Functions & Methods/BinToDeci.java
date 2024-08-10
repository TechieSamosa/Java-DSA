public class BinToDeci {
    public static void binToDeci(int n) {
        int demo = n;
        int bin = 0;
        int pow = 0;
        while (n > 0) {
            int rem = n % 2;
            bin = bin + (rem * (int)(Math.pow(10, pow)));
            n = n / 2;
            pow++;
        }
        System.out.println("The binary of the given decimal " + demo + " is " + bin);        
    }
    public static void main(String[] args) {
        binToDeci(629);
    }
}

