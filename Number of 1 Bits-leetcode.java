class Solution {
public int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int sum=0;
        for(int i=0;i<binary.length();i++){
            if (binary.charAt(i)=='1'){
                sum=sum+1;
            }
        }
        System.out.println(sum);
        n=sum;
         return n;
         }
    }
   
