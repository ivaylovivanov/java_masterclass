import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        JM107Movie movie = JM107Movie.getMovie("Science Fiction", "Star Wars");
//        movie.watchMovie();


        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter Type ( A for Adventure, C for Comedy, S for Science Fiction, or Q to Quit");
            String type = scanner.nextLine();
            if("Qq".contains(type)){
                break;
            }

            System.out.print("Enter movie title: ");
            String title = scanner.nextLine();
            JM107Movie movie = JM107Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}