package nz.ac.eit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Converter_Test {
    private Converter conv;
    @Before
    public void setup(){
        conv = new Converter();
    }

    @Test
    public void test_1toGerman_Einz() {

        String translated = conv.convert(1,"german");
        assertEquals("1 is not giving einz","einz",translated);
    }

    @Test
    public void test_1toFrench_Un() {

        String translated = conv.convert(1,"french");
        assertEquals("1 is not giving un","un",translated);
    }

    @Test
    public void test_Neg5toFrench_Null() {

        String translated = conv.convert(-5,"french");
        assertEquals("1 is not giving null",null,translated);
    }

    @Test
    public void test_Neg10toGerman_Null() {

        String translated = conv.convert(-10,"german");
        assertEquals("1 is not giving null",null,translated);
    }



}