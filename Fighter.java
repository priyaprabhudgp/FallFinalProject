import java.util.InputMismatchException;
import java.util.Scanner;
public class Fighter {
    private String name;
    private String element;
    private int attack;
    private int defence;
    private int health=100;
    Scanner in = new Scanner(System.in);

    public Fighter(String name, String element){
        this.name = name;
        this.element = element;
    }

    public String playerelement(){

        if(element.equals("💧")||element.equals("water")){
            attack = 1;
            defence = 3;
            return "Player " + name +"\n|￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n" +
                    " 💧 Water attack = 1 \n 💧 Water defence = 3\n" +
                    "|＿＿＿＿＿＿＿＿＿＿＿＿＿＿|\n" +
                    "               \\ (•◡•) /\n" +
                    "                \\      /\n";
            //return "Water attack = 1 \nWater defence = 3\n";
        }else if(element.equals("⛰\uFE0F")||element.equals("earth")) {
            attack = 2;
            defence = 2;
            return "Player " + name +"\n|￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n" +
                    " ⛰\uFE0F Earth attack = 2 \n ⛰\uFE0F Earth defence = 2\n" +
                    "|＿＿＿＿＿＿＿＿＿＿＿＿＿＿|\n" +
                    "               \\ (•◡•) /\n" +
                    "                \\      /\n";
            //return "Earth attack = 2 \nEarth defence = 2\n";
        }else if(element.equals("\uD83D\uDD25")||element.equals("fire")) {
            attack = 5;
            defence = 0;
            return "Player " + name +"\n|￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n" +
                    " \uD83D\uDD25 Fire attack = 2 \n \uD83D\uDD25 Fire defence = 2\n" +
                    "|＿＿＿＿＿＿＿＿＿＿＿＿＿＿|\n" +
                    "               \\ (•◡•) /\n" +
                    "                \\      /\n";
            //return "Fire attack = 2 \nFire defence = 2\n";
        }else if(element.equals("\uD83D\uDCA8")||element.equals("wind")||element.equals("air")) {
            attack = 4;
            defence = 1;
            return "Player " + name +"\n|￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n" +
                    " \uD83D\uDCA8 Wind attack = 2 \n \uD83D\uDCA8 Wind defence = 2\n" +
                    "|＿＿＿＿＿＿＿＿＿＿＿＿＿＿|\n" +
                    "               \\ (•◡•) /\n" +
                    "                \\      /\n";
            //return "Wind attack = 2 \nWind defence = 2\n";
        }else{
            throw new InputMismatchException("Invalid choice.");
        }
    }

    public void game(){
        if(health > 0){
            System.out.println("Health: " + health);
        }else{
            System.out.println("You have been killed.");
            System.exit(0);
        }
        System.out.println(" ⠀    (\\__/)\n      (•ㅅ•)      \n" +
                "   ＿ノヽ ノ＼＿      \n" +
                "`/　`/ ⌒Ｙ⌒ Ｙ  ヽ     \n" +
                "( 　(三ヽ人　 /　  |\n" +
                "|　ﾉ⌒＼ ￣￣ヽ   ノ\n" +
                "ヽ＿＿＿＞､＿_／\n" +
                "      ｜( 王 ﾉ〈   \n" +
                "      /ﾐ`ー―彡\\  \n" +
                "     /  ╰    ╯ \\  ");

    }

}

