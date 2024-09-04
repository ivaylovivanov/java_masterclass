public class JM107Movie {
    private String title;

    public JM107Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " movie");
    }

    public static JM107Movie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new JM107Movie(title);
        };
    }
}

class Adventure extends JM107Movie{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Pleasant Scene", "Scary Music", "Something bad happens");
    }
}

class Comedy extends JM107Movie{
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Something funny happens", "Something even funnier happens", "Happy ending");
    }
}

class ScienceFiction extends JM107Movie{
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Bad aliens do bad stuff", "Space guys chase aliens", "Planet blows up");
    }
}

