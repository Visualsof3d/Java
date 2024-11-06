package Marks35;
import java.util.*;

public class AssociateQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); sc.nextLine();

        Associate[] ass = new Associate[size];
        for(int i=0; i<size; i++) {
            int id = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            double scores = sc.nextDouble(); sc.nextLine();
            int experience = sc.nextInt(); sc.nextLine();

            ass[i] = new Associate(id, name, scores, experience);
        }

        double scores = sc.nextDouble(); sc.nextLine();
        Associate foundAss = searchAssociateByScores(ass, scores);
        Associate maxExp = findAssociateWithMaxExperience(ass);

        if(foundAss != null) System.out.println(foundAss.getId() + " " + foundAss.getName());
        else System.out.println("No Associate found with mentioned scores");

        System.out.println(maxExp.getId());
    }

    public static Associate searchAssociateByScores(Associate[] ass, double scores) {
        Associate temp = null;
        for(int i=0; i<ass.length; i++) {
            if(ass[i].getScores() == scores) return ass[i];
        }
        return temp;
    }

    public static Associate findAssociateWithMaxExperience(Associate[] ass) {
        Associate temp = ass[0];
        for(int i=1; i<ass.length; i++) {
            if(ass[i].getExperience() >  temp.getExperience()) temp = ass[i];
        }
        return temp;
    }
}

class Associate {
    int id;
    String name;
    double scores;
    int experience;

    Associate(int id, String name, double scores, int experience) {
        this.id = id;
        this.name = name;
        this.scores = scores;
        this.experience = experience;
    }

    int getId() {return this.id;}
    String getName() {return this.name;}
    double getScores() {return this.scores;}
    int getExperience() {return this.experience;}
}
