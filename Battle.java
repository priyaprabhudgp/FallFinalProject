import java.util.Scanner;
import java.util.Random;


/**
 * Runner class for interaction btw fighter and monster
 * @author priya and arie
 */
public class Battle {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        /**
         * Monster objects are created based on player input
         * @author priya
         */
        //set monster card objects
        Monster water = new Monster("Blastoise", 100, "🌊🌊🌊🌊", "Tsunami"); //blastoise object
        water.monsterImage = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣀⣠⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣤⠶⠶⠶⠚⠋⠉⠉⠉⠛⠃⠀⠉⣿⡆⠀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣏⣿⣿⣶⠀⠀⠀⣸⣿⠉⣳⣶⠾⠐⠛⠛⠉⠉⠙⢷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣼⣿⠋⠀⠀⠀⠛⠛⠉⠁⠀⠀⠀⠀⠘⠻⠶⠖⠚⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠁⠀⠀⠀⣀⣴⠀⠀⠀⠀⠀⢀⣠⡴⠞⠋⠉⣻⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣇⣀⣀⣀⣸⠋⠙⠛⠶⠶⠖⠚⠋⠁⠀⠀⠀⠀⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⢀⣤⠤⢤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣤⠴⠾⠛⠛⠛⠳⠿⢭⣍⣛⠲⢦⣄⠀⠀⠀⠀⠀⠀⠀⣠⡾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⣰⠋⠀⠀⠀⠙⢧⡀⠀⢀⣀⡀⠀⣠⡴⠞⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⠽⢿⡶⢯⣿⣦⡀⠀⢀⣠⡾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢻⣄⠀⠀⠀⠀⢈⣿⠞⠋⢩⣿⣿⠿⠶⠒⠒⠲⠶⢤⣄⣀⠤⠶⠞⠛⠉⠁⠀⠀⣸⠃⣤⡙⢯⡻⣿⣉⣡⡤⠴⠶⢢⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠹⣦⠀⢀⡴⠋⠁⣠⡾⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⣸⠇⠀⠀⠀⠀⠀⠀⠀⢀⡟⢠⣿⠿⣬⣻⣾⠋⠀⠀⠀⠀⠀⠀⢸⣿⣇⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠈⣳⠟⠁⣠⡾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡟⠀⠀⠀⠀⠀⠀⠀⠀⢸⠇⣸⠃⠀⠈⠉⢹⡀⠀⠀⠀⠀⠀⠀⠀⢿⣿⡇⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⣼⠋⢀⣾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⣿⢀⡿⠰⣆⠀⢀⣼⢷⡀⠀⠀⠀⠀⣀⣀⣨⡽⠃⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⣼⠃⣠⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⡄⠀⠀⠀⠀⠀⠀⢸⡇⢸⣇⣠⣽⡶⠟⠀⢈⡿⠓⠚⠛⠉⡟⠻⣦⡀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⢀⡾⣿⣷⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣄⡀⠀⠀⠀⠀⠘⣧⠸⣿⡟⠀⠀⠀⠀⣼⠁⠀⠀⠀⢀⡇⠀⠈⠻⣆⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⣾⠁⢿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⡟⠉⠙⠻⢶⣤⡀⠀⢹⡆⢹⣇⠀⠀⠀⠀⡿⠀⠀⠀⠀⣼⠁⠀⠀⠀⢹⡿⣦⡀⠀⠀\n" +
                "⠀⠀⠀⠀⣿⣧⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠟⠋⠀⠀⠀⠀⠀⠈⠙⢷⣤⣻⡄⢿⡄⠀⠀⠀⡇⠀⠀⢀⣼⠋⠀⠀⠀⠀⢀⡇⠈⢷⠀⠀\n" +
                "⠀⠀⠀⠀⠉⣼⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣼⢿⡄⠀⠀⣇⣤⡶⠋⠁⠀⠀⠀⠀⠀⣼⠃⠀⢸⣷⡄\n" +
                "⠀⠀⠀⠀⢠⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⠋⠀⢷⠀⢀⡿⣤⣀⡀⠀⠀⠀⢀⣠⡾⠃⢀⣤⢿⡷⣿\n" +
                "⠀⠀⠀⠀⣸⢿⡀⢀⣀⣀⣀⣀⣀⣀⡀⢀⣠⣴⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡾⠁⠀⠀⢸⣄⣼⠇⠀⡿⠉⠉⠛⠛⠛⠷⠲⣿⡏⠛⠾⠇⠀\n" +
                "⠀⠀⠀⠀⣿⣼⠟⠉⠉⠉⠉⠉⠉⠉⠉⠛⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠟⠁⠀⠀⠀⣼⠟⣷⡆⣸⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⢀⡾⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠟⠁⠀⠀⠀⠀⢠⡇⠀⠘⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⢀⡟⠀⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡶⠋⠁⠀⠀⠀⠀⢀⣠⣾⡛⠳⢶⣏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⣼⠁⠀⢿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡆⠀⠀⠀⠀⠀⠀⠀⣠⡾⠋⠀⠀⠀⠀⠀⢀⣴⠟⠁⠀⠹⣦⠀⠙⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⡏⠀⠀⣸⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣷⠀⠀⠀⠀⠀⢀⡴⠋⠀⠀⠀⠀⠀⢀⣴⠟⠁⠀⠀⠀⠀⠘⣧⠀⠈⢿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⡇⠀⠀⣿⠻⣆⣠⡤⠶⠶⠶⢦⣄⡀⠀⠀⠀⢹⡆⠀⣀⣤⠶⠋⠁⠀⠀⠀⠀⠀⣠⡞⠁⠀⠀⠀⠀⠀⠀⠀⢹⡆⠀⠈⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⡇⠀⠀⢸⡆⠉⠁⠀⠀⠀⠀⠀⠈⠙⠷⣤⡤⠾⠟⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⣴⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⣧⠀⠀⠀⢷⣤⠶⠛⠉⠉⠙⠓⠶⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⣾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⢹⡶⠶⢶⡾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠙⢷⣤⣤⡴⠶⠚⠛⠉⠉⠉⠉⢹⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⣸⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⢠⡟⠀⣴⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⠁⠀⠀⠀⢀⣀⣀⣤⡴⠶⠛⢻⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣶⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠘⢛⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡾⠛⠛⠛⠛⠉⠉⠉⠀⠀⠀⠀⠀⠀⢿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡷⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⢠⡞⠁⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⠞⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡼⠛⠋⠙⠻⢶⡄⠀⠀⠀⠀⢀⣼⠋⠙⢿⣟⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠸⠶⠤⠤⠤⠤⠤⠶⠶⠚⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣤⣤⣤⡤⠶⠾⠗⠛⠛⠛⠉⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";

