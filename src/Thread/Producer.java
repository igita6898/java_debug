package cn.lcola.sbus.api.service.ad;

public class Producer implements Runnable{
   private Fridge fridge;

   public Producer(Fridge fridge){
       this.fridge = fridge;
   }

    @Override
    public void run() {
        for (int milk = 1; milk<= 5; milk++){
            fridge.put(milk);
        }
    }
}
