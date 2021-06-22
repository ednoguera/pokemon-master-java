package project.pokemonmaster;

import java.util.ArrayList;
import java.util.HashMap;

//TODO: Implements an ENUM items (OK)
//TODO: Implements a BUY method ()
//TODO: Implements a SELL method ()
public class PokeMart {

    private ArrayList itemList = new ArrayList();
    private HashMap item = new HashMap<String, Float>();

    private enum ITEMS {
        ANTIDOTE_CURE_POISONING,
        AWAKENING_CURE_SLEEP,
        BURN_HEAL_CURE_BURNING,
        PARALIZE_HEAL_CURE_PARALIZE,
        ETHER,
        POTION_20_HP,
        SUPER_POTION_60_HP,
        HIPER_POTION_120_HP,
        MAX_POTION_ALL_HP,
        REVIVE_20_AP,
        MAX_REVIVE_ALL_HP
    }

    public void buyItem () {

    }
}
