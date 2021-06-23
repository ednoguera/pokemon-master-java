package project.pokemonmaster;

import java.lang.System;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Represents a Pokemon Trainer
 */
//TODO: Create a capture system ()
//TODO: Create a Pokemon class and remove the pokemon attibute on PokemonTrainer class ()
//TODO: Create a System battle with other player ()
//TODO: Create a BUY/SELL system to interact with PokeMart ()
//TODO: Create a bank system to move the cash (x)
public class PokemonTrainer {

    private String name;
    private char gender;

    //Create object
    public Bag bag = new Bag();
    public Pokemon pokemon = new Pokemon();
    public Bank bank = new Bank();
    public PokeMart pokeMart = new PokeMart();


    public void pokemonTrainer(
            String name,
            char gender
    ) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //BANK ZONE:==================================================
    public void setMoney(float amount) {
        bank.saveMoney(amount);
    }

    public float getMoney() {
        return bank.showAccountFunds();
    }

    //POKEMART ZONE:==============================================
    public void buyItem(Enum item, int amount) {
        pokeMart.sellItem(item, amount);
    }

    //CAPTURE ZONE:===============================================
    //TODO: Instanciate an pokemon object and use it here.
    public void capturePokemon(String pokeballName) {
        bag.usePokeball(pokeballName);
    }

    //BATTLE ZONE=================================================
    //TODO: Create battles with other trainers



    //This method sumarize the Pokemon trainer, and you will see
    //all of important information about him/her
    public String getTrainerSummary(){
        return "================POKÉMON TRAINER SUMMARY================\nTrainer name: " + getName()
                + "\nMoney: " + getMoney()
                + "\nPokeballs: " + bag.getPokeballsAmount()
                + "\nPokeball's compartment: " + bag.getPokeballNames()
                + "\nItems list: "
                + "\nRegistered Pokémon's: "
                + "\nInsignias bag: ";
    }
}
