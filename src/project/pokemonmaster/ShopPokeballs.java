package project.pokemonmaster;

public enum ShopPokeballs {
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

    ShopPokeballs (String name, String description, float catchRate, float price) {
        this.name = name;
        this.description = description;
        this.catchRate = catchRate;
        this.price = price;
    }
}
