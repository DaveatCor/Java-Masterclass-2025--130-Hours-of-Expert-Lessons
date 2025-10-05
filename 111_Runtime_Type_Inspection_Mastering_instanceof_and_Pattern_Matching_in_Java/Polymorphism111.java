import java.util.Scanner;

public class Polymorphism111 {
    public static void main(String[] args) {
        // Movie109 theMovie = Movie109.getMovie109("Adventure", "Start Wars");
        // theMovie.watchMovie();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Type (A for Adventure, C for Comedy, " + "S for Science Fiction, or Q to Quit");
            String type = scanner.nextLine();
            if ("Qq".contains(type)) {
                break;
            }

            System.out.println("Enter Movie Title: ");
            String title = scanner.nextLine();
            Movie111 movie109 = Movie111.getMovie111(type, title);
            movie109.watchMovie();
        }
    }
}
