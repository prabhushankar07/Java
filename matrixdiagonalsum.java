class matrixdiagonalsum{
    public static void stringcal(int a,int b){
        int sum1=0;
        sum1+=a+b;
        System.out.println(sum1);
    }



    public static void main(String args[]){
        
        /*int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=a.length;
        int sum=0;
        int i=0,j=0;
        //To calculate primary diagonal
        while(i<n){
            sum+=a[i][j];
            i++;
            j++;
        }
        //To  calculate secondary diagonal
        i=0;
        j=n-1;
        while(j>=0){
            if(i!=j){
                sum+=a[i][j];
            }
                j--;
                i++;
        }
        System.out.println(sum);   */

        stringcal(5,6);
        
    }
}

/*Initializing matrix
        int rows = 2;
        int cols = 3;
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
*/