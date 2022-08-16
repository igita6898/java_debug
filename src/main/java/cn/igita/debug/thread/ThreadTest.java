package cn.igita.debug.thread;

public class ThreadTest {
    public static class Test {

        public static void main(String[] args){

            System.out.println("Starting ... ");
            DebugThread d1 = new DebugThread();
            new Thread(d1,"t1").start();
            new Thread(new DebugThread(),"t2").start();
            new Thread(new DebugThread(), "t3").start();


        }


        public static class DebugThread implements Runnable {
            String t = "hello world";
            @Override
            public void run() {

                System.out.println(Thread.currentThread().getName() + "进入了...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "退出了...");
            }
        }

    }
}
