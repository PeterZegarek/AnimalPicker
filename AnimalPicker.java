import java.util.Scanner;

public class AnimalPicker{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        boolean selected = false;
        while (!selected){
            System.out.println("Which animal would you like to see? A dog or a cat? Type 'D' for dog or 'C' for cat.");
            String input = sc.nextLine();
            if (input.equals("D")){
                selected = true;
                System.out.println("                                  .-.\n     (___________________________()6 `-,\n     (   ______________________   /\'\'\"`\n     //\\\\                      //\\\\\n     \"\" \"\"                     \"\" \"\"");
            }
            else if (input.equals("C")){
                selected = true;
                System.out.println("|\\---/|\n| o_o |\n \\_^_/");
            }
            else {
                System.out.println("Please enter a valid input");
            }
        
        }
        

        
        sc.close();
    }
}