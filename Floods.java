//This class will define the structure of the CSV file that the
//City of Windsor uses to store the flood services info in.

public class Floods
{
	//attributes
    private String PG;
    private String inspections;
    private String method;
    private String date;
    private String num;
    private String street;
    private String ward;

	//default constructor
    public Floods() { }
	//overloaded constructor
    public Floods(String PG, String inspections, String method, String date, String num, String street, String ward)
    {
        this.PG = PG;
        this.inspections = inspections;
        this.method = method;
        this.date = date;
        this.num = num;
        this.street = street;
        this.ward = ward;
    }

    //get methods
	//comment
    public String getPG()
    {
        return PG;
    }
    public String getInspections()
    {
        return inspections;
    }
    public String getmethod()
    {
        return method;
    }
    public String getDate()
    {
        return date;
    }
    public String getNum()
    {
        return num;
    }
    public String getStreet()
    {
        return street;
    }
    public String getWard()
    {
        return ward;
    }

    //set methods
    public void setPG()
    {
        this.PG = PG;
    }
    public void setInspections()
    {
        this.inspections = inspections;
    }
    public void setmethod()
    {
        this.method = method;
    }
    public void setDate()
    {
        this.date = date;
    }
    public void setNum()
    {
        this.num = num;
    }
    public void setStreet()
    {
        this.street = street;
    }
    public void setWard()
    {
        this.ward = ward;
    }
    //random comment
    //override toString
    public String toString()
    {
        return "PG/F: " + PG + ", Department: " + inspections + ", Contact Method: " + method + ", Date: " + date + ", Number: " + num + ", Street: " + street + ", Ward: " + ward;
    }


}
