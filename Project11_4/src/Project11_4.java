import java.util.ArrayList;
import java.util.Scanner;

public class Project11_4 
{

	public static void main(String[] args) 
	{
		
		int num;
		ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sequence of numbers pressing enter after "
        		+ "each number when you are finished enter the number 0: ");
     
        do 
        {
            num = input.nextInt();
            if (num != 0) 
            {
                list.add(num); 
            }
        } while (num != 0);

        System.out.println("The max number of your array is " + max(list));
    }

    public static Integer max(ArrayList<Integer> list) 
    {

        if (list == null || list.size() == 0) return null;

        int max = list.get(0);
        for (int i : list) 
        {
            if (i > max) 
            {
                max = i;
            }
        }
        
        return max;

    }

}
	

