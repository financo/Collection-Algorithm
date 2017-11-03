package algorithm;

/**
 * 汉诺塔
 */
public class Hanno {
    public static void main(String[] args) {
        recursion("x", "y", "z", 5);
    }

    public static void recursion(String from, String to, String assist, int floor){
        if (floor ==1){
            System.out.println(from+"--->"+to);
            return;
        }else {
            recursion(from, assist, to, floor-1);
            System.out.println(from+"--->"+to);
            recursion(assist, to, from, floor-1);
        }
    }
}
