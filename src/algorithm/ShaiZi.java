package algorithm;

import java.util.HashMap;
import java.util.Set;

/**
 * 给出n个骰子，计算n个骰子之和，并给出其出现的概率
 */

public class ShaiZi {
    static int n=3;
    static int[] a=new int[n];
    static {
        for (int j=0; j<n; j++){
            a[j]=0;
        }
    }
    static HashMap result = new HashMap();
    static int sum=0;
    public static void main(String[] args) {
        for (int i=0; i<Math.pow(6,n); i++){
            sum =0;
            getDivided(i,0);
            for (int j=0; j<n; j++){
                sum+=a[j];
            }
            sum+=n;
            if (result.get(sum)==null){
                result.put(sum,0);
            }
            result.put(sum, (int)result.get(sum) + 1);
        }
        //输出结果
        Set set = result.keySet();
        for(Object a:set){
            System.out.println("和为："+a+"出现的次数为"+result.get(a)+",出现的概率为："+
                    (int)result.get(a)*100/Math.pow(6, n)+"%");
        }
    }

    public static int getDivided(int num, int times){
        a[times]=num%6;
        if (times == n-1){
            return 0;
        }
        return getDivided(num/6, times+1);
    }
}
