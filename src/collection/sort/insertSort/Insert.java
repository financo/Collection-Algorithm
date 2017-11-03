package collection.sort.insertSort;

public class Insert {
    public void insert_sort(int[] array){
        int temp;
        for (int i=1; i<array.length; i++){
            temp = array[i];
            for (int j=i-1; j>=0; j--){
                if (temp < array[j]){
                    array[j+1] = array[j];
                    if (j==0){
                        array[0] = temp;
                    }
                }else {
                    array[j+1] = temp;
                    break;
                }
            }
        }
    }
}
