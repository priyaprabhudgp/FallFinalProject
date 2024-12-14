import java.util.Random;
import java.util.Scanner;
public class MonsterRunner {
    public static void main(String[] args) {
        Random rand = new Random();

        Monster water = new Monster("Blastoise", 200, "🌊🌊🌊🌊", "Tsunami");
        water.attackPower = rand.nextInt(0,10);
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

        Monster fire = new Monster("Charizard", 200, "\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25", "Firestorm");
        fire.attackPower = rand.nextInt(3,8);
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
        Scanner in = new Scanner(System.in);


        //get player name
        System.out.println("Now, enter player name: ");
        String name = in.nextLine();

        //player chooses element
        System.out.println("\uD83D\uDCA7  ⛰\uFE0F  \uD83D\uDD25  \uD83D\uDCA8");
        System.out.println("Pick an element by typing 'water', 'earth', 'fire' or 'air' or copypasting which of the emoji elements you want: ");
        String element = in.nextLine();

        //call fighter class
        Fighter p = new Fighter(name, element);

        System.out.println("Now choose between the two monsters to fight.  Once you have decided type in their name.");
        System.out.println(water.getName());
        System.out.println(water.getHealth());
        System.out.println(water.getAttack());
        System.out.println(water.getAttackName());
        System.out.println(water.monsterImage);

        System.out.println(fire.getName());
        System.out.println(fire.getHealth());
        System.out.println(fire.getAttack());
        System.out.println(fire.getAttackName());
        System.out.println(fire.monsterImage);

        String monsterSelect = in.nextLine();
        Monster selected;
        if(monsterSelect.equals(water.getName())){selected = water;}
        else if (monsterSelect.equals(fire.getName())) {selected = fire;}


        //looping player attack gameplay
        while (p.health > 0) {
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
            System.out.println(p.playerElementDisplay());
            p.stayAlive();

            System.out.println("\nSelect an move: ");
            String attack = in.nextLine();

            //update monster health
            //monster attack
            //player health update
        }
    }

}
