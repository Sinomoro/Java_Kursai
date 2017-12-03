package lt.Sinomoro.Uzdavinys14;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Saugykla<E> {

    enum ENUM_iteratorOrder {ASCENDING,DESCENDING};
    List<E> sarasas = new ArrayList<>();
    ListIterator<E> iterator = sarasas.listIterator();
    ENUM_iteratorOrder iteratorOrder ;
    boolean flag_ListChanged = false;



    Saugykla(ENUM_iteratorOrder ordering)
    {
        iteratorOrder = ordering;
        resetIterator();
    }

    boolean isThereMore()
    {
        if (flag_ListChanged)
        {
            resetIterator();
            flag_ListChanged = false;
        }
        if (iteratorOrder == ENUM_iteratorOrder.ASCENDING)
        {
            return iterator.hasNext();
        }
        else
        {
            return iterator.hasPrevious();
        }
    }

    void resetIterator()
    {
        if (iteratorOrder == ENUM_iteratorOrder.ASCENDING)
        {
           iterator = sarasas.listIterator();
        }
        else
        {
            iterator = sarasas.listIterator();
            while(iterator.hasNext())
            {
                iterator.next();
            }
        }
    }

    E Pull()
    {
        if(isThereMore()) {
            if (iteratorOrder == ENUM_iteratorOrder.ASCENDING) {
                return iterator.next();
            } else {
                return iterator.previous();
            }
        }
        else {
            return null;
        }
    }
    void add(E element)
    {
        sarasas.add(element);
        flag_ListChanged = true;
    }

    void setOrder(ENUM_iteratorOrder order)
    {
        iteratorOrder = order;
        //flag_ListChanged = true;
    }
}
