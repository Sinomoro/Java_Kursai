package lt.Sinomoro.Uzduotis14;


public class Main {
    public static void main (String[] args)
    {
        Saugykla<String> container = new Saugykla<>(Saugykla.ENUM_iteratorOrder.ASCENDING);

        container.add("Labas1");
        container.add("Labas2");
        container.add("Labas3");
        container.add("Labas4");
        container.add("Labas5");
        container.add("Labas6");
        container.add("Labas7");
        container.add("Labas8");
        container.add("Labas9");
        container.add("Labas10");

        while(container.isThereMore())
        {
            System.out.println("Narys " + container.Pull());
        }
        container.setOrder(Saugykla.ENUM_iteratorOrder.DESCENDING);
        while(container.isThereMore())
        {
            System.out.println("Narys " + container.Pull());
        }


    }
}