        Monster fire = new Monster("Charizard", 100, "\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25", "Firestorm"); //charizard object
        fire.monsterImage = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠄⠒⡄⠀⠀⠀⠀⠀⠀⠀⢀⡠⠤⠒⠊⠉⠉⠒⠦⣀⠀⠀⢀⡠⠤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡼⠁⠀⢀⡇⠀⠀⣀⠤⠄⠒⢉⡁⠀⠠⢤⠤⣴⣴⣶⣄⠈⠁⠉⠁⠀⠠⡈⠳⣄⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠴⠋⠀⠀⡠⠋⢀⠖⠉⠀⢀⣀⢤⡞⠀⠀⠀⠸⠦⠗⠚⠛⠉⠀⠀⠀⠀⠀⠀⠀⢀⡾⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⢀⠔⠉⠀⢀⡆⠀⡞⠀⠀⠈⠒⠔⠊⠁⠀⢰⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠠⠤⢴⣲⠒⠒⡿⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢠⠏⠀⠀⠀⣸⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠈⡄⠀⠀⠀⠀⠲⢄⠠⠔⠉⠀⠀⣀⣀⣉⣀⣴⠃⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⡰⠃⠀⠀⣠⠾⣁⠀⠀⢇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⡄⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⠁⡜⠁⠀⡀⠑⢄⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⡴⠁⠀⠀⡴⠁⢰⡇⠳⡀⠈⢦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠱⡀⠀⠀⠀⠐⠒⢶⡚⠁⠀⠀⣇⠀⠠⣧⡀⠀⠑⣄⠀⠀⠀⠀⠀\n" +
                "⠀⠀⡜⠀⠀⠀⣸⠁⠀⠸⡟⣲⢳⡀⠈⠣⡀⠀⠀⠀⠀⠀⠀⠀⠀⢣⠀⠀⠀⠀⠀⠀⠳⡀⠀⠀⢸⠀⢀⠁⠙⢆⠀⠘⡄⠀⠀⠀⠀\n" +
                "⠀⡸⠀⠀⠀⢀⠇⠀⢠⠎⢹⣁⣀⡹⡄⠀⠙⢄⡀⠀⡰⠊⠙⢄⠀⠈⡆⠀⠀⠀⠀⠀⠀⠈⠦⡀⡸⠀⠈⡇⢀⠀⢣⠀⢱⡀⠀⠀⠀\n" +
                "⢠⠃⠀⠀⢀⡞⠀⢀⡬⠟⠉⠀⢀⣽⡈⢦⠀⠀⠉⠉⠀⣀⠀⠈⠳⣄⣷⠀⠀⠀⠀⠀⠀⠀⠀⠈⠣⣄⠜⠁⠘⡄⠀⢣⠀⢃⠀⠀⠀\n" +
                "⡎⠀⠀⠀⡼⠀⠀⢸⡄⠀⠀⠀⠘⠦⠗⢄⠑⠦⠤⠠⠎⠉⠣⡀⠀⠈⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⢄⠀⢡⠀⠈⡆⠘⡄⠀⠀\n" +
                "⠁⠀⠀⢠⠃⢸⢻⠀⣀⣽⠀⠀⠀⠀⣠⠼⠀⢠⠀⠀⠀⠀⠀⠱⣄⠜⠁⠀⠀⠀⠀⠀⠀⣠⠤⠤⢤⡀⣠⠤⢵⠚⠉⠙⠿⢤⢳⠀⠀\n" +
                "⠀⠀⠀⠼⠀⠘⢮⠋⠀⠀⠀⠀⠀⠀⠑⠢⣄⢸⠀⠀⠀⠀⣀⠔⠉⠀⠀⡀⠀⠀⠀⢀⠜⠁⠀⠀⠀⢻⠀⠀⡇⠀⡔⠂⠀⠀⢯⡇⠀\n" +
                "⠀⠀⠀⡄⠀⠀⡇⠀⠀⢀⡠⢀⠀⠀⠀⠀⡘⢸⠀⠀⠀⡜⠁⠀⠀⠀⠀⢀⣹⠤⠤⠾⠀⠀⠈⠉⠲⡾⠳⡀⢏⢹⣇⣀⠎⠁⢸⣷⠀\n" +
                "⠀⠀⠀⢹⠀⠀⠣⣀⡔⠉⢠⠋⠀⢰⠉⠷⠃⠘⠀⠀⡰⡇⠀⠀⠀⠀⠰⠋⠀⠀⠀⠀⠀⠉⠲⢤⠀⣙⢳⡇⠈⠻⣾⢻⣦⡴⠋⠀⠀\n" +
                "⡄⠀⠀⢸⠀⠀⣠⠎⠀⠀⠘⠒⠒⣏⠀⠀⠀⠆⠀⡜⠁⢱⢄⠀⠀⠀⠀⢀⡤⠖⠒⠂⠺⡀⠀⣸⠻⠘⡿⠀⠀⠀⠀⠘⠛⣇⡄⡆⠀\n" +
                "⢧⠀⠀⠘⡀⡴⡏⠀⠀⠀⢹⡀⠀⠈⢆⠀⠀⢀⠞⣠⠞⠁⠀⠉⠁⠀⠊⠁⠀⠀⠀⠀⠀⠘⡏⢙⡾⠀⠀⠀⠀⠀⠀⠀⢠⠉⠳⡇⠀\n" +
                "⠈⢆⠀⠀⣿⠡⠃⠀⠀⠀⠀⠳⡀⠀⠈⢆⢀⢎⡜⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡀⠀⠀⠀⠀⠀⠀⠀⠀⡞⠀⠀⠘⡀\n" +
                "⠀⠘⡄⠀⢳⠀⠀⠀⠀⠀⠀⠀⠈⠒⠤⣌⣋⡎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢧⠀⠀⠀⠀⠀⠀⠀⡰⠀⠀⠀⠀⠀\n" +
                "⠀⠀⢣⡀⠘⢦⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠒⢤⡀⠀⠀⠀⠀⡟⠀⠀⠀⠀⠀⠀⡴⠁⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠳⡄⠈⢻⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠱⡀⠀⠀⣀⠤⠒⠂⠀⠀⠈⠀⠒⠸⣦⠀⠀⡼⠁⠀⠀⠀⠀⣠⠎⠀⠀⠀⠀⢀⠜⠀\n" +
                "⠀⠀⠀⠀⠈⢢⡀⠹⣷⢤⡀⠀⠀⠀⠀⠀⠀⠀⠙⢤⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⡞⠀⠀⠀⠀⡠⠚⠁⠀⠠⠒⠠⠴⡉⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠉⠢⠼⡗⢍⡒⠤⣀⡀⠀⠀⠀⠀⢸⠔⠒⠒⣄⢠⠒⠒⢢⠀⡴⠒⠒⢤⣇⣀⠤⠒⡏⠀⣀⡀⠀⡠⢄⠀⢀⠜⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠒⠠⠤⢉⣉⣉⣉⣹⠀⠀⠀⡸⢃⠀⠀⠀⡟⡄⠀⠀⠘⡇⠀⠀⠀⠑⢼⡀⢱⣀⡅⠀⠱⣤⣀⠀⢡\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢦⠔⠉⠉⠙⢦⣠⠞⠉⠉⠑⢦⡜⠁⠀⠀⠀⠀⠀⠉⠋⠀⠈⠉⠉⠁⠀⠀⠀";

