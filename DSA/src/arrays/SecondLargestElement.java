package arrays;

public class SecondLargestElement
{
    public int getSecondLargestElement(int arr[])
    {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > first)
            {
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first)
            {
                second = arr[i];
            }
        }

        return second;
    }
}
