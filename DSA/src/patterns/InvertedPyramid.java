package patterns;

public class InvertedPyramid 
{
    public void print_pattern(int rows) 
    {
        for (int i = 0; i < rows; i++)
        {
            for (int space = 0; space < i; space++)
            {
                System.out.print(" ");
            }
            for (int star = 0; star < rows - i; star++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
