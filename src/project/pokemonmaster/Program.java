package project.pokemonmaster;

public class Program {

    public static void main(String[] args) {

        PokemonTrainer pokemonTrainer1 = new PokemonTrainer();
        PokemonTrainer pokemonTrainer2 = new PokemonTrainer();
        PokeMart mart = new PokeMart();

        //ENUMS
        ShopHealthItems shopHealthItems;
        ShopStatusItems shopStatusItems;
        ShopPokeballs shopPokeballs;

        pokemonTrainer1.setName("Alice");

        pokemonTrainer1.setMoney(15000);
        pokemonTrainer1.getMoney();

        //POKEMART ZONE:==============================================

        System.out.println(pokemonTrainer1.getTrainerSummary());
    }
}
