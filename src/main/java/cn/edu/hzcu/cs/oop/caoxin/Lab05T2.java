package cn.edu.hzcu.cs.oop.caoxin;

class Stock{
    /**
     * @brief 股票代码
     */
    String symbol;
    /**
     * @brief 股票名字
     */
    String name;

    /**
     * @brief 前一日的股票值
     */
    private double previousClosingPrice;

    /**
     * @brief 当时的股票值
     */
    private double currentPrice;

    Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    /**
     * 获取当前相比前一日股票值的变化百分比
     * @return 当前相比前一日股票值的变化百分比
     */
    double getChangePercent() {
        return 100 * (currentPrice - previousClosingPrice) / previousClosingPrice;
    }

    /**
     * @brief 获取当时的股票值
     * @return 当时的股票值
     */
    double getCurrentPrice() {
        return currentPrice;
    }

    /**
     * @brief 获取前一日的股票值
     * @return 前一日的股票值
     */
    double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    /**
     * @brief 设置当时的股票值
     * @param currentPrice 当时的股票值
     */
    void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     * @brief 设置前一日的股票值
     * @param previousClosingPrice 前一日的股票值
     */
    void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }
}

public class Lab05T2 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);
        System.out.printf("Previous Closing Price: %.2f\n", stock.getPreviousClosingPrice());
        System.out.printf("Current Price: %.2f\n", stock.getCurrentPrice());
        System.out.printf("Price Change: %f%%", stock.getChangePercent());
    }
}