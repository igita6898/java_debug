package cn.lcola.sbus.api.service.ad;

public class Consumer implements Runnable{

    private Fridge fridge;

    public Consumer(Fridge fridge){
        this.fridge = fridge;
    }
    @Override
    public void run() {
        while (true){
            fridge.get();
        }
    }
}
