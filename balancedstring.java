class balancedstring{
    public static void main(String args[]){
        String num="24123";    //Input: num = "1234"   Output: false
//even indices -- 1 + 3 == 4 , odd indices -- 2 + 4 == 6.     4 not equal to 6, num is not balanced.

    int s1=0, s2 = 0, n = num.length();
    for(int i=0; i<n; i++) {
        char ch = num.charAt(i);
        if(i%2 == 0) {
            s2 += (ch-'0');  
        } else {
            s1 += (ch-'0');
        }
    }
    if(s1==s2){
        System.out.print("balanced");
    }else{
        System.out.print("not balanced");
    }
    }
}