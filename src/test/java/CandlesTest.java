import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CandlesTest {

    @Test
    void testBlowCandles(){
        int candlesNumber = 5;
        List<Integer> candlesSizes = Arrays.asList(4, 4, 4, 1, 3);

        Cake cake = new Cake(candlesNumber, candlesSizes);

        int unLitCandles = cake.blowCandles();

        assertEquals(3, unLitCandles);
    }
}
