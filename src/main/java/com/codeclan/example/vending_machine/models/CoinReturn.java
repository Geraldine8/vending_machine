package com.codeclan.example.vending_machine.models;

import java.util.ArrayList;
import java.util.List;

public class CoinReturn {

    private List<Coin> coins;

    public CoinReturn(){
        this.coins = new ArrayList<Coin>();
    }

    public List<Coin> getCoins(){
        return coins;
    }

    public void addCoins(Coin coin){
        this.coins.add(coin);
    }


}
