package collection.sort.exchangeSort;

public class Bubble {
    public void bubble_sort(int[] array){
        int temp;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length-1; j++){
                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public void bubble_sort1(int[] array){
        int temp;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length-i-1; j++){
                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public void bubble_sort2(int[] array){
        int temp;
        boolean flag = true;
        for (int i=0; i<array.length; i++){
            if (flag){
                flag = false;
                for (int j=0; j<array.length-i-1; j++){
                    if (array[j] > array[j+1]){
                        temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                        flag = true;
                    }
                }
            }
        }
    }

}
