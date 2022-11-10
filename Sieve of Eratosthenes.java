public class Sieve_of_Eratosthenes {
    public static void createSieve(){        
        int n = 1000000;
        boolean[] sieve = new boolean[1000001];
        for(int i = 2; i <= n; i++){
            sieve[i] = true;
        }
        for(int i = 2; i*i <= n; i++){
            if(sieve[i] == true){
                for(int j = i*i; j <= n; j+=i){
                    sieve[j] = false;
                }
            }
        }
    }
    public static void countPrimes(int n) {
        createSieve();
    }
    public static void main(String[] args) {
        int n = 100;
        countPrimes(n);
    }
}
