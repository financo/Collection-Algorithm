package algorithm;

/**
 * 八皇后问题
 */
public class EightQueen {
    static int count=0;
    public static void main(String[] args) {
        int[][] a=new int[8][8];
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                a[i][j]=0;
            }
        }
        recursion(a,0);
    }

    private static void recursion(int[][] a, int times){
        //便利第times行，如果符合要求，递归进入下一行
        for (int i=0; i<8; i++){
            //符合要求，进入下一行
            if (i>0){
                a[times][i-1]=0;
            }
            if (isOK(a, times, i)){
                a[times][i]=1;
                if (times==7){
                    System.out.println("第"+(++count)+"个");
                    printMatrix(a);
                    a[times][i]=0;
                }else{
                    recursion(a,times+1);
                    if (i==7){
                        a[times][7]=0;
                    }
                }
            }
        }
    }

    private static void printMatrix(int[][] a){
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean isOK(int[][] a, int i, int j){
        int m=i, n=j;
        while (m>0 && n>0){
            m--;n--;
            if (a[m][n]!=0){
                return false;
            }
        }
        m=i; n=j;
        while (m<7 && n>0){
            m++;n--;
            if (a[m][n]!=0){
                return false;
            }
        }
        m=i; n=j;
        while (m>0 && n<7){
            m--;n++;
            if (a[m][n]!=0){
                return false;
            }
        }
        m=i; n=j;
        while (m<7 && n<7){
            m++;n++;
            if (a[m][n]!=0){
                return false;
            }
        }
        int k=0;
        while (k>=0 && k<7){
            if (k!=j && a[i][k]!=0){
                return false;
            }
            k++;
        }
        k=0;
        while (k>=0 && k<7){
            if (k!=i && a[k][j]!=0){
                return false;
            }
            k++;
        }
        return true;
    }
}
