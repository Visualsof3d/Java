package Marks35;
import java.util.*;

public class MovieQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Movie[] mov = new Movie[4];

        for(int i=0; i<4; i++) {
            String movieName = sc.nextLine();
            String company = sc.nextLine();
            String genre = sc.nextLine();
            int budget = sc.nextInt(); sc.nextLine();

            mov[i] = new Movie(movieName, company, genre, budget);
        }
        String searchGenre = sc.nextLine();
        Movie[] arr = getMovieByGenre(mov, searchGenre);

        for(int i=0; i<arr.length; i++) {
            if(arr[i].getBudget() > 80000000) System.out.println("High Budget Movie");
            else System.out.println("Low Budget Movie");
        }
    }

    public static Movie[] getMovieByGenre (Movie[] mov, String searchGenre) {
        Movie[] arr = new Movie[0];

        for(int i=0; i<mov.length; i++) {
            if(mov[i].getGenre().equals(searchGenre)){
                arr = Arrays.copyOf(arr, arr.length+1);
                arr[arr.length-1] = mov[i];
            }
        }

        return arr;
    }
}

class Movie {
    String movieName;
    String company;
    String genre;
    int budget;

    Movie(String movieName, String company, String genre, int budget) {
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    String getMovieName () { return this.movieName; }
    String getCompany () { return this.company; }
    String getGenre () { return this.genre; }
    int getBudget () { return this.budget; }
}