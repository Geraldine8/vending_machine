public enum CoinType {
    One_Pence_Coin(0.01),
    Two_Pence_Coin(0.02),
    Five_Pence_Coin(0.05),
    Ten_Pence_Coin(0.10),
    Twenty_Pence_Coin(0.20),
    Fifty_Pence_Coin(0.50),
    One_Ponud_Coin(1.00),
    Two_Pound_Coin(2.00);


    private final double value;

    CoinType(double decimal_value){
        this.value = decimal_value;
    }

    public double getValue(){
        return this.value;
    }

}


