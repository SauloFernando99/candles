import org.example.Cake;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CandlesTest {

    @Test
    void testBlowCandles(){
        int candlesNumber = 5;
        List<Integer> candlesSizes = Arrays.asList(4, 4, 4, 1, 3);

        Cake cake = new Cake(candlesNumber, candlesSizes);

        int unLitCandles = cake.blowCandles();

        assertEquals(3, unLitCandles);
    }

    @Test
    public void testNumberOfCandles() {
        List<Integer> candlesSizes = Arrays.asList(4, 4, 4, 1, 3);

        assertThrows(IllegalArgumentException.class, () -> new Cake(10, candlesSizes));
    }

    @Test
    public void testNegativeNumberOfCandles() {
        List<Integer> candlesSizes = Arrays.asList(4, 4, 4, 1, 3);

        assertThrows(IllegalArgumentException.class, () -> new Cake(-5, candlesSizes));
    }
}
