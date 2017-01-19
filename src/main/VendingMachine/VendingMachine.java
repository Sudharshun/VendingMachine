import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    String name;
    List<Item> inventory;

    public VendingMachine(String nameOfMachine) {
        this.name = nameOfMachine;
        this.inventory = new ArrayList<Item>();
    }


    public void addItem(String item, int qty, double price) {
        if (null != getItem(item)) {
            getItem(item).quantity += qty;
        } else {
            Item itemToAdd = new Item(item, qty, price);
            this.inventory.add(itemToAdd);
        }
    }

    public boolean isEmpty() {
        return (this.inventory.isEmpty());
    }

    public void vend(String item) {
        if(null!=getItem(item)){
            getItem(item).quantity--;
        }
    }

    public int getCount(String item) {
        if(null==getItem(item)) {
            return 0;
        }
      return getItem(item).quantity;
    }


    public Item getItem(String item) {
        for (int i = 0; i < this.inventory.size(); i++) {
            if (this.inventory.get(i).description == item) {
                return this.inventory.get(i);
            }
        }
        return null;
    }

    public void remove(String item) {
        this.inventory.remove(getItem(item));
    }

    public double getTotalValue() {
        double totVal = 0.0;
        for (int i = 0; i < this.inventory.size(); i++) {
            totVal += this.inventory.get(i).price * this.inventory.get(i).quantity;
        }
        return totVal;
    }
}
