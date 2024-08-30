public class CE12 {

    public static boolean isCatPlaying(boolean summer, int temperature){
        int upperLimit = summer ? 45 : 35;
        int lowerLimit = 25;

        return temperature >= lowerLimit && temperature <= upperLimit;
    }
}
