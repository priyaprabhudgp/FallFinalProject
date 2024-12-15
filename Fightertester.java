import java.util.Scanner;
public class Fightertester {
    public static void main (String args[]){

        Scanner in = new Scanner(System.in);

        //get player name
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

        //looping player attack gameplay
        for(int i = 0; i<50; i++){
            System.out.println();
        }
        System.out.println(p.playerelement());
        p.game();

        //action input
        System.out.println("\nType a to attack, Type s to shield, Type shieldr to reload shield, Type attackr to reload attack:");
        String action = in.nextLine();

        if(action.equals("a") || action.equals("s") || action.equals("r")|| action.equals("shieldr")|| action.equals("attackr")){

            while(!p.action(action)){
                System.out.println("Type a to attack, Type s to shield, Type shieldr to reload shield, Type attackr to reload attack:");
                action = in.nextLine();
            }
            p.action(action);

        }else{
            System.out.print("Invalid action, please input again.");
            System.out.println("\nType a to attack, Type s to shield, Type shieldr to reload shield, Type attackr to reload attack:");
            action = in.nextLine();
        }

        while(true){
            for(int i = 0; i<50; i++){
                System.out.println();
            }
            p.game();
            p.action(action);
            System.out.println("\nType a to attack, Type s to shield, Type shieldr to reload shield, Type attackr to reload attack:");
            String attack = in.nextLine();

            //update monster health
            //monster attack
            //player health update


        }



    }
}
