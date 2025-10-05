public class Movie111 {
    private String title;

    public Movie111(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie111 getMovie111(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure111(title);
            case 'C' -> new Comedy111(title);
            case 'S' -> new ScienceFiction111(title);
            default -> new Movie111(title);
        };
    }
}

class Adventure111 extends Movie111 {
    public Adventure111(String title) {
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

class Comedy111 extends Movie111 {
    public Comedy111(String title) {
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

class ScienceFiction111 extends Movie111 {
    public ScienceFiction111(String title) {
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