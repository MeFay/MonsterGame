public class Monster {
    private String name;
    private int health;
    private int attackDamage;
    private int consecutiveAttacks = 0;

    Monster(String name, int health, int damage, int consecutiveAttacks) {
        this.name = name;
        this.health = health;
        this.attackDamage = damage;
        this.consecutiveAttacks = consecutiveAttacks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getConsecutiveAttacks() {
        return consecutiveAttacks;
    }

    public void setConsecutiveAttacks(int consecutiveAttacks) {
        this.consecutiveAttacks = consecutiveAttacks;
    }

    public void displayHealth() {
        System.out.println("This creature current HP is: " + health + " 🫀");
    }

    public void attack(Monster attackingMonster,Monster defendingMonster) {
        defendingMonster.takeDamage(attackingMonster.getAttackDamage());
        consecutiveAttacks++;
    }

    public void takeDamage(int attackDamage) {
        health = health - attackDamage;
        System.out.println("Oh no, this creature took 4 hp damage!🩸This creature current HP is: " + health);
    }
}
