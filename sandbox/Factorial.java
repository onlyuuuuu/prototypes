import java.math.BigDecimal;
import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.printf("Give me an integer to do factorial: ");
            long input = scanner.nextInt();
            if (input == -99)
            {
                System.out.printf("\nNothing to do here, exiting the program...\n");
                return;
            }
            System.out.printf("\n========== START ==========\n\n");
            System.out.printf("Calculating factorial of %d:\n\n", input);
            if (input < 0)
                System.out.printf("Cannot calculate factorial of %d since it is a negative number!\n", input);
            else if (input == 0)
                System.out.printf("Everybody knows 0! = 1\n");
            else if (input == 1)
                System.out.printf("Everybody knows 1! = 1\n");
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
                System.out.printf(builder + "\n");
            }
            System.out.printf("\n========== DONE ===========\n\n");
        }
    }
}
