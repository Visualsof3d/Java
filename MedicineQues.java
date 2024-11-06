package Marks35;
import java.util.*;

public class MedicineQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Medicine[] med = new Medicine[4];
        for(int i=0; i<4; i++) {
            String medName = sc.nextLine();
            String batch = sc.nextLine();
            String disease = sc.nextLine();
            int price = sc.nextInt(); sc.nextLine();

            med[i] = new Medicine(medName, batch, disease, price);
        }
        String disease = sc.nextLine();

        ArrayList<Integer> arrPrice = new ArrayList<Integer>();
        Medicine[] arr = getPriceByDisease(med, disease);
        for(int i=0; i<arr.length; i++) {
            arrPrice.add(arr[i].getPrice());
        }
        for(int i=0; i<arrPrice.size(); i++) {
            System.out.println(arrPrice.get(i));
        }
    }
    public static Medicine[] getPriceByDisease(Medicine[] med, String disease) {
        Medicine[] arr = new Medicine[0];

        for(int i=0; i<med.length; i++) {
            if(med[i].getDisease().equals(disease)){
                arr = Arrays.copyOf(arr, arr.length+1);
                arr[arr.length-1] = med[i];
            }
        }
        return arr;
    }
}

class Medicine {
    String medName;
    String batch;
    String disease;
    int price;

    Medicine(String medName, String batch, String disease, int price) {
        this.medName = medName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    String getMedName() { return this.medName; }
    String getBatch() { return this.batch; }
    String getDisease() { return this.disease; }
    int getPrice() { return this.price; }
}
