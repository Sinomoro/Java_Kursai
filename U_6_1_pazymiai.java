public class U_6_1_pazymiai {
    public static void main(String[] args)
    {

        int[] paz = {4,6,7,2,5};
        Mokinys petras = new Mokinys("Petras", "Petraitis", 12,new int[] {6,8});
        int sum = 0;
        petras.setSurname("Jonaitis");
        petras.setName("Antanaitis");
        for (int i = 0; i<petras.trimestras.length;i++)
        {
            sum += petras.trimestras[i];
        }
        System.out.println(petras.getFullName()+ " " +1.0 *sum/petras.trimestras.length);
    }
}
