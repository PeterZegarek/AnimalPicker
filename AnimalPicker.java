import java.util.Scanner;

public class AnimalPicker{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        boolean selected = false;
        while (!selected){
            System.out.println("Which animal would you like to see? Type 'D' for dog,'C' for cat, 'F' for fish, or 'S' for shadow the hedgehog.");
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
            else if (input.equals("S")){
                selected = true;
                System.out.println("            .?PGPPYJJ?7~^.                      \r\n" + //
                                        "             .!GGGGGGPPP5Y?~:                   \r\n" + //
                                        "               7BBGGGGPPPPPP57^.                \r\n" + //
                                        ".              .PPBBGGGGPPPPPP5Y!^^~!7JJ7       \r\n" + //
                                        "JPJ7~^::::^~77?55?J5B#BBGPPPPPPPBGB#BPYP~  .:   \r\n" + //
                                        ":G&##BBBBB##&&#BBY5G#@@&#BPPPPPPB&&5?JGY!?YP5   \r\n" + //
                                        " :P@@@@@@@@@@@&G&&&&#&@@@&B5PP5B&@&B#&@&&&&&!   \r\n" + //
                                        "   ~Y#@@@@@@@@&GBBGG#&@@@@@BPPG&@@@#B&@@@@B7    \r\n" + //
                                        "     .~?Y5PPPGBGB&7:7B@@@@@@##@@@@@##&&B5!.     \r\n" + //
                                        "           .~JGB&@J  :Y&@@@@@@@@@&JY!^:.        \r\n" + //
                                        "        .^?PB#&&@@&7..~##&@@@@@&Y~?B~           \r\n" + //
                                        "  ^!!7J5PB&&@@@@@@G?:.:7~!PBBP5!:7###?.         \r\n" + //
                                        "  ~P#&&&&@@@@@@@@@&G5?7!~!7Y5?7?YB@@@@B57       \r\n" + //
                                        "   .~YB&@@@@@@@@@&BBPPGBP5JY55B&@@@@@@@#7       \r\n" + //
                                        "       :~7JYYYJ7J5PG#@@@&P?777?G####GY7.        \r\n" + //
                                        "              ^5B#&@@&&@@&GJ???.....            \r\n" + //
                                        "            .?##&BP5B@@@@@@@&&P..^:             \r\n" + //
                                        "         ....?B&?. .^#@@@@@@B5##B##Y?~.         \r\n" + //
                                        "        !YJYP@#~  ^!Y#@@&@@&! P@@@@@BY~.        \r\n" + //
                                        "      :!??7?YBB:   .5&@5:?@@#77B@@#PJ?77~^.     \r\n" + //
                                        "      ~5J~^:.:~.  .Y&@P.  7@@@?:JJJYJ?7777!~.   \r\n" + //
                                        "            .:^^^.Y&@B:    J@@@J   ^?7~?77777~. \r\n" + //
                                        "      . ....^7777J&@#^     .G@@@~  ~?!.7777!~?!.\r\n" + //
                                        "     .^~~~!~:^:~Y#@&!       J@@@5  .^. !??77:~7~\r\n" + //
                                        "      :~77??7^^G@@@?      .:Y@@@B::.   :^^!!. ..\r\n" + //
                                        "          ..?Y5&&&P:.     Y&@&BBBGG:            \r\n" + //
                                        "           ^B##BBBBP^    ~P##B5PGBY:            \r\n" + //
                                        "          :YYJJJYPPY^    ^JGGY7777J~            \r\n" + //
                                        "          :~~^^~~7?!:   .?#@@@7...:.....        \r\n" + //
                                        "         .:     .:^~    ?#&@@@#^..    .....::.  \r\n" + //
                                        "         ^:.....::!J:  :BBBB#&@P::..    :~7Y5Y!.\r\n" + //
                                        "        .!!?YY555YJY~  .?Y5PPPJ!JYJ??77J55YGB#G:\r\n" + //
                                        "        .YGGGG#BGGGP!      ...  ^7?JJY55Y?!?7!^ \r\n" + //
                                        "        .?5Y^~77^?GPJ                ...        ");
            }
            else {
                System.out.println("Please enter a valid input");
            }
        
        }
        

        
        sc.close();
    }
}