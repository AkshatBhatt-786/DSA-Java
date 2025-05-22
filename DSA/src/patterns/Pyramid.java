package patterns;

public class Pyramid 
{
    public void print_pattern(int rows) 
    {
        for (int i=0; i <= rows; i++)
        {
            for (int space=0; space <= rows - i; space ++) 
            {
                System.out.print(" ");
            }
            for (int j=0; j < i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
