class shortestpath{
    public static double shortpathfromorigin(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //south
            if(dir=='S'){
                y--;
            }
            //north
            else if(dir=='N'){
                y++;
            }
            //east
            else if(dir=='E'){
                x++;
            }
            //west
            else{
                x--;
            }

        }
        int x2=x*x;
        int y2=y*y;
        return Math.sqrt(x2+y2);
    }
    public static void main(String args[]){
        String path="WNEENESENNN";
        double res=shortpathfromorigin(path);
        System.out.println(res);
    }
}