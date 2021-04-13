public class main {
    public static void main(String[] args) throws Exception {
        countEvenNumbers even = new countEvenNumbers();
        countPrimeNumbers prime = new countPrimeNumbers();

        prime.setName("Thread for prime numbers");
        even.setName("Thread for even numbers");
        prime.start();
        even.start();
        prime.join();
        even.join();
    }
}