 public class stocks {
        private String tickerSymbol;
        private String tickerName;
        private int marketCap;
        private int currentRatio;

        public String getTickerSymbol() {
            return tickerSymbol;
        }

        public String getTickerName() {
            return tickerName;
        }

        public int getMarketCap() {
            return marketCap;
        }

        public int getCurrentRatio() {
            return currentRatio;
        }

        public void setMarketCap(int marketCap) {
            this.marketCap = marketCap;

        }

        public void setCurrentRatio(int currentRatio) {
            this.currentRatio = currentRatio;
        }
    }
