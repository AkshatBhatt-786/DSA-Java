package arrays;

public class GreatestElement 
{
    public int getGreatestElement(int[] arr) 
    {
        int greatest = arr[0];
        for (int i=0; i < arr.length; i++)
        {
            if (arr[i] > greatest)
            {
                greatest = arr[i];
            }
        }
        return greatest;
    }
}
