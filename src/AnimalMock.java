import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class AnimalMock {

    private List<Animal> animalList;

    public AnimalMock() {
        animalList = new LinkedList<>();
        animalList.add(new Animal(
                "OVO",
                "VOA",
                new BigDecimal(20.5))
        );
        animalList.add(new Animal(
                "CARNE",
                "VOA",
                new BigDecimal(57.3))
        );
        animalList.add(new Animal(
                "OVO",
                "RASTEJA",
                new BigDecimal(43.0))
        );
        animalList.add(new Animal(
                "PLANTAS",
                "NADA",
                new BigDecimal(32.4))
        );
        animalList.add(new Animal(
                "OVO",
                "ANDA",
                new BigDecimal(32.4))
        );
        animalList.add(new Animal(
                "CARNE",
                "ANDA",
                new BigDecimal(110.8))
        );
        animalList.add(new Animal(
                "PLANTA",
                "ANDA",
                new BigDecimal(87.2))
        );
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }
}
