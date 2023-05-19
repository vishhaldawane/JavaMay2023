public class InterThreadCommunicationTest {
    public static void main(String[] args) {
        FoodItem food = new FoodItem("Pizza");
        Producer prod = new Producer(food);
        Consumer cons = new Consumer(food);

        cons.start();
        prod.start();

    }
}
class Producer extends Thread {
    FoodItem ref;

    public Producer(FoodItem ref) {
        this.ref = ref;
    }

    void produce() {
        ref.served();
    }
    public void run() {
        produce();
    }
}
class Consumer extends Thread {
    FoodItem ref;

    public Consumer(FoodItem ref) {
        this.ref = ref;
    }

     void consume() {
        ref.eat();
    }
    public void run() {
        consume();
    }
}

class FoodItem
{
    String foodItemName;

    boolean isProduced;

    public FoodItem(String foodItemName) {
        this.foodItemName = foodItemName;
    }
    synchronized  void eat() {// Consumer
        if(isProduced==false) {
            System.out.println("Waiting for "+foodItemName+" to be produced....");
            try {
                wait(); // super class Object's method
            	//Thread.sleep(1);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consuming...."+foodItemName);
    }
    synchronized void served() { //Producer
        if(isProduced==false) {
            System.out.println("Producing..." + foodItemName);
            isProduced = true;
            notify(); //notifies the waiting thread...
        }
    }
}