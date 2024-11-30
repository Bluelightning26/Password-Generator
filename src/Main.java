import java.util.Scanner;
import java.util.Random;

class Password_Generator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        boolean showSystemProperties=false;

        //Prompt
        System.out.println("\n\n\nWelcome to the Password Generator\n\n");
        try {
        Thread.sleep(1500);
        } catch (InterruptedException b) {
        b.printStackTrace();
        }

        System.out.println("This program will generate a STRONG password");
        try {
        Thread.sleep(2000);
        } catch (InterruptedException b) {
        b.printStackTrace();
        }

        System.out.println("\nSecurity.org recommends that passwords should contain:" +
                "\n -> 16 for extra protection" +
                "\n -> Uppercase and lowercase letters" +
                "\n -> Numbers" +
                "\n -> Symbols");
        try {
        Thread.sleep(7000);
        } catch (InterruptedException b) {
        b.printStackTrace();
        }

        System.out.println("\nThis is all going to be present in this password.\n\n");
        try {
        Thread.sleep(1500);
        } catch (InterruptedException b) {
        b.printStackTrace();
        }

        System.out.println("\n\n\nThe strong password has been generated!\n\n");
        try {
        Thread.sleep(750);
        } catch (InterruptedException b) {
        b.printStackTrace();
        }


        for (int i = 0; i <= 18; i++)
            {
            //126 is upper limit for my selected ASCII value and 32 is least
            char digit = (char) (rand.nextInt(126 - 32) + 32);

            // first 4 pre-gen so PW has all
            if (i < 4)
                {

                if (i == 0)
                    {
                    //Upper
                    digit = (char) (rand.nextInt(26) + 'A');
                    }

                else if (i == 1)
                    {
                    //Lower
                    digit = (char) (rand.nextInt(26) + 'a');
                    }

                else if (i == 2)
                    {
                    //#
                    digit = (char) (rand.nextInt(10) + '0');
                    }

                else if (i == 3)
                    {
                    //Sym
                    String symbols = "!@#$%^&*()-_=+[]{}|\\';:,.<>?/~`";
                    digit = symbols.charAt(rand.nextInt(symbols.length()));
                    }
                }

                System.out.print(digit);

            }

        try {
        Thread.sleep(3000);
        } catch (InterruptedException b) {
        b.printStackTrace();
        }
        System.out.println("\n\n\n");
        System.out.println("""
                
                            .-""-.
                           / .--. \\
                          / /    \\ \\
                          | |    | |
                          | |.-""-.|
                         ///`.::::.`\\
                        ||| ::/  \\:: ;
                        ||; ::\\__/:: ;
                         \\\\\\ '::::' /                                     *Fabulous art from ascii.co.uk
                           `=':-..-'`                                        *I edited it for the Java Compiler
                """);


        System.out.println("\n");

        showSystemProperties = true;
        try {
        Thread.sleep(1500);
        } catch (InterruptedException b) {
        b.printStackTrace();
        }

        //Resolution
        if (showSystemProperties)
            {
            System.out.println("\n\n\n");
            System.out.println("Java Version: " + System.getProperty("java.version") + " by " + System.getProperty("java.vendor"));
            System.out.println("User: " + System.getProperty("user.name"));  //<-- TURNED OFF FOR PRIVACY IN THE VIDEO
            System.out.print("Operating System: " + System.getProperty("os.name"));
            System.out.println(" " + System.getProperty("os.version"));
            System.out.println ("By: Blu");
            System.out.println ("Coded for Hack Club High Seas on November 30th 2024");
            }
    }
}