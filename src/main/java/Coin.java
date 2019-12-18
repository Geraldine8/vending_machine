public class Coin {

    private CoinType coinType;
    private Long id;

    public Coin(CoinType coinType){
        this.coinType = coinType;
    }

    public Coin(){

    }

    public CoinType getCoinType() {
        return coinType;
    }

    public void setCoinType(CoinType coinType) {
        this.coinType = coinType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValueFromCoin(){
        return this.coinType.getValue();
    }
}
