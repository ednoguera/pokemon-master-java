package project.pokemonmaster;

import java.util.HashMap;

//TODO: Implements withdrawMoney method (X)
//TODO: Implements saveMoney method (X)
//TODO: Implements all transactions method to create a purchase history ()
public class Bank {

    private enum TransactionTypes {
        INCOME("income"),
        OUTCOME("outcome");

        private String description;

        TransactionTypes (String description) {
            this.description = description;
        }
    }

    private float totalFunds;
    private HashMap transaction = new HashMap<String, Float>();

    public void bank (HashMap transaction, float totalFunds) {
        this.transaction = transaction;
        this.totalFunds = totalFunds;
    }

    public void withdrawMoney (float amount) {
        this.transaction.put(TransactionTypes.OUTCOME, amount);
        this.totalFunds -= amount;
    }

    public void saveMoney (float amount) {
        this.transaction.put(TransactionTypes.INCOME, amount);
        this.totalFunds += amount;
    }

    public float showAccountFunds () {
        return this.totalFunds;
    }

}
