public class Main {
    public static void main(String[] args) {
        stocks obj = new stocks();
        obj.setMarketCap(10);
        obj.setCurrentRatio(20);
        System.out.println(obj.getMarketCap());
        System.out.println(obj.getCurrentRatio());
        System.out.println(obj.getTickerName());
        System.out.println(obj.getTickerSymbol());

    }
}