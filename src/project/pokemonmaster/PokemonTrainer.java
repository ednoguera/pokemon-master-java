package project.pokemonmaster;

import java.lang.System;
import java.util.ArrayList;

/**
 * Represents a Pokemon Trainer
 */
public class PokemonTrainer {

    //TODO: Create a capture system ()
    //TODO: Create a Pokemon class and remove the pokemon attibute on PokemonTrainer class ()
    //TODO: Create a System battle with other player ()
    //TODO: Create a BUY/SELL system to interact with PokeMart
    //------------------------------------------------------------------------------
    //DONE:
    // Create a Bag class and associate it to the pokemon trainer

    private String name;
    private char gender;

    //Implement the classes here
    public Bag bag = new Bag();
    public Pokemon pokemon = new Pokemon();

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

    //CAPTURE ZONE:===============================================
    //TODO: Instanciate an pokemon object and use it here.
    public void capturePokemon(String pokeballName) {
        bag.usePokeball(pokeballName);
    }

    //BATTLE ZONE=================================================
    //TODO: Create battles with other trainers

    //This method sumarize the Pokemon trainer, and you will see
    //all of important information about him/her
    public String getTrainerResume(){
        return "================POKÉMON TRAINER SUMMARY================\nTrainer name: " + getName()
                + "\nMoney: " + bag.getMoney()
                + "\nPokeballs: " + bag.getPokeballsAmount()
                + "\nPokeball's compartment: " + bag.getPokeballNames()
                + "\nItems list: "
                + "\nRegistered Pokémon's: "
                + "\nInsignias bag: ";
    }
}
