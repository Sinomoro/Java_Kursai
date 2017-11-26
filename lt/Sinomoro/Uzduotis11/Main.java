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

    static private void getPerson(String ssc,Map<String,Set<Zmogus>> map)
    {
        if(map.containsKey(ssc))
        {
            for(Zmogus i:map.get(ssc))
            {
                System.out.println(i.getFullName());
            }
        }
        else
        {
            System.out.println("Žmogus su tokiais duomenimis neegzistuoja.");
        }
    }

    static private void getAll(Map<String,Set<Zmogus>> map)
    {
        for (Set<Zmogus> i: map.values())
        {
            for(Zmogus j:i)
            {
                System.out.println(j.getFullName());
            }
        }
    }

    public static void main(String[] args)
    {
        Map <String,Set<Zmogus>> sarasas = new TreeMap<>();// vietoj set gal reiktu naudoti irgi map su pilnu vardu, ar gimimo metais, ar kokiais nors kitais dupmenimis kaip raktu.

        //Paprastasis methodas
        /*
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
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Possible commands:");
        System.out.println("-addPerson @name @surname @SSC");
        System.out.println("-getPerson @SSC");
        System.out.println("-getAll");
        System.out.println("-exit");
        System.out.println("-----------------------");
        System.out.println("command example: addPerson Jonas Jonaitis 1234");
        System.out.println("-----------------------");
        boolean exitFlag = false;
        while (!exitFlag)
        {
            System.out.print(">");
            String input = sc.nextLine();
            String[] command = input.split("\\s+");
            for (String i:command )
            {
                i = i.trim();
            }
            switch(command[0])
            {
                case "addPerson":
                    if(command.length == 4)// TODO check if @SSC contains only numbers
                    {
                        addPerson(new Zmogus(command[1],command[2],command[3]),sarasas);
                    }
                    else
                    {
                        System.out.println("Wrong command parameters");
                    }
                    break;
                case "getPerson":
                    if(command.length == 2)
                    {
                        getPerson(command[1],sarasas);
                    }
                    else
                    {
                        System.out.println("Wrong command parameters");
                    }
                    break;
                case "getAll":
                    if(command.length == 1)// TODO check if @SSC contains only numbers
                    {
                        getAll(sarasas);
                    }
                    else
                    {
                        System.out.println("Wrong command parameters");
                    }
                    break;
                case "exit":
                    exitFlag = true;
                    break;
                default:
                    System.out.println("Wrong command");
            }
        }



    }
}
