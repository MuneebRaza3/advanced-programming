
public class countPrimeNumbers extends Thread {
    private boolean isPrime(int num) {
        if(num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        int count = 0;
        for (int i = 1; i <= 10000; i++) {
            if(isPrime(i)) {
                count += 1;
            }
        }
        System.out.println("Total number of prime:" + count);
    }
}
