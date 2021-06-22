package project.pokemonmaster;

import java.util.HashMap;

//TODO: Implements an ENUM items (X)
//TODO: Implements a BUY method (X)
//TODO: Implements a SELL method ()
public class PokeMart {

    HashMap itemHash = new HashMap<Enum, Integer>();

    private enum HealthItems {
        POTION_20_HP("potion", 20, 200),
        SUPER_POTION_60_HP("super potion", 60, 500),
        HIPER_POTION_120_HP("hiper potion", 120, 750),
        MAX_POTION_ALL_HP("max potion", 100, 1000),
        REVIVE_20_AP("revive", 20, 500),
        MAX_REVIVE_ALL_HP("max revive", 100, 1500);

        private String itemName;
        private int recoverHp;

        HealthItems (String itemName, int recoverHp, float price) {
            this.itemName = itemName;
            this.recoverHp = recoverHp;
        }
    }

    private enum StatusItems {
        ANTIDOTE_CURE_POISONING("antidote", 200),
        AWAKENING_CURE_SLEEP("awakening", 200),
        BURN_HEAL_CURE_BURNING("burn heal", 250),
        PARALIZE_HEAL_CURE_PARALIZE("paralize heal", 250);

        private String itemName;
        private float price;

        StatusItems(String itemName, float price) {
            this.itemName = itemName;
            this.price = price;
        }
    }

    private enum Pokeballs {

        POKE_BALL(
                "poke ball",
                "A device for catching wild Pokémon. " +
                        "It is thrown like a ball at the target. " +
                        "It is designed as a capsule system.",
                30,
                200
        ),
        GREAT_BALL(
                "great ball",
                "A good, high-performance Ball that provides a higher " +
                        "Pokémon catch rate than a standard Poké Ball.",
                50,
                400
        ),
        ULTRA_BALL(
                "ultra ball",
                "An ultra-performance Ball that provides a higher " +
                        "Pokémon catch rate than a Great Ball.",
                70,
                600
        );

        private String name, description;
        private float catchRate, price;

        Pokeballs (String name, String description, float catchRate, float price) {
            this.name = name;
            this.description = description;
            this.catchRate = catchRate;
            this.price = price;
        }
    }

    public void buyItem (Enum item, int amount) {
        this.itemHash.put(item, amount);
    }


}
