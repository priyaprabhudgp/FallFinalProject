public class Monster {
    private String name;
    private int health;
    private String attackName;
    private String attack;
    public int attackPower;
    public String monsterImage;

    public Monster(String name, int health, String attack, String attackName) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.attackName = attackName;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void updateHealth(int damage) {
        health -= damage;
    }

    public String getAttack() {
        return attack;
    }

    public String getAttackName() {
        return attackName;
    }



}
