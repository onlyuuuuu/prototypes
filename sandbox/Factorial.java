import java.math.BigDecimal;
import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.print("Give me an integer to do factorial: ");
            long input = scanner.nextInt();
            if (input == -99)
            {
                System.out.println("Nothing to do here, exiting the program...");
                return;
            }
            System.out.println("\n========== START ==========\n");
            System.out.println(String.format("Calculating factorial of %d:\n", input));
            if (input < 0)
                System.out.println(String.format("Cannot calculate factorial of %d since it is a negative number!", input));
            else if (input == 0)
                System.out.println(String.format("Everybody knows 0! = 1"));
            else if (input == 1)
                System.out.println(String.format("Everybody knows 1! = 1"));
            else
            {
                long result = 1;
                StringBuilder builder = new StringBuilder(input + "! = ");
                for (long i = input; i >= 2; i--)
                {
                    result *= i;
                    builder.append(i + " x ");
                }
                builder.append("1 = " + BigDecimal.valueOf(result));
                System.out.println(builder);
            }
            System.out.println("\n========== DONE ===========\n");
        }
    }
}
