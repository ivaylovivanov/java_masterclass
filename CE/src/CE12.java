public class CE12 {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        int upperLimit = summer ? 45 : 35;
        int lowerLimit = 25;

        return temperature >= lowerLimit && temperature <= upperLimit;
    }
}
