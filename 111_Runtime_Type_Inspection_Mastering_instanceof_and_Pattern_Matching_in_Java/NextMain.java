public class NextMain {
    public static void main(String[] args) {
        Movie111 movie111 = Movie111.getMovie111("A", "Jaws");
        movie111.watchMovie();

        Adventure111 jaws = (Adventure111) Movie111.getMovie111("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie111.getMovie111("C", "Airplane");
        Comedy111 comedyMovie = (Comedy111) comedy;
        comedyMovie.watchMovie();

        var airplane = Movie111.getMovie111("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy111("Airplane");
        plane.watchMovie();

        Object unknownObject = Movie111.getMovie111("C", "Airplane");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy111 c = (Comedy111) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure111) {
            ((Adventure111) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction111 syfy) {
            syfy.watchScienceFiction();
        }
    }
}
