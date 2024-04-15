import org.example.CakeCandles;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CakeCandlesTest {

    @Test
    void testBlowCandles(){
        int candlesNumber = 5;
        List<Integer> candlesSizes = Arrays.asList(4, 4, 4, 1, 3);

        CakeCandles cakeCandles = new CakeCandles(candlesNumber, candlesSizes);

        int unLitCandles = cakeCandles.blowCandles();

        assertEquals(3, unLitCandles);
    }

    @Test
    public void testNumberOfCandles() {
        List<Integer> candlesSizes = Arrays.asList(4, 4, 4, 1, 3);

        assertThrows(IllegalArgumentException.class, () -> new CakeCandles(10, candlesSizes));
    }

    @Test
    public void testNegativeNumberOfCandles() {
        List<Integer> candlesSizes = Arrays.asList(4, 4, 4, 1, 3);

        assertThrows(IllegalArgumentException.class, () -> new CakeCandles(-5, candlesSizes));
    }

    @Test
    public void testNegativeCandleSize() {
        List<Integer> candlesSizes = Arrays.asList(4, 4, -1, 1, 3);

        assertThrows(IllegalArgumentException.class, () -> new CakeCandles(5, candlesSizes));
    }
}
