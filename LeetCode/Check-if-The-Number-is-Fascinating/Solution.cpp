class Solution {
    public boolean isFascinating(int n) {
        String str1 = Integer.toString(n);
        String str2 = Integer.toString(2*n);
        String str3 = Integer.toString(3*n);
        String str = str1+str2+str3;
        if(str.length()!=9) return false;
        char arr[] = str.toCharArray();
        Arrays.sort(arr);

        String f_string = new String(arr);
        return f_string.equals("123456789");
    }
}