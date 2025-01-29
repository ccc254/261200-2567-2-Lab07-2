public class Character {
    private int health;
    private int stamina;
    private final int maxHealth;
    private final int maxStamina;


    public Character(int maxHealth, int maxStamina) {
        if (maxHealth <= 0 || maxStamina <= 0) {
            System.out.println("Health and Stamina must be positive.");
            this.maxHealth = 0;
            this.maxStamina = 0;
            this.health = 0;
            this.stamina = 0;
            return;
        }

        this.maxHealth = maxHealth;
        this.maxStamina = maxStamina;
        this.health = maxHealth;
        this.stamina = maxStamina;


        System.out.println("Character created with " + maxHealth + " health and " + maxStamina + " stamina.");
    }

    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public void swingSword() {
        if (maxHealth <= 0 || maxStamina <= 0) {
            return;
        }
        if (stamina >= 10) {
            stamina -= 10;
            System.out.println("Character swings sword. Stamina is now " + stamina + ".");
        } else {
            stamina = 0;
            System.out.println("Your character needs to cool down.");
        }
    }

    public void takeDamage(int damageAmount) {
        if (maxHealth <= 0 || maxStamina <= 0) {
            return;
        }
        health -= damageAmount;
        if (health <= 0) {
            health = 0;
            System.out.println("Character takes " + damageAmount + " damage. Health is now " + health + ".");
            System.out.println("Character is dead.");
        } else {
            System.out.println("Character takes " + damageAmount + " damage. Health is now " + health + ".");
        }
    }

    public void rest() {
        if (maxHealth <= 0 || maxStamina <= 0) {
            return;
        }
        health = maxHealth;
        stamina = maxStamina;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
    }

    public void status() {
        if (maxHealth <= 0 || maxStamina <= 0) {
            return;
        }
        health = maxHealth;
        stamina = maxStamina;
        System.out.println("Character's health: " + getHealth() + ", stamina: " + getStamina() + ".");
    }
}
