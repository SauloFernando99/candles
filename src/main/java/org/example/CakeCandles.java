package org.example;

import java.util.List;

public class CakeCandles {
    private int candlesNumber;
    private List<Integer> candlesSizes;

    public CakeCandles(int candlesNumber, List<Integer> candlesSizes) {
        if (candlesNumber != candlesSizes.size()) {
            throw new IllegalArgumentException("The number of candle sizes does not correspond to the number of candles");
        }
        for (int size : candlesSizes) {
            if (size < 0) {
                throw new IllegalArgumentException("The candles size cannot be negative");
            }
        }

        this.candlesNumber = candlesNumber;
        this.candlesSizes = candlesSizes;
    }

    public int blowCandles() {
        if (candlesSizes == null || candlesSizes.isEmpty()) {
            return 0;
        }

        int maxCount = 0;
        int maxCandleSize = candlesSizes.get(0);

        for (int size : candlesSizes) {
            if (size > maxCandleSize) {
                maxCandleSize = size;
                maxCount = 1;
            } else if (size == maxCandleSize) {
                maxCount++;
            }
        }

        return maxCount;
    }

    public int getCandlesNumber() {
        return candlesNumber;
    }

    public void setCandlesNumber(int candlesNumber) {
        this.candlesNumber = candlesNumber;
    }

    public List<Integer> getCandlesSizes() {
        return candlesSizes;
    }

    public void setCandlesSizes(List<Integer> candlesSizes) {
        this.candlesSizes = candlesSizes;
    }
}
