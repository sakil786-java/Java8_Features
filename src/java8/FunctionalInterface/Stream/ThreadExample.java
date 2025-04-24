package java8.FunctionalInterface.Stream;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {

        Thread t1=new Thread(()->{
            for(int i=0;i<=10;i+=2)
            {

                System.out.println(i+" ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2=new Thread(()->{
            for(int i=1;i<=10;i+=2)
            {

                System.out.println(i+" ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        t1.join();
        t2.start();

    }
}
