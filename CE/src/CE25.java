public class CE25 {

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