        //Introducing monster cards
        System.out.println("Welcome to our monster fighter game.  Here you can choose a monster to fight from our collection listed below and an element to equip yourself with.  Once you choose and start the game you will have three moves you can choose from each round.  These moves are 'fight', 'defend' and 'reload'.  To fight, you must  reload first.  The more times you reload, the more times you can attack.  However, each round the monster will also attack, so choose your move wisely!");
        System.out.println();
        System.out.println("Name: " + water.getName());
        System.out.println("Health: " + water.getHealth());
        System.out.println(water.getAttack());
        System.out.println("Attack: " + water.getAttackName());
        System.out.println(water.monsterImage);
        System.out.println();
        System.out.println("Name: " + fire.getName());
        System.out.println("Health: " + fire.getHealth());
        System.out.println(fire.getAttack());
        System.out.println("Attack: " + fire.getAttackName());
        System.out.println(fire.monsterImage);
        System.out.println("Now choose between the two monsters to fight.  Once you have decided.  type in their name...");

        //prompts player to choose monster card
        String monsterSelect = in.nextLine();
        while(!(monsterSelect.equals("Charizard"))&&!(monsterSelect.equals("Blastoise"))){
            System.out.println("Invalid choice.  Please enter the name of the monster correctly!");
            monsterSelect = in.nextLine();
        }
        Monster selected = new Monster(); //call slected monster object

