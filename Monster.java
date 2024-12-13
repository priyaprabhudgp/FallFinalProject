public class Monster {
    private String name;
    private int health;
    private int damage;
    private String attack;
    private String attackName;

    public String monsterImage;

    public Monster(String name, int health, String attack, String attackName) {
        this.name = name;
        this.health = health;
        damage = 0;
        this.attack = attack;
        this.attackName = attackName;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage(int hit) {
        damage += hit;
        return health -= damage;
    }

    public String getAttack() {
        return attack;
    }

    public String getAttackName() {
        return attackName;
    }

}

