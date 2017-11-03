package collection.sort.selectSort;

public class Simple {
    public void simple_sort(int[] array){
        int min, minPos;
        for (int i=0; i<array.length; i++){
            min = array[i];
            minPos = i;
            for (int j=i+1; j<array.length; j++){
                if(min > array[j]){
                    min = array[j];
                    minPos = j;
                }
            }
            array[minPos] = array[i];
            array[i] = min;
        }
    }
}
