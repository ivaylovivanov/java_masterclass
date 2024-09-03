public class Main {
    public static void main(String[] args) {

        JM104Player player = new JM104Player();
        player.fullName  = "Ivo";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health: " + player.health);
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health: " + player.health);
    }
}