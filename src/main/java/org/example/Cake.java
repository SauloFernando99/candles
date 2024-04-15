package org.example;

import java.util.List;

public class Cake {
    private int candlesNumber;
    private List<Integer> candlesSizes;

    public Cake(int candlesNumber, List<Integer> candlesSizes) {
        this.candlesNumber = candlesNumber;
        this.candlesSizes = candlesSizes;
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
