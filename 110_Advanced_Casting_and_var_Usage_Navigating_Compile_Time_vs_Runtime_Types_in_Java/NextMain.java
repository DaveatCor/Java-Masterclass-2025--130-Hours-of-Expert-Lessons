public class NextMain {
    public static void main(String[] args) {
        Movie110 movie110 = Movie110.getMovie110("A", "Jaws");
        movie110.watchMovie();

        Adventure110 jaws = (Adventure110) Movie110.getMovie110("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie110.getMovie110("C", "Airplane");
        Comedy110 comedyMovie = (Comedy110) comedy;
        comedyMovie.watchMovie();

        var airplane = Movie110.getMovie110("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy110("Airplane");
        plane.watchMovie();
    }
}