        if(monsterSelect.equals(water.getName())){ //player chooses blastoise
            selected.setAttack(water.getAttack());
            selected.setName(water.getName());
            selected.setAttackName(water.getAttackName());
            selected.setHealth(water.getHealth());
        }
        else if (monsterSelect.equals(fire.getName())) { //player chooses charizard
            selected.setAttack(fire.getAttack());
            selected.setName(fire.getName());
            selected.setAttackName(fire.getAttackName());
            selected.setHealth(fire.getHealth());
        }
        selected.fight(); //set monster first attack

        /**
         * prompts player for name and element input
         * @author arie
         */
        //prompts player to enter name
        System.out.println();
        System.out.println("Enter player name: ");
        String name = in.nextLine();

        //prints out element options
        System.out.println("\uD83D\uDCA7  ⛰\uFE0F  \uD83D\uDD25  \uD83D\uDCA8");

        /**
         * Takes in player input for element
         * @param valid the boolean that checks if input is valid (matches element options)
         * @param element user input choice for element selection
         */
        boolean valid = false;
        System.out.println("Pick an element: ");
        String element = in.nextLine();
        //element input is valid
        if((element.equals("💧")||element.equals("water")) || (element.equals("⛰\uFE0F")||element.equals("earth")) || (element.equals("\uD83D\uDD25")||element.equals("fire")) || (element.equals("\uD83D\uDCA8")||element.equals("wind")||element.equals("air"))){
            valid = true;
        }
        //if element input invalid loop
        while (!valid) {
            System.out.println("Invalid choice. Please pick again.");
            System.out.println("Pick an element: ");
            element = in.nextLine();
            if((element.equals("💧")||element.equals("water")) || (element.equals("⛰\uFE0F")||element.equals("earth")) || (element.equals("\uD83D\uDD25")||element.equals("fire")) || (element.equals("\uD83D\uDCA8")||element.equals("wind")||element.equals("air"))){
                valid = true;
            }
        }

