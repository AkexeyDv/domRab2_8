package pro.sky.domRab2_8;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartamentService implements DepartamentInterface {
    private final List<Departament> departamentList = new ArrayList<>(List.of(
            new Departament(1, "Административный"),
            new Departament(2, "Производственный"),
            new Departament(3, "Бухгалтерия"),
            new Departament(4, "Транспортный"),
            new Departament(5, "ОТК")
    ));
    private final Validator departCheck = new Validator("Ошибка");

    @Override
    public String addDepart(int numDepart, String name) {
        try {
            departCheck.checkAddDepart(departamentList, numDepart, name);
        } catch (DepartamentException e) {
            throw new RuntimeException("Отдел с такими данными уже существует");
        }
        Departament newDepart = new Departament(numDepart, name);
        departamentList.add(newDepart);
        return newDepart.toString();
    }

    @Override
    public List<Departament> getDepartamentList() {
        return departamentList;
    }

    @Override
    public String toString() {
        return departamentList + " ";
    }
}
