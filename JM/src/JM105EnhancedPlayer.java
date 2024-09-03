public class JM105EnhancedPlayer {
    private String fullName;
    private int healthPercentage;
    private String weapon;

    public JM105EnhancedPlayer(String fullName) {
        this(fullName, 100, "Sword");
    }

    public JM105EnhancedPlayer(String fullName, int healthPercentage, String weapon) {
        this.fullName = fullName;
        if(healthPercentage <= 0) {
            this.healthPercentage = 1;
        } else if(healthPercentage > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = healthPercentage;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        healthPercentage -= damage;

        if (healthPercentage <= 0) {
            System.out.println("PLayer was knocked out of the game");
        }
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth){
        healthPercentage += extraHealth;
        if (healthPercentage > 100) {
            healthPercentage = 100;
            System.out.println("Please has been restored to full health");
        }
    }
}
