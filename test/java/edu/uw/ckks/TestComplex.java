package test.java.edu.uw.ckks;

import ckks.Complex;

public class TestComplex {

    private static final String HPDIC_BRAND = "HPDIC MOD: ";
    
    public static void main(String[] theArgs) {
        Complex complex = new Complex(19, 81);
        System.out.println(HPDIC_BRAND + complex);
    }
}
