package lt.Sinomoro.Uzduotis15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;




public class Container<T>{

    List<T> sarasas = new ArrayList<>();


    public void add(T element)
    {
        sarasas.add(element);
    }

    List<T> order (Comparator<T> komparatorius)
    {
        Collections.sort(sarasas,komparatorius);
        return sarasas;
    }

}
