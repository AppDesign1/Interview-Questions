public class Interview1
{
    public static void main(String args[])
    {
        Interview1 obj = new Interview1();
        int a[] = {1,2,5};
        obj.res(a);
    }
    //{9,9,9} --> {1,0,0,0}
    void res(int arr[])
    {
        int len = arr.length;	//3
        int n = 0;
	int i;
        for(i=0;i<len;i++)
        {
            n += (arr[i]*(int)Math.pow(10,len-i-1));//9+10^2   900
        }
        n++;
        
        //length of the number
        int a,t=n,c=0;
        while(t>0)
        {
            a=t%10;
            c++;
            t = t/10;
        }
        
        int new_arr[] = new int[c];
        
        i=1;
        t=n;
        while(t>0)
        {
            a=t/(int)Math.pow(10,c-i);
            new_arr[i-1] = a;
            t = t-a*(int)Math.pow(10,c-i);
            i++;
        }
        
        System.out.print("New Array = {");
        for(i=0;i<new_arr.length;i++)
        {
            if(i<new_arr.length-1)
            {
                System.out.print(new_arr[i]+",");
            }
            else
            {
                System.out.print(new_arr[i]+"}");
            }
        }       
    }
}
