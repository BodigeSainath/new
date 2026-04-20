public class stockMain {
    public static void main(String[] args) {
        Stock s=new Stock();
        Stock s1=new Stock();
        s.settickerName("Apple INC");
        s.settickerSymbol("AAPl");
        s1.settickerName("Tesla INC");
        s1.settickerSymbol("TSLA");
        s.setDetails(12344,1.7);
        s1.setDetails(36673,3.7);
        s.getDetails();
        s1.getDetails();;
    }
}
