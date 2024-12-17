import java.util.Scanner;
import java.util.Random;
public class Fighter {
    private String name;
    private String element;
    private int attack=0;
    private int shield =0;
    public int health=100;

    private int currentattack;
    Scanner in = new Scanner(System.in);
    Random rand = new Random();

    /**
     * basic fighter constructor
     * @author ariesx2
     * @param name the player inputted name
     * @param element the player selected element
     */
    public Fighter(String name, String element){
        this.name = name;
        this.element = element;
    }

    /**
     * evaluate player selected element and print info
     * @return reload and shield info based on selected element
     */
    public String playerelement(){
        if(element.equals("💧")||element.equals("water")){
            element = "water";
            return "Water abilities... "  +"\n|￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n" +
                    " 💧 Water reload = 3 \n 💧 Water shield = 10\n" +
                    "|＿＿＿＿＿＿＿＿＿＿＿＿＿＿|\n" +
                    "              \\ (•◡•) /\n" +
                    "               \\      /\n";

        }else if(element.equals("⛰\uFE0F")||element.equals("earth")) {
            element = "earth";
            return "Earth abilities... "  +"\n|￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n" +
                    " ⛰\uFE0F Earth reload = 5 \n ⛰\uFE0F Earth shield = 5\n" +
                    "|＿＿＿＿＿＿＿＿＿＿＿＿＿＿|\n" +
                    "              \\ (•◡•) /\n" +
                    "               \\      /\n";
            //return "Earth attack = 2 \nEarth defence = 2\n";
        }else if(element.equals("\uD83D\uDD25")||element.equals("fire")) {
            element = "fire";
            return "Fire abilities... "  +"\n|￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n" +
                    " \uD83D\uDD25 Fire reload = 7 \n \uD83D\uDD25 Fire shield = 2\n" +
                    "|＿＿＿＿＿＿＿＿＿＿＿＿＿＿|\n" +
                    "              \\ (•◡•) /\n" +
                    "               \\      /\n";
            //return "Fire attack = 2 \nFire defence = 2\n";
        }else if(element.equals("\uD83D\uDCA8")||element.equals("wind")||element.equals("air")) {
            element = "wind";
            return "Wind abilities... "  +"\n|￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n" +
                    " \uD83D\uDCA8 Wind reload = 8 \n \uD83D\uDCA8 Wind shield = 3\n" +
                    "|＿＿＿＿＿＿＿＿＿＿＿＿＿＿|\n" +
                    "              \\ (•◡•) /\n" +
                    "               \\      /\n";

        }else{
            return "e";
        }

    }

    /**
     * printed player stats after each action
     */
    public void game(){
        if(health > 0){
            System.out.print("Player " + name + " stats" +"\n|￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n" +
                    "  ♡ Health: " + health + "\n  ⚔ Attack: " + attack  +
                    "\n|＿＿＿＿＿＿＿＿＿＿＿＿＿＿|\n" +
                    "              \\ (•◡•) /\n" +
                    "               \\      /\n");
        }else{
            System.out.println("You have been killed.");
            System.exit(0);
        }
        System.out.print(" ⠀    (\\__/)\n      (•ㅅ•)      \n" +
                "   ＿ノヽ ノ＼＿      \n" +
                "`/　`/ ⌒Ｙ⌒ Ｙ  ヽ     \n" +
                "( 　(三ヽ人　 /　  |\n" +
                "|　ﾉ⌒＼ ￣￣ヽ   ノ\n" +
                "ヽ＿＿＿＞､＿_／\n" +
                "    ｜( 王 ﾉ〈   \n" +
                "    /ﾐ`ー―彡\\  \n" +
                "   /  ╰    ╯ \\  ");

    }

    /**
     * actions based on what the player chooses
     * @param action the player inputted action
     * @return if action inputted was valid or not
     */
    public boolean action(String action){
        boolean valid = false;

        if(action.equals("a")) { //attack action
            if (attack <= 0) {
                System.out.println("You cannot attack. Please reload...");
                return valid;
            }
            currentattack = attack;
            attack -= attack;
            valid = true;
            return valid;

        }else if(action.equals("s")){ //shield action
            if(element.equals("water")){
                shield = 10;

            }else if(element.equals("earth")) {
                shield = 5;

            }else if(element.equals("fire")){
                shield = 2;

            }else {
                shield = 3;
            }
            valid = true;
            return valid;

        }

        else if(action.equals("r")){ //reload action
            if(element.equals("water")){
                int wr = 3;
                attack += wr;

            }else if(element.equals("earth")) {
                int er = 5;
                attack += er;

            }else if(element.equals("fire")){
                int fr = 7;
                attack += fr;

            }else {
                int wr = 8;
                attack += wr;
            }
            valid = true;
            return valid;

        }
        return valid;
    }


    public String getAction(String action){
        if(action.equals("r")){ //reloading print
            if(element.equals("water")){
                return "Reloading 3 water attacks ⚔...";

            }else if(element.equals("earth")) {
                return "Reloading 5 earth attacks ⚔...";

            }else if(element.equals("fire")){
                return "Reloading 7 fire attacks ⚔...";

            }else {
                return "Reloading 8  wind attacks ⚔...";
            }

        }else if(action.equals("s")) { //shield print
            if (element.equals("water")) {
                return "⛉Shielding 10...";

            } else if (element.equals("earth")) {
                return "⛉Shielding 5...";

            } else if (element.equals("fire")) {
                return "⛉Shielding 2...";

            }else {
                return "⛉Shielding 3...";
            }
        }else if(action.equals("a")) { //attack action
            return "⚔Attacking " + currentattack + "...";
        }else{
            return "";
        }
    }

    public int getHealth(){
        return health;
    }

    public int getshield(){
        if(element.equals("water")){
            return 10;

        }else if(element.equals("earth")) {
            return 5;

        }else if(element.equals("fire")){
            return 2;

        }else {
            return 3;
        }
    }

    public int getAttack(){
        return currentattack;
    }





}
