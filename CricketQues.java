package Marks35;
import java.util.*;

public class CricketQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt(); sc.nextLine();
        Cricketer[] cr = new Cricketer[size];

        for(int i=0; i<size; i++) {
            int cricId = sc.nextInt(); sc.nextLine();
            int matchPlayed = sc.nextInt(); sc.nextLine();
            int totalRun = sc.nextInt(); sc.nextLine();
            String cricName = sc.nextLine();
            String team = sc.nextLine();

            cr[i] = new Cricketer(cricId, matchPlayed, totalRun, cricName, team);
        }
        int cricId = sc.nextInt(); sc.nextLine();

        Cricketer minCric = findCricketerWithMinimum(cr);
        System.out.println(minCric.getCricId() + " " + minCric.getMatchPlayed());

        Cricketer searchId = searchCricketerByld(cr, cricId);
        if(searchId != null)System.out.println(searchId.getCricId() + " " + searchId.getCricName());
        else System.out.println("No such Cricketer");
    }


    public static Cricketer findCricketerWithMinimum(Cricketer[] cr){
        Cricketer min = cr[0];
        for(int i=1; i<cr.length; i++) {
            if(min.getMatchPlayed() > cr[i].getMatchPlayed())
                min = cr[i];
        }
        return min;
    }


    public static Cricketer searchCricketerByld(Cricketer[] cr, int cricId) {
        Cricketer temp = null;
        for(int i=0; i<cr.length; i++) {
            if(cr[i].getCricId() == cricId)
                return cr[i];
        }
        return temp;
    }
}


class Cricketer {
    int cricId;
    int matchPlayed;
    int totalRun;
    String cricName;
    String team;

    public Cricketer(int cricId, int matchPlayed, int totalRun, String cricName, String team) {
        this.cricId = cricId;
        this.matchPlayed = matchPlayed;
        this.totalRun = totalRun;
        this.cricName = cricName;
        this.team = team;
    }

    public int getCricId() {
        return cricId;
    }

    public int getMatchPlayed() {
        return matchPlayed;
    }

    public int getTotalRun() {
        return totalRun;
    }

    public String getCricName() {
        return cricName;
    }

    public String getTeam() {
        return team;
    }
}
