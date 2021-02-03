package kurs.my;
import mylib.*;
public class Main {
    public static void main(String[] args) {
	    About.print();
	    Performance.start();
        for (int i = 0; i < 1_000; i++) System.out.println(i);
	    Performance.check();
    }
}
