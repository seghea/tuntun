import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Mosticchio Simone
 *
 */
import static org.junit.Assert.assertEquals;
class CalcolatriceTest{

    @Test
    void test1() {
        Calcolatrice c = new Calcolatrice(50, 30);
        double risAtteso = 80;
        double risOttenuto =c.Somma();
        assertEquals(risAtteso,risOttenuto,0);
    }
    @Test
    void test2() {
        Calcolatrice c = new Calcolatrice(40000, 10);
        double risAtteso = 4010;
        double risOttenuto =c.Somma();
        assertEquals(risAtteso,risOttenuto,0);
    }
    @Test
    void test3() {
        Calcolatrice c = new Calcolatrice(6, 3);
        double risAtteso = 2;
        double risOttenuto =c.Divisione();
        assertEquals(risAtteso,risOttenuto,0);
    }
    @Test
    void test4() {
        Calcolatrice c = new Calcolatrice(5, 3);
        double risAtteso = 1.66;
        double risOttenuto =c.Divisione();
        assertEquals(risAtteso,risOttenuto,0.1);
    }
    @Test
    void test5() {
        Calcolatrice c = new Calcolatrice(0, 5);
        double risAtteso = 0;
        double risOttenuto =c.Divisione();
        assertEquals(risAtteso,risOttenuto,0);
    }
    @Test
    void test6() {
        Calcolatrice c = new Calcolatrice(5, 0);
        double risAtteso = Float.POSITIVE_INFINITY;
        double risOttenuto =c.Divisione();
        assertEquals(risAtteso,risOttenuto,0);
    }
}