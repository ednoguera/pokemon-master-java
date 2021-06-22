package project.pokemonmaster;

import java.util.ArrayList;
import java.util.HashMap;

public class Bag {
    //TODO: Implements all the categories that bag will receive ()
    private float money;
    private ArrayList insigniaList, itemList;
    //Dict implementation of pokeball
    private HashMap pokeballList = new HashMap<String, Float>();

    public void bag(
        float money,
        HashMap pokeballList,
        ArrayList insigniaList,
        ArrayList itemList
    ) {
        this.money = money;
        this.pokeballList = pokeballList;
        this.insigniaList = insigniaList;
        this.itemList = itemList;
    }

    //GETTERS AND SETTERS | MODIFIERS
    public void setMoney(float money){
        this.money = money;
    }

    public float getMoney(){
        return money;
    }

    public void setInsigniaList(ArrayList insigniaList) {
        this.insigniaList = insigniaList;
    }

    public ArrayList getInsigniaList() {
        return insigniaList;
    }

    public void setItemList(ArrayList itemList) {
        this.itemList = itemList;
    }

    public ArrayList getItemList() {
        return itemList;
    }
    //END OF GETTERS AND SETTERS

    public void buyPokeball(String itemName, float itemPrice){
        this.money -= itemPrice;
        this.pokeballList.put(itemName, itemPrice);
    }

    public void usePokeball(String itemName) {
        this.pokeballList.remove(itemName);
    }

    public HashMap getPokeballList(){
        return pokeballList;
    }

    public int getPokeballsAmount(){
        return pokeballList.size();
    }

    public ArrayList getPokeballNames() {
        ArrayList pokeballNameList = new ArrayList<>();
        for (Object pokeballName : pokeballList.keySet()) {
            pokeballNameList.add(pokeballName);
        }
        return pokeballNameList;
    }

    public void addItem(String name, int amount){

    }
}
