class Solution {
    public static int gcd(int a, int b)
    {
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public int getfirst(int num)
    {
        while(num>=10)
        {
            num=num/10;
        }
        return num;
    }
    public int countBeautifulPairs(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int fd = getfirst(nums[i]);
                int ld = nums[j]%10;

                if(gcd(fd,ld)==1) cnt++;
            }
        }
        return cnt;
    }
}