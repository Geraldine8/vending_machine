import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Drawer> drawers;
    private List<Coin> coins;
    private List<CoinReturn> coinReturns;

    public VendingMachine(){
        this.drawers = new ArrayList<Drawer>();
        this.coins = new ArrayList<Coin>();
        this.coinReturns = new ArrayList<CoinReturn>();
    }

    public boolean addCoin(Coin coin) {
       if (coin.getValueFromCoin() <= 0.02) {
         return false;
       }

       return this.coins.add(coin);
    }
}
