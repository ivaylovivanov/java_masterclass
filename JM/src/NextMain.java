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

        Object unknownObject = JM107Movie.getMovie("S", "Star Wars");
        if (unknownObject.getClass().getSimpleName().equals("Comedy")) {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction scienceFiction) {
            scienceFiction.watchScienceFiction();
        }
    }
}
