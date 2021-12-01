package test.java;

import main.java.Algorithm1;
import main.java.Algorithm2;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Algorithm2Test {

    @Test
    public void algorithm() {
        Algorithm2 algorithm1 = new Algorithm2(200, 100, 10);
        assertNotEquals(0, algorithm1.soldiers);
        assertNotEquals(0, algorithm1.count);
        assertNotEquals(0, algorithm1.iterations);

    }

}