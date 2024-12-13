import java.util.InputMismatchException;
import java.util.Scanner;
public class Fighter {
    private String name;
    private String element;
    private int attack;
    private int defence;
    Scanner in = new Scanner(System.in);

    public Fighter(String name, String element){
        this.name = name;
        this.element = element;
    }

    public String playerelement(){
        if(element.equals("💧")||element.equals("water")){
            attack = 1;
            defence = 3;
            return "attack = 1 \ndefence = 3";
        }else if(element.equals("⛰\uFE0F")||element.equals("earth")) {
            attack = 2;
            defence = 2;
            return "attack = 2 \ndefence = 2";
        }else if(element.equals("\uD83D\uDD25")||element.equals("fire")) {
            attack = 5;
            defence = 0;
            return "attack = 2 \ndefence = 2";
        }else if(element.equals("\uD83D\uDCA8")||element.equals("wind")||element.equals("air")) {
            attack = 4;
            defence = 1;
            return "attack = 2 \ndefence = 2";
        }else{
            throw new InputMismatchException("Invalid choice.");
        }
    }

}

