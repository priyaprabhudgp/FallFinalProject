import java.util.Scanner;
import java.util.Random;


/**
 * fighter class storing fighter traits and basic actions
 * @author arie
 */
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
     * Fighter constructor taking in name and element
     * @param name the name of player/fighter
     * @param element selected fighter element
     */
    public Fighter(String name, String element){
        this.name = name;
        this.element = element;
    }

    public int getHealth(){
        return health;
    }
    public int getAttack(){ //get current attack
        return currentattack;
    }

    /**
     * evaluate player selected element
     * @return attack reload and shield info based on selected element
     */
    public String playerelement(){
        if(element.equals("💧")||element.equals("water")){ //water info
            element = "water";
            return "Water abilities... "  +"\n|￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n" +
                    " 💧 Water reload = 3 \n 💧 Water shield = 10\n" +
                    "|＿＿＿＿＿＿＿＿＿＿＿＿＿＿|\n" +
                    "              \\ (•◡•) /\n" +
                    "               \\      /\n";

        }else if(element.equals("⛰\uFE0F")||element.equals("earth")) {//earth info
            element = "earth";
            return "Earth abilities... "  +"\n|￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n" +
                    " ⛰\uFE0F Earth reload = 5 \n ⛰\uFE0F Earth shield = 5\n" +
                    "|＿＿＿＿＿＿＿＿＿＿＿＿＿＿|\n" +
                    "              \\ (•◡•) /\n" +
                    "               \\      /\n";
            //return "Earth attack = 2 \nEarth defence = 2\n";
        }else if(element.equals("\uD83D\uDD25")||element.equals("fire")) {//fire info
            element = "fire";
            return "Fire abilities... "  +"\n|￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n" +
                    " \uD83D\uDD25 Fire reload = 7 \n \uD83D\uDD25 Fire shield = 2\n" +
                    "|＿＿＿＿＿＿＿＿＿＿＿＿＿＿|\n" +
                    "              \\ (•◡•) /\n" +
                    "               \\      /\n";
            //return "Fire attack = 2 \nFire defence = 2\n";
        }else if(element.equals("\uD83D\uDCA8")||element.equals("wind")||element.equals("air")) {//wind info
            element = "wind";
            return "Wind abilities... "  +"\n|￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n" +
                    " \uD83D\uDCA8 Wind reload = 8 \n \uD83D\uDCA8 Wind shield = 3\n" +
                    "|＿＿＿＿＿＿＿＿＿＿＿＿＿＿|\n" +
                    "              \\ (•◡•) /\n" +
                    "               \\      /\n";

        }else{
            return "";
        }

    }

    /**
     * check if game is over, print updated player stats and print end game visuals
     */
    public void game(){
        if(health > 0){ //updated current player stats
            System.out.print("Player " + name + " stats" +"\n|￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n" +
                    "  ♡ Health: " + health + "\n  ⚔ Attack: " + attack  +
                    "\n|＿＿＿＿＿＿＿＿＿＿＿＿＿＿|\n" +
                    "              \\ (•◡•) /\n" +
                    "               \\      /\n");
        }else{ //image printed when player loses
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠉⠻⢿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠛⠛⠛⠛⠛⠻⠿⢿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠁⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"+
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⢰⣦⡜⢻⡿⠛⢋⣀⣤⣴⣶⣿⣿⣿⣿⣿⣿⣷⣶⣄⡈⢙⠛⢿⣿⠋⣀⡄⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"+
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠸⠟⠋⢀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⡘⢛⡃⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"+
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡈⠂⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣈⠻⣦⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"+
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⣀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡌⠙⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"+
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢁⣼⣿⣿⣿⣿⣿⣿⡿⠛⠋⠉⢍⣉⠙⠻⠿⢿⡿⠿⠋⠉⠉⠉⠛⠿⣿⣿⣿⣿⣿⣿⣦⡑⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"+
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⣠⣾⣿⣿⣿⣿⣿⣿⠇⢠⣴⠂⠀⠀⠈⢻⣿⡆⣀⣄⢺⡿⠋⠀⠀⠐⣦⣄⠙⣿⣿⣿⣿⣿⣿⣌⢀⢻⣿⣿⣿⣿⡿⣻⣿⣿⣿⣿⣿⣿\n"+
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⢀⣧⣾⣿⣿⣿⣿⣿⣿⡄⠁⠹⣦⠀⠀⢀⣼⡟⢁⣿⣿⣄⠳⣤⡀⠀⢠⣼⡟⣸⣿⣿⣿⣿⣿⣿⣿⣦⠃⠛⣿⣿⣿⣯⣿⣿⣿⣿⣿⣿⣿\n"+
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣀⣈⠉⠿⠟⠉⠀⠛⠛⠻⢿⣷⣌⡙⠛⠋⣉⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡱⡜⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿\n"+
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⣀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⢀⣠⣶⣾⣿⣿⣶⣦⣈⠙⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣌⠈⢻⣿⣿⣿⣿⣿⣿⣿⣿\n"+
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⠿⠿⣿⣿⣿⣿⣿⣿⣿⠷⠄⠈⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣶⣦⡙⢿⣿⣿⣿⣿⣿⣿\n"+
                    "⣿⣿⣿⣿⣿⣿⣿⠟⢁⢴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⣀⡀⠀⠄⠉⠹⠿⠋⢉⣀⠀⣀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠻⣿⣿⣿⣿⣿\n"+
                    "⣿⣿⣿⣿⣿⡟⠁⣴⣟⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⣤⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣿⣿⣿⣷⡘⢿⣿⣿⣿\n"+
                    "⣿⣿⣿⣿⡏⠀⢀⣿⡏⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣿⣿⣿⣿⣿⣿⣿⣿⠰⠸⣿⣿⣿\n"+
                    "⣿⣿⣿⣿⡇⠀⢿⡏⢠⣿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⠋⢰⡀⢿⣿⣿\n"+
                    "⣿⣿⣿⣿⡇⠀⠀⢠⣿⣿⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢀⣿⡇⢸⣿⣿\n"+
                    "⣿⣿⣿⣿⠀⠀⠀⢸⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣗⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⣿⣷⢸⣿⣿\n"+
                    "⣿⣿⣿⡟⠀⠀⠀⠘⣿⣇⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣭⣭⣭⣭⣉⣉⣙⣛⣛⣛⡛⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠀⢹⣿⡆⣿⣿\n"+
                    "⣿⣿⣿⡇⠀⠀⠀⣆⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⣰⡆⠸⡟⡄⢸⣿\n"+
                    "⣿⣿⡿⠁⠀⠀⢰⣿⡄⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠉⢀⣿⣿⡄⠸⣿⠘⣿\n"+
                    "⣿⣿⡇⠀⠀⠀⣿⣿⣿⣄⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠛⠀⢀⣾⣿⣿⡇⠀⢹⡇⢻\n"+
                    "⣿⣿⠇⢠⡀⠀⣿⣿⣿⣿⣦⡈⠿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠋⠉⠀⢀⣾⣿⣿⣿⢗⠀⢀⡡⢸\n"+
                    "⣿⣿⠀⣼⠀⠀⣿⣿⣿⣿⣿⣿⣄⡀⠘⠿⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠛⠋⠁⠀⠀⢀⣴⣿⣿⣿⢟⣵⣼⠀⢸⢷⢸\n"+
                    "⣿⣿⠀⡿⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠉⠻⣿⡿⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣀⠀⠀⢀⣴⣿⣿⣿⣿⣿⢿⠷⠁⠀⡫⡿⢸\n"+
                    "⣿⡿⠀⡷⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠈⠉⠒⠺⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠟⠋⠀⣶⣿⣿⣿⣿⣿⣿⣫⣟⡳⠤⢰⡏⡤⢸\n"+
                    "⣿⡇⢠⡇⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⢀⣷⠀⠀⢰⣤⣀⣉⠙⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠟⠛⢉⣉⠀⠀⠀⠀⣀⠀⣿⣿⣿⣿⣿⣿⣿⢿⡯⠐⢬⣿⣿⡨⢸\n"+
                    "⣿⡇⢸⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⢸⡟⠀⠀⣸⣿⣿⣿⣿⣶⣶⣦⣤⣤⣉⣉⠉⢉⢉⣉⣡⣤⣤⣶⣶⣿⣿⣿⡆⡀⠀⣠⣷⠀⣿⣿⣿⣿⣿⣿⣿⣓⠈⢬⣺⣿⣿⠐⢸\n"+
                    "⣿⡇⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⢸⡇⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⢸⣿⡏⢰⣿⣿⣿⣿⣿⣿⣿⣯⠌⢴⣽⣿⣿⠨⠠\n"+
                    "⣿⠇⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⢸⠇⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⣿⠇⢸⣿⣿⣿⣿⣿⣿⣿⡖⠂⢞⣿⣿⣿⢬⠠\n"+
                    "⡏⠀⠰⣦⡈⠻⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⠘⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⢹⡆⣿⣿⣿⣿⣿⣿⣿⣿⡇⠉⣺⠟⣿⣿⢢⠨\n"+
                    "⡇⠀⠀⣾⠇⣄⠹⣿⣿⣿⣿⣿⣿⣿⣇⠀⠁⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠘⠁⣿⣿⣿⣿⣿⣿⣿⣿⠁⠨⢡⣾⣿⣿⡎⠄\n"+
                    "⠀⠀⠀⣿⡀⠈⠀⢻⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣏⠀⣠⣿⣿⣿⣿⢶⢑\n"+
                    "⠀⠀⠀⣿⣧⢀⡀⠀⠙⣿⣿⣿⣿⣿⣿⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⢰⠀⢸⣿⣿⣿⣿⣿⣿⣿⡟⠀⠿⢋⠙⣿⣿⢟⠐\n"+
                    "⡇⠀⠀⠘⠃⠻⣷⠀⠀⢹⣿⣿⣿⣿⣿⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⣾⠀⢸⣿⣿⣿⣿⣿⣿⣿⠀⠀⣴⣿⡇⣿⡟⢍⠀\n"+
                    "⣷⡄⠀⠀⠐⠀⠀⣀⠀⣸⣿⣿⣿⣿⣿⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⡯⠀⣼⣿⣿⣿⣿⣿⣿⠇⠀⣠⣿⡿⠸⠏⣠⠂⠀\n"+
                    "⣿⣿⣧⣄⠀⠈⠢⡄⢠⣿⣿⣿⣿⣿⣿⠀⢰⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⡇⠀⢻⣿⣿⣿⣿⣿⣿⣧⡾⠿⠧⠀⠀⢠⠏⠀⢀\n"+
                    "⣿⣿⣿⣿⣧⣤⣤⣤⣴⣿⣿⣿⣿⣿⡿⠀⠘⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⣸⣿⣿⣿⣿⣿⣏⠛⠓⠒⠓⠀⠀⢀⣤⢾⣻\n"+
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⢀⡀⢀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⣴⣦⠀⣿⣿⣿⣿⣿⣿⣿⣷⣶⣶⣶⣶⣿⣿⣿⣿⣿\n"+
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⢈⣗⠊⠣⡙⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⢁⣸⣿⣿⣷⣄⡉⠙⠻⠿⠛⠛⠛⠛⠻⠿⣿⣿⣿⣿⣧⣾\n"+
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠉⣄⠀⠞⠛⣿⣷⠄⠈⠑⠠⠍⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⢤⣴⡗⠂⣄⠀⢙⠻⣿⣿⣿\n"+
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⢠⠆⠐⠀⠀⠀⢰⡆⠀⠀⠀⠀⠰⡆⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣤⣄⡉⠉⠩⢏⣸⡀⢻⡆⠈⠀⠢⣀⠻⡇⠀⢀⣿⣿⣿\n"+
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠈⠀⠀⢀⣀⠀⠘⠃⠀⣀⡀⠀⠀⠉⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⣀⣈⣀⣁⣄⣀⣀⣀⣤⣶⣾⣿⣿⣿⣿\n"+
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣾⣿⣿⣷⢶⣶⣾⣿⣿⡷⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⠿⣿⣿⣿⡿⠿⣿⣿⣿⣿⣿⣿⣿");
            System.out.println("You have been killed.");
            System.exit(0);
        }
        System.out.print(" ⠀    (\\__/)\n      (•ㅅ•)      \n" + //player visual
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
     * actions based on what the player chooses (a,r,s)
     * @param action the player inputted action
     * @return if action inputted was valid or not
     */
    public boolean action(String action){
        boolean valid = false;
        if(action.equals("a")) { //attack action
            if (attack <= 0) { //if no attack left
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
                int waterR = 3;
                attack += waterR;
            }else if(element.equals("earth")) {
                int earthR = 5;
                attack += earthR;
            }else if(element.equals("fire")){
                int fireR = 7;
                attack += fireR;
            }else {
                int windR = 8;
                attack += windR;
            }
            valid = true;
            return valid;

        }
        return valid;
    }

    /**
     * get updated current action
     * @param action player inputted action
     * @return current action performed
     */
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
            }else{
                return "⛉Shielding 3...";
            }

        }else if(action.equals("a")) { //attack action
            return "⚔Attacking " + currentattack + "...";
        }else{
            return "";
        }
    }


    /**
     * get shield based on selected element
     * @return shield value
     */
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
}
