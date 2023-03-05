import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        AnimalMock animalMock = new AnimalMock();
        List<Animal> animalList = animalMock.getAnimalList();

        List<Animal> filtradoPorAlimentacao = AnimalOperator.filtrarPorAlimentacao(animalList, "OVO");
        System.out.println("Filtrando por tipo de alimentação:");
        System.out.println(filtradoPorAlimentacao);

        List<Animal> filtradoPorLocomocao = AnimalOperator.filtrarPorLocomocao(animalList, "VOA");
        System.out.println("\nFiltrando por tipo de locomoção:");
        System.out.println(filtradoPorLocomocao);

        Animal maiorAnimal = AnimalOperator.obterMaiorAnimal(animalList);
        System.out.println("\nObtendo o maior animal da lista:");
        System.out.println(maiorAnimal);

        Animal menorAnimal = AnimalOperator.obterMenorAnimal(animalList);
        System.out.println("\nObtendo o menor animal da lista:");
        System.out.println(menorAnimal);
    }


}