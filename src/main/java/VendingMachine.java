import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Drawer> drawers;
    private List<Coin> coins;
    private CoinReturn coinReturn;

    public VendingMachine(){
        this.drawers = new ArrayList<Drawer>();
        this.coins = new ArrayList<Coin>();
        this.coinReturn = new CoinReturn();
    }

    //Write a method to add a coin to the machine.
    //Write a method to check if coin is valid.
    //Amend addCoin method to check if coin is valid and if not add the coin to the coin return.

    public boolean addCoin(Coin coin) {
       if (coin.getValueFromCoin() <= 0.02) {
         return false;
       }

       return this.coins.add(coin);
    }

    //Write a method to buy product taking in a code. If there is enough money to buy selected product.

    public Product buyProduct(Code code) {
        Drawer drawer = this.findDrawerByCode(code);
        if (drawer == null) {
            return null;
        }

        if( drawer.getPrice() <= getTotalCoins()){
            return null;
        }

        double dif = getTotalCoins() - drawer.getPrice();
        return drawer.extractProduct();
    }

    private Drawer findDrawerByCode(Code code) {
        for(Drawer drawer : drawers){
            if (drawer.getCode() == code) {
                return drawer;
            }
        }

        return null;
    }

    public double getTotalCoins(){
        int total = 0;
        for (Coin coin : coins) {
            total += coin.getValueFromCoin();
        }
        return total;
    }

    public List<Coin> convertChangeToCoin(double changeOwed){
        List<Coin> coinsToReturn = new ArrayList<>();
        while(changeOwed > 0) {
            for (Coin coin : coins){
                if (changeOwed >= coin.getValueFromCoin()) {
                   coinsToReturn.add(coin);
                }
            }
        }
        return coinsToReturn;
    }

}
