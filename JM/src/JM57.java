public class JM57 {
    public static void main(String[] args) {
        System.out.println("XYZ is in " + getQuarter("XYZ"));
    }

    public static String getQuarter(String month){

        return switch(month){
            case "JAN", "FEB", "MAR" -> "Quarter 1";
            case "APR", "MAY", "JUN" -> "Quarter 2";
            case "JUL", "AUG", "SEP" -> "Quarter 3";
            case "OCT", "NOV", "DEC" -> "Quarter 4";
            default -> {
                yield "Bad Input";
            }
        };
    }
}
