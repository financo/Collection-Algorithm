package algorithm;

/**
 *约瑟夫问题
 */
public class Joseph {
    public static void main(String[] args) {
        int[] a = new int[41];
        for (int i=0; i<41; i++){
            a[i] = i+1;
        }

        int step=0;
        int pos=-1;
        int length = a.length;
        while(length>2){
            pos++;
            if (pos==a.length){
                pos=0;
            }
            if (a[pos]!=0){
                step++;
                if (step == 3){
                    a[pos]=0;
                    step=0;
                    length--;
                }
            }
        }

        for (int i=0; i<41; i++){
            System.out.print(a[i]+" ");
        }
    }
}
