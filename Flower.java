
import java.util.*;
import java.util.Date;

public class Flower extends Souvenir
{
    private int quanOfFlower;
    private int typeOfFlower;
    private int colorOfFlower;

    //default constructor
    public Flower() {}

    //normal constructor
    public Flower(String n, String id, String cNo, String ad, String dO, String t, int tOF, int cOF, int qOF)
    {
        super(n, id, cNo,ad,dO, t );
        this.typeOfFlower = tOF;
        this.colorOfFlower = cOF;
        this.quanOfFlower = qOF;
    }

    //copy constructor
    public Flower(Flower a)
    {
        this.typeOfFlower = a.typeOfFlower;
        this.colorOfFlower = a.colorOfFlower;
        this.quanOfFlower = a.quanOfFlower;
    }

    //retriever methods
    public int getTypeOfFlower() {return this.typeOfFlower;}

    public int getColorOfFlower() {return this.colorOfFlower;}

    public int getQuanOfFlower() {return this.quanOfFlower;}
    //mutator methods
    public void setTypeOfFlower(int tOF) {this.typeOfFlower = tOF;}

    public void setSizeOfFlower(int sOF) {this.quanOfFlower = sOF;}

    public void setQuanOfFlower(int qOF) {this.quanOfFlower = qOF;}

    //Processor method: public double calcFee()
    public double calcFee()
    {
        double charge = 0.00;
        if(getTypeOfFlower() == 1)
        {
            if (getColorOfFlower() == 1)
                charge = getQuanOfFlower() * 10;
            else if (getColorOfFlower() == 2)
                charge = getQuanOfFlower() * 12;
            else if (getColorOfFlower() == 3)
                charge = getQuanOfFlower() * 14;
        }
        else if(getTypeOfFlower() == 2)
        {
            if (getColorOfFlower() == 1)
                charge = getQuanOfFlower() * 10;
            else if (getColorOfFlower() == 2)
                charge = getQuanOfFlower() * 12;
            else if (getColorOfFlower() == 3)
                charge = getQuanOfFlower() * 14;
        }
        else if(getTypeOfFlower() == 3)
        {
            if (getColorOfFlower() == 1)
                charge = getQuanOfFlower() * 10;
            else if (getColorOfFlower() == 2)
                charge = getQuanOfFlower() * 12;
            else if (getColorOfFlower() == 3)
                charge = getQuanOfFlower() * 14;
        }
        return charge;
    }

    public String flo()
    {
        String flo ="";
        if(typeOfFlower==1){flo = "Orchid";}      
        else if(typeOfFlower==2){flo = "Rose";}
        else if(typeOfFlower==3){flo = "Hibiscus";}
        return flo;
    }

    public String col(){
        String col ="";
        if(typeOfFlower==1)
        {
            if(colorOfFlower==1){col = "Red";}
            else if(colorOfFlower==2){col = "White";}
            else if(colorOfFlower==3){col ="Violet";}
        }
        else if(typeOfFlower==2)
        {
            if(colorOfFlower==1){col = "Blue";}
            else if(colorOfFlower==2){col = "Yellow";}
            else if(colorOfFlower==3){col = "Pink";}
        }
        else if(typeOfFlower==3)
        {
            if(colorOfFlower==1){col = "Red";}
            else if(colorOfFlower==2){col = "Blue";}
            else if(colorOfFlower==3){col ="Yellow";}
        }
        return col;}

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
        "\r\nType               : " + "Flower" +
        "\r\nQuantity of order  : " + this.getQuanOfFlower() +
        "\r\nType of Flower     : " + flo() +
        "\r\nColor of Flower    : " + col() +
        "\r\nFee                : " + this.calcFee();
        return str;       
    }
}
