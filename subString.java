class subString{
    public static String calsubString(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str="cbgbcbcgcdbccbh";
       // System.out.println(calsubString(str,0,5));
        System.out.println(str.substring(2,7));
    }
}