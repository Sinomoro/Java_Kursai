package lt.Sinomoro.Uzduotis14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Saugykla<E> implements Iterable<E> {

   private List<E> sarasas = new ArrayList<>();

    ReverseOrder reverseIterator = new ReverseOrder();

    public void add(E element)
    {
        sarasas.add(element);
    }

    @Override
    public Iterator<E> iterator() {
        return sarasas.iterator();
    }

    public class ReverseOrder  implements Iterable<E>
    {
        int cursor =0;

        @Override
        public Iterator<E> iterator() {

            cursor =sarasas.size()-1;

            return new Iterator<>() {
                @Override
                public boolean hasNext() {
                    return cursor >= 0;
                }

                @Override
                public E next() {
                    return sarasas.get(cursor--);
                }
            };
        }



    }

}
