package collection.sort;

import collection.sort.exchangeSort.Bubble;
import collection.sort.exchangeSort.Quick;
import collection.sort.insertSort.Insert;
import collection.sort.insertSort.Shell;
import collection.sort.selectSort.Heap;
import collection.sort.selectSort.Simple;

import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        Bubble bubble = new Bubble();
        Insert insert = new Insert();
        Simple simple = new Simple();
        Shell shell = new Shell();
        Quick quick = new Quick();
        Heap heap = new Heap();
        int num =10000;

        int[] a = random.getRandom(num);

        long start = System.currentTimeMillis();
//        System.out.println("***********************");
//        insert.insert_sort(a);
//        bubble.bubble_sort(a);
//        simple.simple_sort(a);
        shell.shell_sort(a);
//        quick.quick_sort(a, 0 , a.length-1);
//        heap.heap_sort(a);

        long end = System.currentTimeMillis();
        System.out.println(num +"个随机数排序耗时"+(end - start)+"毫秒");
//        random.print(b);
        System.out.println(random.checkSort(a));
    }
}
