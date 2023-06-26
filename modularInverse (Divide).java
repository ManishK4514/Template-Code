static int nCr(int n, int r) {
        if (n == r) return 1;
        if (r > n) return 0;
        long a = factorial(n);
        long b = (factorial(r) * factorial(n - r)) % mod;
        long inverseB = modularInverse(b);
        long result = (a * inverseB) % mod;
        return (int) result;
    }

    static long modularInverse(long n) {
        return power(n, mod - 2);
    }

    static long power(long x, long y) {
        if (y == 0) return 1;
        long temp = power(x, y / 2) % mod;
        long result = (temp * temp) % mod;
        if (y % 2 == 1) result = (result * x) % mod;
        return result;
    }
