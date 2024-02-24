import java.util.Scanner;

public class AnimalPicker{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        boolean selected = false;
        while (!selected){
            System.out.println("Which animal would you like to see? A dog or a cat? Type 'D' for dog,'C' for cat, or 'F' for fish.");
            String input = sc.nextLine();
            if (input.equals("D")){
                selected = true;
                System.out.println("                                  .-.\n     (___________________________()6 `-,\n     (   ______________________   /\'\'\"`\n     //\\\\                      //\\\\\n     \"\" \"\"                     \"\" \"\"");
            }
            else if (input.equals("C")){
                selected = true;
                System.out.println("|\\---/|\n| o_o |\n \\_^_/");
            }
            else if (input.equals("F")){
                selected = true;
                System.out.println("     |\\     o\n    |  \\     o\n|\\ /    .\\  o\n| |       (\n|/ \\     /\n    |  /\n     |/");
            }
            else {
                System.out.println("Please enter a valid input");
            }
        
        }
        

        
        sc.close();
    }
}