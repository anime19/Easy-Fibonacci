import java.io.*;
import java.util.*;
class fibonacci
{
    int fib(long N)
    {
        
        
        int [] arr=new int[60];
        
        arr[0]=0;
        arr[1]=1;
        
        
       // System.out.print(arr[0]+" "+arr[1]+" ");
        
        for(int i=2;i<60;i++)
        {
            
            arr[i]=arr[i-1]+arr[i-2];
            arr[i]%=10;
            
            
           //System.out.print(arr[i]+" ");
            
            
        }
        //System.out.println();
        int count=0;
       while(N>1)
       {
           N=(N/2);

           count++;

       }
       
       long t=Long.valueOf((long)Math.pow(2,count));
       
      // System.out.println(res);
      int z=(int)(t%60);
      z--;
      z+=60;
      z=z%60;
      
       
       return arr[z];
    }
    

    public static void main(String[] args)
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            String s=br.readLine();
            int T=Integer.valueOf(s);
            for(int i=0;i<T;i++)
            {
                s=br.readLine();
                long N=Long.valueOf(s);
                fibonacci ob=new fibonacci();
               
                
                
                System.out.println(ob.fib(N));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}