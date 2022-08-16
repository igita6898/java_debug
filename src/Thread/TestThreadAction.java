
public class TestThreadAction {

    public static void main(String[] args){
        Fridge fridge = new Fridge();
        Producer producer = new Producer(fridge);
        Consumer consumer = new Consumer(fridge);

        Thread thread1 = new Thread(producer, "生产者");
        Thread thread2 = new Thread(consumer, "消费者");
        thread1.start();
        thread2.start();


    }
}