        //call fighter class
        Fighter p = new Fighter(name,element);

        //main game looping
        String action = "";
        int runs = 0;
        do {
            for(int i = 0; i<50; i++){ //"emptying" console
                System.out.println();
            }
            selected.fight(); //resetting monster attack

            System.out.println(p.playerelement()); //print player attacks

            if(runs > 0){ //interaction monster and fighter attacks/health
                p.health = p.health - selected.getAttackPower(); //update player health after monster attack
                if(action.equals("s")){ //activate player shield if selected
                    p.health += p.getshield();
                }
                if(action.equals("a")) { //update monster health after player attack
                    selected.updateHealth(p.getAttack());
                }
                //print monster health and current attack to player
                System.out.println("----------------------------------------------------");
                for(int i = 0; i<selected.getAttackPower();i++){
                    System.out.println("૮ ˙Ⱉ˙ ა rawr!"+selected.getAttack());
                }
                System.out.println("                            Monster Health: " + selected.getHealth());
                System.out.println("                            Monster attacking " + selected.getAttackPower() + "...");
                System.out.println("----------------------------------------------------");

            }
            runs++;

            p.game(); //print player stats and visuals
            System.out.println(p.getAction(action)); //print action

            //prompt player action input
            System.out.println("\nType a to attack, Type s to shield, Type r to reload attack:");
            action = in.nextLine();

            //when valid input, check if action is valid
            if(action.equals("a") || action.equals("s") || action.equals("r")){
                while(!p.action(action)){
                    System.out.println("Type a to attack, Type s to shield, Type r to reload attack:");
                    action = in.nextLine();
                }
            }

            //if action input invalid
            while(!action.equals("a") && !action.equals("s") && !action.equals("r")&&  !action.equals("r")){
                System.out.print("Invalid action, please input again.");
                System.out.println("\nType a to attack, Type s to shield, Type r to reload attack:");
                action = in.nextLine();
            }
        } while(p.health>0&&selected.getHealth()>0);

