package project.pokemonmaster;

public enum ShopStatusItems {
    ANTIDOTE_CURE_POISONING("antidote", 200),
    AWAKENING_CURE_SLEEP("awakening", 200),
    BURN_HEAL_CURE_BURNING("burn heal", 250),
    PARALIZE_HEAL_CURE_PARALIZE("paralize heal", 250);

    private String itemName;
    private float price;

    ShopStatusItems(String itemName, float price) {
        this.itemName = itemName;
        this.price = price;
    }
}
