import java.util.Scanner;
import java.util.Random;
public class Battle {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        Monster water = new Monster("Blastoise", 100, "🌊🌊🌊🌊", "Tsunami");

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

        Monster fire = new Monster("Charizard", 100, "\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25", "Firestorm");
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



        //Actual program code
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

        String monsterSelect = in.nextLine();
        while(!(monsterSelect.equals("Charizard"))&&!(monsterSelect.equals("Blastoise"))){
            System.out.println("Invalid choice.  Please enter the name of the monster correctly!");
            monsterSelect = in.nextLine();
        }

        Monster selected = new Monster();

        if(monsterSelect.equals(water.getName())){
            selected.setAttack(water.getAttack());
            selected.setName(water.getName());
            selected.setAttackName(water.getAttackName());
            selected.setHealth(water.getHealth());
        }
        else if (monsterSelect.equals(fire.getName())) {
            selected.setAttack(fire.getAttack());
            selected.setName(fire.getName());
            selected.setAttackName(fire.getAttackName());
            selected.setHealth(fire.getHealth());
        }

        selected.fight();


        //get player name
        System.out.println();
        System.out.println("Enter player name: ");
        String name = in.nextLine();

        //prints out element options
        System.out.println("\uD83D\uDCA7  ⛰\uFE0F  \uD83D\uDD25  \uD83D\uDCA8");

        /**
         * Takes in user input for element
         * @author ariesx2
         * @param eee the boolean that checks if input is valid
         * @param element user input choice for element
         */
        boolean eee = false;
        System.out.println("Pick an element: ");
        String element = in.nextLine();
        if((element.equals("💧")||element.equals("water")) || (element.equals("⛰\uFE0F")||element.equals("earth")) || (element.equals("\uD83D\uDD25")||element.equals("fire")) || (element.equals("\uD83D\uDCA8")||element.equals("wind")||element.equals("air"))){
            eee = true;
        }
        //if element input invalid loop
        while (eee == false) {
            System.out.println("Invalid choice. Please pick again.");
            System.out.println("Pick an element: ");
            element = in.nextLine();
            if((element.equals("💧")||element.equals("water")) || (element.equals("⛰\uFE0F")||element.equals("earth")) || (element.equals("\uD83D\uDD25")||element.equals("fire")) || (element.equals("\uD83D\uDCA8")||element.equals("wind")||element.equals("air"))){
                eee = true;
            }
        }

        //call fighter class
        Fighter p = new Fighter(name,element);

        String action = "";
        int runs = 0;
        do {
            for(int i = 0; i<50; i++){ //"emptying" console
                System.out.println();
            }
            selected.fight(); //resetting monster attack
            
            System.out.println(p.playerelement()); //print player attacks

            if(runs > 0){ //interaction monster and fighter attacks/health
                p.health = p.health - selected.getAttackPower();
                if(action.equals("s")){
                    p.health += p.getshield();
                }
                if(action.equals("a")) {
                    selected.updateHealth(p.getAttack());
                }
                System.out.println("----------------------------------------------------");
                for(int i = 0; i<selected.getAttackPower();i++){
                    System.out.println("૮ ˙Ⱉ˙ ა rawr!"+selected.getAttack());
                }
                System.out.println("                            Monster Health: " + selected.getHealth());
                System.out.println("                            Monster attacking " + selected.getAttackPower() + "...");
                System.out.println("----------------------------------------------------");
                

            }
            runs++;

            p.game(); //print player states and visuals
            System.out.println(p.getAction(action)); //print action

            //action input
            System.out.println("\nType a to attack, Type s to shield, Type r to reload attack:");
            action = in.nextLine();

            if(action.equals("a") || action.equals("s") || action.equals("r")){

                while(!p.action(action)){
                    System.out.println("Type a to attack, Type s to shield, Type r to reload attack:");
                    action = in.nextLine();
                }

            }
            while(!action.equals("a") && !action.equals("s") && !action.equals("r")&&  !action.equals("r")){

                System.out.print("Invalid action, please input again.");
                System.out.println("\nType a to attack, Type s to shield, Type r to reload attack:");
                action = in.nextLine();
            }
        } while(p.health>0&&selected.getHealth()>0);
        
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
