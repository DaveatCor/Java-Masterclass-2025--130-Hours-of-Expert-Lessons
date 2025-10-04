public class Movie110 {
    private String title;

    public Movie110(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie110 getMovie110(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure110(title);
            case 'C' -> new Comedy110(title);
            case 'S' -> new ScienceFiction109(title);
            default -> new Movie110(title);
        };
    }
}

class Adventure110 extends Movie110 {
    public Adventure110(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Pleasant Scene", "Scary Music", "Something Bad Happens");
    }

    public void watchAdventure() {
        System.out.println("Watching an Adventure!");
    }
}

class Comedy110 extends Movie110 {
    public Comedy110(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Something funny happens", "Something even fi happens",
                "Something Bad Happens");
    }

    public void watchComedy() {
        System.out.println("Watching an Comedy!");
    }
}

class ScienceFiction109 extends Movie110 {
    public ScienceFiction109(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Bad Aliens do Bad Stuff", "Space Guys Chase Aliens",
                "Something Blow Up");
    }

    public void watchScienceFiction() {
        System.out.println("Watching an ScienceFiction!");
    }
}