//This class will look for the records containing the street name entered by user

import java.util.ArrayList;
import java.util.List;

public class Street {
    String streetname;
    List<Floods> cFloods;
    public Street(String street, List<Floods> cFloods)
    {
        this.streetname = street;
        this.cFloods = cFloods;

    }
    public List<Floods> find(List<Floods> cFloods)
    {
        List<Floods> found = new ArrayList<Floods>();
        for (Floods i: cFloods)
        {
            if(streetname.equalsIgnoreCase(i.getStreet()))
            {
                System.out.println(i);
                found.add(i);
            }
        }
        return found;
    }
}