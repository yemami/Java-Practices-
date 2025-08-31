public class LambdaExample {
    public static void main(String[] args) {
        // old way of approach without lambda
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running task with old approach");
            }
        };

        task1.run();
    }
}
