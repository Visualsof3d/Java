package Marks35;
import java.util.*;

public class PhoneQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] ph = new Phone[4];

        for(int i=0; i<4; i++) {
            int phoneId = sc.nextInt(); sc.nextLine();
            String OS = sc.nextLine();
            String brand = sc.nextLine();
            int price = sc.nextInt(); sc.nextLine();

            ph[i] = new Phone(phoneId, OS, brand, price);
        }
        String brand = sc.nextLine();
        String OS = sc.nextLine();

        int ansPrice = findPriceForGivenBrand(ph, brand);
        Phone result = getPhoneIdBasedOnOs(OS, ph);

        System.out.println();

        if(ansPrice <= 0) System.out.println("The given Brand is not available");
        else System.out.println(ansPrice);

        if(result == null) System.out.println("No phones are available with specified os and getPrice range");
        else System.out.println(result.getPhoneId());
    }

    public static int findPriceForGivenBrand(Phone[] ph, String brand) {
        int price = 0;
        for(int i=0; i<ph.length; i++) {
            if(ph[i].getBrand().equals(brand))
                price += ph[i].getPrice();
        }
        return price;
    }

    public static Phone getPhoneIdBasedOnOs(String OS, Phone[] ph) {
        Phone temp = null;
        for(int i=0; i<ph.length; i++) {
            if(ph[i].getOS().equals(OS) && ph[i].getPrice() >= 50000)
                return ph[i];
        }
        return temp;
    }
}

class Phone {
    int phoneId;
    String OS;
    String brand;
    int price;

    Phone(int phoneId, String OS, String brand, int price) {
        this.phoneId = phoneId;
        this.OS = OS;
        this.brand = brand;
        this.price = price;
    }


    public int getPhoneId() {
        return this.phoneId;
    }
    public String getOS() {
        return this.OS;
    }
    public String getBrand() {
        return this.brand;
    }
    public int getPrice() {
        return this.price;
    }
}

/*
111
iOS
Apple
30000
222
android
Samsung
50000
333
Symbian
HTC
12000
444
Paranoid
HTC
89000
Blackberry
android
 */