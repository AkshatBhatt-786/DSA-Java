
import arrays.SecondLargestElement;

public class Main 
{
    public static void main(String[] args) 
    {
        int[] arr = {12, 35, 1, 10, 34, 1};
        SecondLargestElement sle = new SecondLargestElement();
        int secondLargest = sle.getSecondLargestElement(arr);
        System.out.println("The second largest element is: " + secondLargest);
    }
}