        /**
         * print visuals if player defeats monster
         * @author priya
         */
        if(selected.getHealth()<=0){
            System.out.println("You have defeated the monster!!!");
            System.out.println("            ⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⢐⣤⣼⣿⣿⣿⣿⣿⣿⣷⣶⣦⣀⠀⠀⠀⠀⠀⠀⠀\n"+
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣢⣾⣿⣿⣿⣿⣿⣿⣿⣿⣯⣿⣿⣿⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡟⠛⢻⠉⡉⠍⠁⠁⠀⠈⠙⢻⣿⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠏⢠⢀⡼⡄⠃⠤⠀⠀⠀⠀⠀⡐⠸⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡜⢰⣸⡎⣀⣷⣤⣶⣶⣶⣦⡀⠀⠈⠓⢿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣇⣤⣯⣿⣿⣿⣿⣿⣿⣿⣭⣯⡆⠀⠀⠘⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡿⣻⣿⣿⣼⠀⢹⣿⣿⣿⣿⡿⠋⠁⠀⠀⠀⢘⣿⠙⠡⢽⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢙⣛⣿⣯⠏⠀⢀⣿⣿⣿⣯⣠⡀⠀⠀⠀⢀⣾⡏⠒⢻⣷⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⡟⢘⣏⣺⣤⣬⣭⣼⣿⣿⣯⡉⢻⣦⣌⣦⣾⣿⣿⡚⠾⠿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⢹⡼⣿⣿⢼⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣿⡿⣿⢿⡟⢳⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳⣿⣧⡞⣻⣩⣽⡽⣿⣿⣿⣿⣿⣿⣿⣿⡟⣠⣿⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡿⣇⣬⣿⣿⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣿⡿⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡛⣿⣄⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢼⡃⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠋⠁⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠓⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠈⢳⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠿⢿⡟⠻⢿⣿⡷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣍⠓⠲⠤⢤⣄⡀⠀⠀⠀⠀\n"+
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣇⠀⠈⣿⡏⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠈⠈⢯⡁⠀⠀⠀⠉⠹⠶⢤⣀\n"+
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣻⠀⢀⠹⣿⡆⠀⢰⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣷⣤⣄⠀⠀⠀⠀⠀\n"+
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⠴⠚⢩⠀⢸⡄⢹⣿⣦⣸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣷⣤⡄⠀⢀\n"+
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠴⠋⡀⣀⣰⣿⠀⠄⠹⣾⣿⣿⡿⣿⠀⢠⣤⣀⣴⣤⣤⡴⠶⠶⠿⠿⠛⠛⠋⠉⠉⣠⣿\n"+
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⠞⠁⢀⡱⠏⠉⡟⠃⠀⠀⠀⢸⣿⣿⠇⣿⡴⠾⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡿⠟\n"+
                    "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡤⠖⢋⣡⣶⣿⣂⡼⠁⠉⠙⠋⠙⠿⠟⣢⣄⢿⡟⠴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠈⠀⠀\n"+
                    "⠀⠀⠀⢀⣠⠴⠚⠉⠉⠀⠀⠀⠀⠀⣸⡿⠟⠀⠀⠀⠀⠀⠀⠲⣾⡛⣿⣬⡄⠀⠀⠁⠠⣤⠆⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                    "⠀⣠⠞⠉⠀⠀⠀⠀⠀⠀⠀⠀⠤⠚⠉⠀⠀⠀⠀⠀⠀⠀⠀⠺⣿⡟⣿⡟⠀⠀⠂⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠀⠀⠀⠀⠀⠀⠀\n"+
                    "⠞⠁⠀⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢐⡀⡀⣼⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠈⠁⠆⠀⠀⠀\n");

        }
    }
}

