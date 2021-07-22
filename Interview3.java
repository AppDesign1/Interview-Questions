import java.util.*;
/**
 * Write a description of class Interview3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Interview3 
{
    ArrayList<Integer> a = new ArrayList<Integer>();
    public static void main(String args[])throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);
        Interview3 obj = new Interview3();
        System.out.print("Enter number of steps : ");
        int n = sc.nextInt();
        System.out.println("Enter the steps which can be moved : \nEnter 0 when done.");
        
        while(true)
        {
            int inp = sc.nextInt();
            if(inp==0)
            {
                break;
            }
            if(!obj.a.contains(inp))
            {
                obj.a.add(inp);
            }
        }
        Thread.sleep(2000);
        System.out.print("\n\nProcessing You Request");
        for(int i=1;i<=10;i++)
        {
            Thread.sleep(500);
            System.out.print(".");
        }
        System.out.print("\f");
        System.out.println("Number of Paths Possible : "+obj.number_of_ways(n));
    }
    
    int number_of_ways(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int nums[] = new int[n+1];
        nums[0] = 1;
        for(int i=1; i<=n; i++)
        {
            int total = 0;
            for(int j : a)
            {
                if(i-j >= 0)
                {
                    total +=nums[i-j];
                }
            }
            nums[i] = total;
        }
        return nums[n];
    }
}

