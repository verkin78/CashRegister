import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Offer {
    private String buyerName;


    private Queue<String> queue1 = new LinkedList<>(5);
    private Queue<String> queue2 = new LinkedList<>(5);

       public void addBuyer() {
           String buyerName;
        queue1.offer(this.buyerName);
        queue2.offer(this.buyerName);
    }

    public void formQueue() {
        queue1.spliterator();
        queue2.spliterator();
        if (queue1.equals(queue2)) {
            addBuyer();
        } else {
            addBuyer(toString(buyerName));
            System.out.println("В очереди на первой кассе: " + queue1.poll() + buyerName);
            System.out.println("В очереди на первой кассе: " + queue2.poll() + buyerName);
            System.out.println("Позовите Галю.");
        }

   public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        if (buyerName == null || buyerName.isEmpty()) {
            System.out.println(IllegalAccessError"Неверный параметр");
        } else {
            this.buyerName = buyerName;
        }
    }
    }

    @Override
    public String toString() {
        return "Offer{" +
                "buyerName='" + buyerName + '\'' +
                ", queue1=" + queue1 +
                ", queue2=" + queue2 +
                '}';
    }
}


