import java.util.Scanner;

public class Test {

    static void msg(){
        System.out.print("car speed = ");
    }

    static void msg1(){
        System.out.println("please input variable");
    }

    static int FindSpeed(int t, int v){//ïàðàìåòðè
        int s = v*t;
        return s;
    }

    
    // i need coments for this method
    // твій код добре
    public static void main(String[] args) {
        int res = FindSpeed(2,70);// àðãóìåíòè
        int prise = res * 7;
        System.out.println(prise);
        System.out.println(FindSpeed(7,9));
    }
}
