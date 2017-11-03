package collection.sort;

public class Random {

    public int[] getRandom(int num){
        return this.getRandom(num, false);
    }

    public int[] getRandom(int num, boolean isPrint){
        long start = System.currentTimeMillis();
        int[] array = new int[num];
        for (int i=0; i<num; i++){
            array[i] = (int)Math.round(Math.random()*num*100);
            if (isPrint){
                System.out.println(array[i]);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("生成"+num+"个随机数耗时"+(end-start)+"毫秒");
        return array;
    }

    public boolean checkSort(int[] array){
        boolean flag = true;
        for (int i=0; i<array.length-1; i++){
            if (array[i] > array[i+1]){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public void print(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
