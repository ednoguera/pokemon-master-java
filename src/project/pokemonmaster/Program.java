package project.pokemonmaster;

public class Program {

    public static void main(String[] args) {

        PokemonTrainer pokemonTrainer1 = new PokemonTrainer();
        PokemonTrainer pokemonTrainer2 = new PokemonTrainer();

        pokemonTrainer1.setName("Alice");
//        pokemonTrainer2.setName("Ellinha");

        pokemonTrainer1.bag.setMoney(3000);
        pokemonTrainer1.bag.buyPokeball("pokeball", 300);
        pokemonTrainer1.bag.buyPokeball("premierball", 150);
        pokemonTrainer1.bag.buyPokeball("greatball", 500);

        pokemonTrainer1.capturePokemon("pokeball");

//        pokemonTrainer2.bag.setPokeDollar(2000);

        System.out.println(pokemonTrainer1.getTrainerResume());
        System.out.println(pokemonTrainer2.getTrainerResume());
    }
}
