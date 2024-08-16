public class CE25 {
    public static void main(String[] args) {
//        System.out.println(canPack (1, 0, 4)); //should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
//        System.out.println(canPack (1, 0, 5)); //should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
//        System.out.println(canPack (0, 5, 4)); //should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.
//        System.out.println(canPack (2, 2, 11)); //should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos.
//        System.out.println(canPack (-3, 2, 12)); //should return false since bigCount is negative.
        System.out.println(canPack (0, 5, 5)); //should return false since bigCount is negative.
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if ((bigCount * 5) + smallCount < goal) {
            return false;
        }

        //check if we have enough bigBags to fully cover the goal
        if (goal / 5 <= bigCount && goal % 5 <= smallCount){
            //System.out.println("We have " + bigCount + " big bags and " + smallCount + " small bags and need " + goal / 5 + " big bags and " + goal % 5 + " small bags to cover the whole package.");
            return true;
        }

        if (goal / 5 >= bigCount && goal % 5 > 0){
            //System.out.println("We have " + bigCount + " big bags and " + smallCount + " small bags and need " + goal / 5 + " big bags and " + goal % 5 + " small bags to cover the whole package.");
            int kgLeft = goal % 5;
            return smallCount >= kgLeft;
        }

        return false;
    }
}
