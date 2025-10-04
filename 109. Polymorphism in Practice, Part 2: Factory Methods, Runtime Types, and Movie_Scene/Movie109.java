public class Movie109 {
    private String title;

    public Movie109(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie109 getMovie109(String type, String title){
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adenture109(title);
            case 'C' -> new Comedy109(title);
            case 'S' -> new ScienceFiction109(title);
            default -> new Movie109(title)
        }
    }
}

class Adenture109 extends Movie109 {
    public Adenture109(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Pleasant Scene", "Scary Music", "Something Bad Happens");
    }
}

class Comedy109 extends Movie109 {
    public Comedy109(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Something funny happens", "Something even fi happens",
                "Something Bad Happens");
    }
}

class ScienceFiction109 extends Movie109 {
    public ScienceFiction109(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Bad Aliens do Bad Stuff", "Space Guys Chase Aliens",
                "Something Blow Up");
    }
}