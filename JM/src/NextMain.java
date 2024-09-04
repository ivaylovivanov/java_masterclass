public class NextMain {
    public static void main(String[] args) {
        JM107Movie movie = JM107Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) JM107Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = JM107Movie.getMovie("C", "Airplane");
        Comedy justCOmedy = (Comedy) comedy;
        justCOmedy.watchMovie();

        var airplane = JM107Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();
    }
}
