public class JM53 {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));

    }

    public static String getDurationString(int seconds){

        if (seconds < 0){
            return "Invalid Value for Seconds";
        }

        int minutes = seconds / 60;
        seconds %= 60;
        return getDurationString(minutes, seconds);

    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0){
            return "Invalid Value for Minutes";
        } else if (seconds < 0){
            return "Invalid Value for Seconds";
        }

        if (seconds > 59){
            minutes += seconds / 60;
            seconds %= 60;
        }

        int minutesRemaining = minutes % 60;
        int hours = minutes / 60;

        return hours + "h " + minutesRemaining + "m " + seconds  + "s";
    }
}
