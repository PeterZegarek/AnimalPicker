import java.util.Scanner;

public class AnimalPicker{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Which animal would you like to see? A dog or a cat? Type 'D' for dog or 'C' for cat.");
            String input = sc.nextLine();
            if (input.equals("D")){
                System.out.println("Dog ASCII");
            }
            else if (input.equals("C")){
                System.out.println("Cat ASCII");
            }
        
        

        
        sc.close();
    }
}