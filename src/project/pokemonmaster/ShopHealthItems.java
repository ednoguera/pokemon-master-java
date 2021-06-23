package project.pokemonmaster;

public enum ShopHealthItems {
    POTION_20_HP("potion", 20, 200),
    SUPER_POTION_60_HP("super potion", 60, 500),
    HIPER_POTION_120_HP("hiper potion", 120, 750),
    MAX_POTION_ALL_HP("max potion", 100, 1000),
    REVIVE_20_AP("revive", 20, 500),
    MAX_REVIVE_ALL_HP("max revive", 100, 1500);

    private String itemName;
    private int recoverHp;
    private float price;

    ShopHealthItems (String itemName, int recoverHp, float price) {
        this.itemName = itemName;
        this.recoverHp = recoverHp;
        this.price = price;
    }
}
