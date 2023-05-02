package l10;

import java.util.ArrayList;
import java.util.List;

public class l10 {

    public static void main(String[] args) {
        
        CarInfoContainer container = new CarInfoContainer();
        container.add(new CarContainer("Chief auto mechanic", "Subaru Center Lviv", "from 9 to 18", 100000,
                new String[] { "6+ years experience", "Director" }));
        container.add(new CarContainer("Manager", "Service center \"VIDI Armada\"", "from 8 to 17", 50000, 
                new String[] { "4+ years experience", "Administrator" }));
        container.add(new CarContainer("Electrical Master", "Autoservice-Alliance BMW Poltava", "from 8 to 18", 150000,
                new String[] { "5+ years experience", "Chief electrician" }));
        container.add(new CarContainer("Junior mechanic", "Autotechnical center \"Bukko\"", "from 8 to 18", 6500,
                new String[] { "1+ years experience", "Mechanic" }));
       

     // get
        System.out.println(container.get(0).toString());

        // get all
        List<CarContainer> agencyList = container.getAll();
        for (CarContainer agency : agencyList) {
            System.out.println(agency.toString());
        }

        // remove
        container.remove(container.get(0));

        // clear
        container.clear();

        // isEmpty
        System.out.println(container.isEmpty());
    }
}
