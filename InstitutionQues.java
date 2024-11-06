package Marks35;
import java.util.*;

public class InstitutionQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Institution[] It = new Institution[4];
        for(int i=0; i<4; i++) {
            int institutionId = sc.nextInt(); sc.nextLine();
            String institutionName = sc.nextLine();
            int noOfStudentsPlaced = sc.nextInt(); sc.nextLine();
            int noOfStudentsCleared = sc.nextInt(); sc.nextLine();
            String location = sc.nextLine();

            It[i] = new Institution(institutionId, institutionName, noOfStudentsPlaced, noOfStudentsCleared, location);
        }
        String location = sc.nextLine();
        String institutionName = sc.nextLine();


        int sum = FindNumClearancedByLoc(It, location);
        if(sum > 0) System.out.println(sum);
        else System.out.println("There are no cleared students in this particular location");

        Institution result = UpdateInstitutionGrade(It, institutionName);

        if(result != null)System.out.println(result.getInstitutionName() + "::" + result.getGrade());
        else System.out.println("No Institution is available with the specified name");
    }

    public static int FindNumClearancedByLoc(Institution[] It, String location) {
        int sum = 0;
        for(int i=0; i<It.length; i++) {
            if(It[i].getLocation().equals(location))
            {
                sum += It[i].getNoOfStudentsCleared();
            }
        }
        return sum;
    }
    public static Institution UpdateInstitutionGrade(Institution[] It, String institutionName) {
        Institution temp = null;
        for(int i=0; i<It.length; i++) {
            if(It[i].getInstitutionName().equals(institutionName)) {
                int rating = (It[i].getNoOfStudentsPlaced()*100)/It[i].getNoOfStudentsCleared();
                if(rating >= 80) It[i].setGrade("A");
                else It[i].setGrade("B");

                return It[i];
            }
        }
        return temp;
    }
}


class Institution {
    int institutionId;
    String institutionName;
    int noOfStudentsPlaced;
    int noOfStudentsCleared;
    String location;
    String grade;

    Institution(int institutionId, String institutionName, int noOfStudentsPlaced, int noOfStudentsCleared, String location){
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.location = location;
    }

    public int getInstitutionId() {
        return this.institutionId;
    }
    public String getInstitutionName() {
        return this.institutionName;
    }
    public int getNoOfStudentsPlaced() {
        return this.noOfStudentsPlaced;
    }
    public int getNoOfStudentsCleared() {
        return this.noOfStudentsCleared;
    }
    public String getLocation() {
        return this.location;
    }
    public String getGrade() {
        return this.grade;
    }

    void setGrade(String grade) {
        this.grade = grade;
    }
}