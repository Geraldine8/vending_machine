public enum CoinType {
    ONE_PENCE_COIN(0.01),//invalid
    TWO_PENCE_COIN(0.02),//invalid
    FIVE_PENCE_COIN(0.05),
    TEN_PENCE_COIN(0.10),
    TWENTY_PENCE_COIN(0.20),
    FIFTY_PENCE_COIN(0.50),
    ONE_POUND_COIN(1.00),
    TWO_POUND_COIN(2.00);


    private final double value;

    CoinType(double value){
        this.value = value;
    }

    public double getValue(){
        return this.value;
    }

}


