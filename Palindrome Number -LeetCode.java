class Solution
 {
    public boolean isPalindrome(int x) 
    {
        int count = 0;
        int temp = x;
        int r=0;
        int s=0;
        if (x < 0) return false;
        while (temp != 0) 
        {
            r=temp%10;
            s= (s*10)+r;
            temp = temp / 10;
            if (x < 0) return false;
        }
       return x==s;   
    }
     
    
}
