import java.util.*;
import java.util.Date;

public class Chocolate extends Souvenir
{
    private int quanOfChoco;
    private int typeOfChoco;
    private int sizeOfChoco;

    //default constructor
    public Chocolate() {}

    //normal constructor
    public Chocolate(String n, String id, String cNo, String ad, String dO, String t, int tOC, int sOC, int qOC)
    {
        super(n, id, cNo, ad,dO, t);
        this.typeOfChoco = tOC;
        this.sizeOfChoco = sOC;
        this.quanOfChoco = qOC;
    }

    //copy constructor
    public Chocolate(Chocolate a)
    {
        this.typeOfChoco = a.typeOfChoco;
        this.sizeOfChoco = a.sizeOfChoco;
        this.quanOfChoco = a.quanOfChoco;
    }

    //retriever methods 
    public int getTypeOfChoco() {return this.typeOfChoco;}

    public int getSizeOfChoco() {return this.sizeOfChoco;}

    public int getQuanOfChoco() {return this.quanOfChoco;}
    //mutator methods

    public void setTypeOfChoco(int tOC) {this.typeOfChoco = tOC;}

    public void setSizeOfChoco(int sOC) {this.quanOfChoco = sOC;}

    public void setQuanOfChoco(int qOC) {this.quanOfChoco = qOC;}
    //Processor method: public double calcFee()
    public double calcFee()
    {
        double charge = 0.00;
        if(getTypeOfChoco() == 1)
        {
            if (getSizeOfChoco() == 1)
                charge = getQuanOfChoco() * 10;
            else if (getSizeOfChoco() == 2)
                charge = getQuanOfChoco() * 20;
            else if (getSizeOfChoco() == 3)
                charge = getQuanOfChoco() * 30;
        }
        else if(getTypeOfChoco() == 2)
        {
            if (getSizeOfChoco() == 1)
                charge = getQuanOfChoco() * 20;
            else if (getSizeOfChoco() == 2)
                charge = getQuanOfChoco() * 30;
            else if (getSizeOfChoco() == 3)
                charge = getQuanOfChoco() * 40;
        }
        else if(getTypeOfChoco() == 3)
        {
            if (getSizeOfChoco() == 1)
                charge = getQuanOfChoco() * 15;
            else if (getSizeOfChoco() == 2)
                charge = getQuanOfChoco() * 25;
            else if (getSizeOfChoco() == 3)
                charge = getQuanOfChoco() * 35;
        }
        return charge;
    }

    public String chocType()
    { String typ="";
        if(typeOfChoco==1){typ="Milk Chocolate ";}
        else if (typeOfChoco==2){typ="Dark Chocolate";}
        else if (typeOfChoco==3){typ="White Chocolate";}
        return typ;  
    }

    public String chocSize()
    {
        String siz="";
        if(sizeOfChoco==1){siz="Small";}
        else if(sizeOfChoco==2){siz="Big";}
        else if(sizeOfChoco==3){siz="Jumbo";}
        return siz;
    }
    //toString method 
    public String toString()
    {
        Date date = new Date();
        String str = "";
        str = 
        "\r\nName               : " + super.custName +
        "\r\nID                 : " + super.custIC +
        "\r\nContact Number     : " + super.getContactNumber() + 
        "\r\nAddress            : " + super.getAddress() + 
        "\r\nDate order         : " + super.getDateOrder() + 
        "\r\nType               : " + "Chocolate" +
        "\r\nQuantity of order  : " + this.getQuanOfChoco() +
        "\r\nType of Chocolate  : " + chocType() +
        "\r\nSize of Chocolate  : " + chocSize() +
        "\r\nFee                : " + this.calcFee();
        return str;       
    }
}
