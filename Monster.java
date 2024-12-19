/**
 * monster class storing monster attributes and traits
 * @author priya
 */
public class Monster {
    private String name;
    private int health;
    private String attackName;
    private String attack;
    private int attackPower;
    public String monsterImage;

    /**
     * default monster constructor for default monster (w/ no parameters)
     */
    public Monster(){
        name = "";
        health = 100;
        attack = "";
        attackName = "";
    }

    /**
     * general monster constructor taking in name, health, attack, and attackName
     * @param name the name of selected monster
     * @param health the health of monster
     * @param attack the monster attack emojis
     * @param attackName the monster attack name
     */
    public Monster(String name, int health, String attack, String attackName) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.attackName = attackName;
    }

    //getter methods
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public String getAttack() {
        return attack;
    }
    public String getAttackName() {
        return attackName;
    }
    public int getAttackPower(){ //gets current monster attack value
        return attackPower;
    }

    //setter methods
    public void setName(String name) { //sets monster name
        this.name = name;
    }
    public void setHealth(int health) { //sets monster health
        this.health = health;
    }
    public void setAttack(String attack) { //sets monster attack emojis
        this.attack = attack;
    }
    public void setAttackName(String attackName) { //sets monster attack name
        this.attackName = attackName;
    }

    /**
     * updates monster health with fighter attack
     * @param damage the attack of fighter
     */
    public void updateHealth(int damage) {
        health -= damage;
    }
    /**
     * randomly resets monsters next attack value
     */
    public void fight(){
        attackPower = (int)(Math.random()*10)+1;
    }


}
