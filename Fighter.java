import java.util.Scanner;
public class Fighter {
    private String name;
    private String element;
    private int attack=0;
    private int shield =0;
    private int reloadA;
    private int reloadD;
    private int health=100;
    Scanner in = new Scanner(System.in);

    public Fighter(String name, String element){
        this.name = name;
        this.element = element;
    }

    public String playerelement(){
        if(element.equals("💧")||element.equals("water")){
            element = "water";
            return "Water abilities... "  +"\n|￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n" +
                    " 💧 Water attack = 3-5 \n 💧 Water shield = 5-10\n" +
                    "|＿＿＿＿＿＿＿＿＿＿＿＿＿＿|\n" +
                    "              \\ (•◡•) /\n" +
                    "               \\      /\n";

        }else if(element.equals("⛰\uFE0F")||element.equals("earth")) {
            element = "earth";
            return "Earth abilities... "  +"\n|￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n" +
                    " ⛰\uFE0F Earth attack = 1-10 \n ⛰\uFE0F Earth shield = 5-12\n" +
                    "|＿＿＿＿＿＿＿＿＿＿＿＿＿＿|\n" +
                    "              \\ (•◡•) /\n" +
                    "               \\      /\n";
            //return "Earth attack = 2 \nEarth defence = 2\n";
        }else if(element.equals("\uD83D\uDD25")||element.equals("fire")) {
            element = "fire";
            return "Fire abilities... "  +"\n|￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n" +
                    " \uD83D\uDD25 Fire attack= 10-20 \n \uD83D\uDD25 Fire shield = 0-3\n" +
                    "|＿＿＿＿＿＿＿＿＿＿＿＿＿＿|\n" +
                    "              \\ (•◡•) /\n" +
                    "               \\      /\n";
            //return "Fire attack = 2 \nFire defence = 2\n";
        }else if(element.equals("\uD83D\uDCA8")||element.equals("wind")||element.equals("air")) {
            element = "wind";
            return "Wind abilities "  +"\n|￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n" +
                    " \uD83D\uDCA8 Wind attack = 2-10 \n \uD83D\uDCA8 Wind shield = 3-7\n" +
                    "|＿＿＿＿＿＿＿＿＿＿＿＿＿＿|\n" +
                    "              \\ (•◡•) /\n" +
                    "               \\      /\n";
            //return "Wind attack = 2 \nWind defence = 2\n";
        }else{
            return "e";
        }

    }

    public void game(){
        if(health > 0){
            System.out.print("Player " + name + " stats" +"\n|￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n" +
                    "  ♡ Health: " + health + "\n  ⚔ Attack: " + attack + "\n  ⛉ Shield: " + shield +
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

    public boolean action(String action){
        boolean valid = false;
        if(action.equals("a")) {
            if (attack <= 0) {
                System.out.println("You cannot attack.");
                return valid;
            }
            System.out.println("⚔Attacking " + attack + "...");
            attack -= attack;
            valid = true;
            return valid;

        }else if(action.equals("s")){
            if(shield <= 0){
                System.out.println("You cannot shield.");
                return valid;
            }
            System.out.println("⛉Shielding " + shield + "...");
            shield -= shield;
            valid = true;
            return valid;

        }else if(action.equals("shieldr")){
            int randshield;
            if(element.equals("water")){
                randshield = 5 + (int)(Math.random()*6);
                shield += randshield;
                System.out.println("Reloading " + randshield + " water shields⛉...");

            }else if(element.equals("earth")) {
                randshield = 5 + (int)(Math.random()*8);
                shield += randshield;
                System.out.println("Reloading " + randshield + " earth shields⛉...");

            }else if(element.equals("fire")){
                randshield =  (int)(Math.random()*4);
                shield += randshield;
                System.out.println("Reloading " + randshield + " fire shields⛉...");

            }else{
                randshield =  3 + (int)(Math.random()*5);
                shield += randshield;
                System.out.println("Reloading " + randshield + " wind shields⛉...");
            }
            valid = true;
            return valid;

        }else if(action.equals("attackr")){
            int randattack;
            if(element.equals("water")){
                randattack = 3 + (int)(Math.random()*3);
                attack += randattack;
                System.out.println("Reloading " + randattack + " water attacks⚔...");

            }else if(element.equals("earth")) {
                randattack = 1 + (int)(Math.random()*10);
                attack += randattack;
                System.out.println("Reloading " + randattack + " earth attacks⚔...");

            }else if(element.equals("fire")){
                randattack =  10+ (int)(Math.random()*11);
                attack += randattack;
                System.out.println("Reloading " + randattack + " fire attacks⚔...");

            }else {
                randattack = 2 + (int) (Math.random() * 9);
                attack += randattack;
                System.out.println("Reloading " + randattack + " wind attacks⚔...");
            }
            valid = true;
            return valid;

        }
        return valid;
    }



}
