package lt.Sinomoro.Uzduotis11;

import java.util.*;

/*TODO: galima deti visiskai identikus pakartotinius irasus, to neturetu buti galima daryti.
*
*/

public class Main {

    static private boolean addPerson(Zmogus zmogus,Map<String,Set<Zmogus>> map)
    {
        if(map.containsKey(zmogus.getasmensKodas()))
        {
            Set<Zmogus> temp = map.get(zmogus.getasmensKodas());
            //Neveikia kazkodel, reikia pasigilint i contains veikima su objektais
            /*if(temp.contains(zmogus))
            {
                System.out.println("Žmogus su tokiais duomenimis jau egzistuoja!");
                return false;
            }
            else
            {
                temp.add(zmogus);
                return true;
            }*/
            temp.add(zmogus);
            return true;
        }
        else
        {
            Set<Zmogus> temp = new HashSet<>();
            temp.add(zmogus);
            map.put(zmogus.getasmensKodas(),temp);
            return true;
        }
    }

    public static void main(String[] args)
    {
        Map <String,Set<Zmogus>> sarasas = new TreeMap<>();// vietoj set gal reiktu naudoti irgi map su pilnu vardu, ar gimimo metais, ar kokiais nors kitais dupmenimis kaip raktu.

        addPerson(new Zmogus("Antanas","Jonaitis","2514"),sarasas);
        addPerson(new Zmogus("Antanas","Lukaitis","2582"),sarasas);
        addPerson(new Zmogus("Jonas","Jonaitis","4564"),sarasas);
        addPerson(new Zmogus("Lukas","Pirmasis","4585"),sarasas);
        addPerson(new Zmogus("Lukas","Antrasis","4585"),sarasas);
        addPerson(new Zmogus("Povilas","Jonaitis","4454"),sarasas);
        addPerson(new Zmogus("Jonas","Aukstaitis","4568"),sarasas);

        for(Set<Zmogus> i:sarasas.values())
        {
            for(Zmogus j:i)
            {
                System.out.println(j.getFullName());
            }
            System.out.println("********************************");
        }
    }
}
