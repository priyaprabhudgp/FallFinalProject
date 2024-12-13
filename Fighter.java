import java.util.Scanner;
public class Fightertester {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);

        //get player name
        System.out.println("Enter player name: ");
        String name = in.nextLine();

        //player chooses element
        System.out.println("\uD83D\uDCA7  ⛰\uFE0F  \uD83D\uDD25  \uD83D\uDCA8");
        System.out.println("Pick an element: ");
        String element = in.nextLine();

        //call fighter class
        Fighter p = new Fighter(name,element);


        //looping player attack gameplay
        while(true){
            for(int i = 0; i<50; i++){
                System.out.println();
            }
            System.out.println(p.playerelement());
            p.game();

            System.out.println("\nSelect an attack: ");
            String attack = in.nextLine();

            //update monster health
            //monster attack
            //player health update


        }

    }
}
