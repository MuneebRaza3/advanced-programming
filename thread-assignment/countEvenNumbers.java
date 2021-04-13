public class countEvenNumbers extends Thread{
    @Override
    public void run() {
        int count = 0;

        for(int i = 1; i <= 10000; i++){
            if(i % 2 == 0) {
                count += 1;
            }
        }

        System.out.println("Total number of even:" + count);
    }
}
