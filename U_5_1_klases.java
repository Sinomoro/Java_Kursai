public class U_5_1_klases {

    public static void main (String[] args)
    {
        Zmogus[] grupe = new Zmogus[3];

        grupe[0] = new Zmogus("Jonas1","Jonaitis1");
        grupe[1] = new Zmogus("Jonas2","Jonaitis2");
        grupe[2] = new Zmogus("Jonas3","Jonaitis3");

        Zmogus[] grupe2 = {new Zmogus("Lukas","Lukaitis"),new Zmogus("Jonas","Jonaitis"),new Zmogus("Petras","Petraitis")};


        System.out.println("Pirma grupe : ");
        for(Zmogus element:grupe)
        {
            System.out.println("    " +  element.getFullName());
        }

        System.out.println("Antroji grupe : ");
        for(Zmogus element:grupe2)
        {
            System.out.println("    " +  element.getFullName());
        }

    }
}
