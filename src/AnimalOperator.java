import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public abstract class AnimalOperator {
    public static List<Animal> filtrarPorAlimentacao(List<Animal> _animalList, String _alimentacao) {
        return _animalList
                .stream()
                .filter((it)->it.getAlimentacao() == _alimentacao)
                .collect(Collectors.toList());
    }

    public static List<Animal> filtrarPorLocomocao(List<Animal> _animalList, String _locomocao) {
        return _animalList
                .stream()
                .filter((it)->it.getLocomocao() == _locomocao)
                .collect(Collectors.toList());
    }

    public static Animal obterMaiorAnimal(List<Animal> _animalList) {
        Optional<Animal> reduce = _animalList.stream().reduce(BinaryOperator.maxBy(
                (a, b) -> a.getTamanho().compareTo(b.getTamanho())));
        return reduce.get();
    }

    public static Animal obterMenorAnimal(List<Animal> _animalList) {
        Optional<Animal> reduce = _animalList.stream().reduce(BinaryOperator.minBy(
                (a, b) -> a.getTamanho().compareTo(b.getTamanho())));
        return reduce.get();
    }
}
