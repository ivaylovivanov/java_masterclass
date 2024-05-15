public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        if((a*-1>0 && b*-1<0) || (a*-1<0 && b*-1>0)){
            return false;
        }

        int intA = (int)(a*1000);
        int intB = (int)(b*1000);

        return intA==intB;
    }
}
