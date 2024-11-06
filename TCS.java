package Marks35;

import java.util.*;

public class TCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TravelAgencies[] arr = new TravelAgencies[4];

        for(int i=0; i<4; i++) {
            int regNo = sc.nextInt(); sc.nextLine();
            String agencyName = sc.nextLine();
            String packageName = sc.nextLine();
            int price = sc.nextInt(); sc.nextLine();
            boolean flightFacility = sc.nextBoolean(); sc.nextLine();

            arr[i] = new TravelAgencies(regNo, agencyName, packageName, price, flightFacility);
        }

        int regNo = sc.nextInt(); sc.nextLine();
        String packageName = sc.nextLine();

        int maxPrice = findAgencyWithHighestPackagePrice(arr);
        TravelAgencies result = agencyDetailsForGivenldAndType(arr, regNo, packageName);

        System.out.println();
        System.out.println(maxPrice);
        if(result == null) return;
        System.out.println(result.getAgencyName() + " : " + result.getPrice());
    }

    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] arr) {
        int maxPrice = 0;
        for(int i=0; i<arr.length; i++) {
            int p = arr[i].getPrice();
            if(maxPrice < p)
                maxPrice = p;
        }
        return maxPrice;
    }

    public static TravelAgencies agencyDetailsForGivenldAndType(TravelAgencies[] arr, int regNo, String packageType){
        for(int i=0; i<arr.length; i++) {
            if(arr[i].getFlightFacility()){
                if(arr[i].getRegNo() == regNo && arr[i].getPackageType().equals(packageType)){
                    return arr[i];
                }
            }
        }
        return null;
    }
}

class TravelAgencies {
    int regNo;
    String agencyName;
    String packageType;
    int price;
    boolean flightFacility;

    public int getRegNo() {
        return this.regNo;
    }
    public String getAgencyName() {
        return this.agencyName;
    }
    public String getPackageType() {
        return this.packageType;
    }
    public int getPrice() {
        return this.price;
    }
    public boolean getFlightFacility() {
        return this.flightFacility;
    }


    TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }
}