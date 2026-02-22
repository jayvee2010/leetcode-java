import java.util.Scanner;
class Solution
{
    public int binaryGap(int n) 
    {
    String bin= Integer.toBinaryString(n);
    int start=-1;
    int maxgap=0;
    for(int i=0;i<bin.length();i++)
    {
        char character = bin.charAt(i);
        if (character == '1') 
        {
            if (start != -1)
            {
                int a= i-start; 
                if(maxgap<a)
                {
                    maxgap=a;
                }
            }
         start=i;
        }
       


    }
    return maxgap;
}
}

