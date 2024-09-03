public class JM104Player {
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        health -= damage;

        if (health <= 0) {
            System.out.println("PLayer was knocked out of the game");
        }
    }

    public int healthRemaining(){
        return health;
    }

    public void restoreHealth(int extraHealth){
        health += extraHealth;
        if (health > 100) {
            health = 100;
            System.out.println("Please has been restored to full health");
        }
    }
}
