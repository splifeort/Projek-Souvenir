import java.util.*;

public abstract class Souvenir
{
    protected String custName;
    protected String custIC;
    protected String contactNumber;
    protected String address;
    protected String type;
    protected String dateOrder;

    //Default constructor
    public Souvenir() {}

    //Normal constructor
    public Souvenir (String cN, String cI, String cNo, String ad,String dO, String t)
    {
        this.custName = cN;
        this.custIC = cI;
        this.contactNumber = cNo;
        this.address = ad;
        this.dateOrder = dO;   
        this.type = t;
    }

    //Copy constructor
    public Souvenir (Souvenir a)
    {
        this.custName = a.custName;
        this.custIC = a.custIC;
        this.contactNumber = a.contactNumber;
        this.address = a.address;
        this.dateOrder = a.dateOrder;
        this.type = a.type;

    }

    //Retriever Methods
    public String getCustName() {return this.custName;}

    public String getCustID() {return this.custIC;}

    public String getContactNumber(){return this.contactNumber;}
    public String getAddress() {return this.address;}
    public String getDateOrder() {return this.dateOrder;}
    public String getType() {return this.type;}
    //Mutator Methods
    public void setCustName(String cN) {this.custName = cN; }
    public void setCustId(String cI) {this.custIC = cI;}
    public void setContactNumber(String cNo) {this.contactNumber = cNo;}
    public void setAddress (String ad) {this.address = ad;}
    public void setdateOrder (String dO) {this.dateOrder = dO;}
    public void setType (String t) {this.type = t;}
    //Abstract processor method: abstract double calcCharge()
    public abstract double calcFee();
    //Abstract printer method: abstract String toString() 
    public abstract String toString();
}
