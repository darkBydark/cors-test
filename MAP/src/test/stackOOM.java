package test;

import java.util.ArrayList;
import java.util.List;

public class stackOOM {
    public static void main(String[] args){
        Double a = 600d;
        double b =100d;
        double v = a + 100 - b;
        System.out.println(v);
    }
}
