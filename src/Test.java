import java.util.Scanner;

public class Test {

    static void msg(){
        System.out.print("car speed = ");
    }

    static void msg1(){
        System.out.println("please input variable");
    }

    static int FindSpeed(int t, int v){//параметри
        int s = v*t;
        return s;
    }

    public static void main(String[] args) {
        int res = FindSpeed(2,70);// аргументи
        int prise = res * 7;
        System.out.println(prise);
        System.out.println(FindSpeed(7,9));
    }
}
