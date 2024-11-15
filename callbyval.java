class callbyval{
    public static void main(String args[]){
        int a=5;
        int r=changingAvar(a);
        System.out.println(r);
    }
    public static int changingAvar(int a){
        a=10;
        return a;
    }
}