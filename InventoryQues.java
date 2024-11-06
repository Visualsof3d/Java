package Marks35;
import java.util.*;

public class InventoryQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Inventory[] Inv = new Inventory[4];
        for(int i=0; i<4; i++) {
            String inventoryId = sc.nextLine();
            int maxQuantity = sc.nextInt(); sc.nextLine();
            int currQuantity = sc.nextInt(); sc.nextLine();
            int threshold = sc.nextInt(); sc.nextLine();

            Inv[i] = new Inventory(inventoryId, maxQuantity, currQuantity, threshold);
        }
        int limit = sc.nextInt(); sc.nextLine();

        Inventory[] arr = Replenish(Inv, limit);

        for(int i=0; i<arr.length; i++) {
            int thres = arr[i].getThreshold();
            String id = arr[i].getInventoryId();

            if(thres > 75) System.out.println(id + " Critical Filling");
            else if(thres <= 75 && thres >= 50) System.out.println(id + " Moderate Filling");
            else System.out.println(id + " Non-Critical Filling");
        }
    }

    public static Inventory[] Replenish(Inventory[] Inv, int limit) {
        Inventory[] arr = new Inventory[0];

        for(int i=0; i<Inv.length; i++) {
            if(Inv[i].getThreshold() <= limit){
                arr = Arrays.copyOf(arr, arr.length+1);
                arr[arr.length-1] = Inv[i];
            }
        }
        return arr;
    }
}

class Inventory {
    String inventoryId;
    int maxQuantity;
    int currQuantity;
    int threshold;

    Inventory(String inventoryId, int maxQuantity, int currQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maxQuantity = maxQuantity;
        this.currQuantity = currQuantity;
        this.threshold = threshold;
    }

    String getInventoryId() { return this.inventoryId; }
    int getMaxQuantity() { return this.maxQuantity; }
    int getCurrQuantity() { return this.currQuantity; }
    int getThreshold() { return this.threshold; }
}
