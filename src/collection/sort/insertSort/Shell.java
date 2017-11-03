package collection.sort.insertSort;

public class Shell {
    public void shell_sort(int[] array){
        int j = 0;
        int temp = 0;
        for (int increment = array.length / 2; increment > 0; increment /= 2) {
//            System.out.println("increment:" + increment);
            for (int i = increment; i < array.length; i++) {
                // System.out.println("i:" + i);
                temp = array[i];
                for (j = i - increment; j >= 0; j -= increment) {
                    // System.out.println("j:" + j);
                    // System.out.println("temp:" + temp);
                    // System.out.println("array[" + j + "]:" + array[j]);
                    if (temp < array[j]) {
                        array[j + increment] = array[j];
                    } else {
                        break;
                    }
                }
                array[j + increment] = temp;
            }
        }
    }

}
