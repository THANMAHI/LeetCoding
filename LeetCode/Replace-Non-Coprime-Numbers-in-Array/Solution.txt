class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i:nums){
            int pres = i;
            while(!res.isEmpty()){
                int last = res.get(res.size()-1);
                int gc = gcd(last,pres);
                if(gc==1) break;
                res.remove(res.size()-1);
                pres = lcm(last,pres,gc);
            }
            res.add(pres);
        }
        return res;
    }

    private int gcd(int a, int b){
        while(b!=0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }

    private int lcm(int a, int b, int gc){
        return (int)((long)a/gc*b);
    }
}