/** This is the driver class.
**  It handles the interactions with the user in the terminal interface.
*/

import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);//gets user input
        String filename;
        String street;
        System.out.print("Enter the name of the dataset you would like to view:\n ");
        filename = sc.next(); 
        List<Floods> records = Load(filename);
        System.out.println("1. Display All Records.");
        System.out.println("2. Display Flood Services History using Street Name.");
        System.out.println("0. Quit");

        //Variables
        boolean quit = false;
        int menuItem;

        //Switch between the different commands on the menu.

        do {
            System.out.print("Choose menu item: ");
            menuItem = sc.nextInt();
            switch (menuItem)
            {
                //Displaying all records.
                case 1:
                    System.out.println("Displaying all data: ");
                    for (Floods i: records)
                    {
                        System.out.println(i);
                    }
                    break;
                //Displays all inquiries of floods on street entered.
                case 2:
                    System.out.print("Welcome to The City of Windsor's Flooding History API ");
					System.out.print("ENTER THE STREET NAME: ");
                    street = sc.next();
                    System.out.println("Floodings reported at the street entered are: ");
                    Street nearest = new Street(street, records);
                    List<Floods> nearCentres = nearest.find(records);
                    for(Floods i: nearCentres)
                        System.out.println(i);

                case 0:
                    quit = true;
                    break;

                default:
            }
        }while(!quit);
    }
	
	//Method to load the file entered by the user.
    //A new method to load the datasets dynamically will be added in next iteration.

    private static List<Floods> Load(String filename)
    {
        String line = "";
        List<Floods> floods = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            while ((line = br.readLine())!=null)
            {
                String[] data = line.split(",");
                if (!line.startsWith("F"))
                {
                    Floods centre = createRecord(data);
                    floods.add(centre);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return floods;
    }
	
	//Method to stores individual records from the loaded file.
    //Each line will be treated as one record saved in ArrayList. 

    public static Floods createRecord(String[] data)
    {
        return new Floods(data[0], data[1], data[2], data[3], data[4],data[5], data[6]);
    }
}