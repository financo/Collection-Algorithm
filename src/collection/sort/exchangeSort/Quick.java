package collection.sort.exchangeSort;

public class Quick {
    public void quick_sort(int[] array,int lo ,int hi){
        if(lo>=hi){
            return ;
        }
        int index=partition(array,lo,hi);
        quick_sort(array,lo,index-1);
        quick_sort(array,index+1,hi);
    }

    public static int partition(int []array,int lo,int hi){
        int key=array[lo];
        while(lo<hi){
            while(array[hi]>=key&&hi>lo){
                hi--;
            }
            array[lo]=array[hi];
            while(array[lo]<=key&&hi>lo){
                lo++;
            }
            array[hi]=array[lo];
        }
        array[hi]=key;
        return hi;
    }
}
