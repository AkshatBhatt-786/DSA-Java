package patterns;

public class RightTriangle {
    public void print_pattern(int rows)
    {
        for(int i=0; i <= rows; i++)
        {
            for(int j=0; j < i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
