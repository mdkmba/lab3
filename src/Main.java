import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        int num;
        double numsqu;
        double numcube;
        int count;
        String fin;
        String col1 = "Number";
        String col2 = "Squared";
        String col3 = "Cubed";
        String divdr = "=========";
        int loop1 = 0;
        int loop2 = 0;

        System.out.print("\n\n\n\n\nCreate a table of Squares & Cubes from 1 to the number you select.\n");
        do
        {
            loop2 = 0;
            System.out.print("Enter an integer: ");
            num = scnr.nextInt();

            System.out.printf("%-10s%-10s%-10s\n", col1, col2, col3);
            System.out.printf("%-10s%-10s%-10s\n", divdr, divdr, divdr);

            count = 1;
            do
            {
                numsqu = count;
                numsqu = Math.pow(numsqu,2.0);
                numcube = count;
                numcube = Math.pow(numcube,3.0);
                System.out.printf("%-10d%-10d%-10d\n", count, (int) numsqu, (int) numcube);
                count++;
            }while (count < (num + 1));

            do
            {
                System.out.print("Would you like to continue? (Type Yes or No): ");
                fin = scnr.next();
                fin = fin.toLowerCase();

                if (fin.equals("no") || fin.equals("n"))
                {
                    loop2 = 1;
                    loop1 = 1;
                }
                else if (fin.equals("yes") || fin.equals("y"))
                {
                    loop2 = 1;
                }

            }while(loop2 == 0);
        }while (loop1 == 0);
        System.out.println("Goodbye.");
    }

}