package project.pokemonmaster;

import java.util.HashMap;

//TODO: Implements an ENUM items (X)
//TODO: Implements a BUY method (X)
//TODO: Implements a SELL method ()
//TODO: Implements an PAYMENT ORDER method to the bank ()
public class PokeMart {

    Bank bank = new Bank();

    HashMap itemHash = new HashMap<Enum, Integer>();

    /*PAYMENT ORDER: This method will be created and called inside the sellItem method.
    *They will be responsible to decrease money inside the treiner digital wallet */
    public void paymentOrder(float amount){
        bank.withdrawMoney(amount);
    }

    /*Send itemHash to the Bag.
    * TODO: Implements deliverItem method
    * */
    public void deliverItem() {

    }

    //This method receives an new order by the pokemon trainer
    public void sellItem(Enum item, int amount) {
        this.itemHash.put(item, amount);
//        paymentOrder();
    }
}
