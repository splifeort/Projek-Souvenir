import java.util.*;
import java.util.Date;

public class Fragrant extends Souvenir
{
    private int fragrantSize;
    private int fragrantBrand;
    private int fragrantQuan;

    public Fragrant()  {}

    public Fragrant(String cN, String cI, String cNo, String ad, String dO, String t,int Br,int s, int q) 
    {
        super(cN,cI,cNo,ad,dO,t);
        this.fragrantSize =s;
        this.fragrantBrand=Br;
        this.fragrantQuan = q;
    }

    public Fragrant(Fragrant a)
    {
        this.fragrantSize = a.fragrantSize;
        this.fragrantBrand= a.fragrantBrand;
        this.fragrantQuan = a.fragrantQuan;
    }

    public int getFragrantSize()  {return this.fragrantSize; }

    public int getFragrantBrand() {return this.fragrantBrand;}

    public int getFragrantQuan () {return this.fragrantQuan;}

    public void setFragrantSize(int s)  {this.fragrantSize = s; }

    public void setFragrantBrand(int Br) {this.fragrantBrand = Br;}

    public void setFragrantQuan(int q) {this.fragrantQuan = q;}

    public double calcFee()
    {
        double charge = 0.00;
        if (getFragrantBrand() == 1)
        {
            if (getFragrantSize() == 1)
                charge = getFragrantQuan () * 54;
            else if (getFragrantSize() == 2)
                charge = getFragrantQuan () * 80;
            else if (getFragrantSize() == 3)
                charge = getFragrantQuan () * 120;
        }
        else if (getFragrantBrand() == 2)
        {
            if (getFragrantSize() == 1)
                charge = getFragrantQuan () * 64;
            else if (getFragrantSize() == 2)
                charge = getFragrantQuan () * 96;
            else if (getFragrantSize() == 3)
                charge = getFragrantQuan () * 150;
        }
        else if (getFragrantBrand() == 3)
        {
            if (getFragrantSize() == 1)
                charge = getFragrantQuan () * 74;
            else if (getFragrantSize() == 2)
                charge = getFragrantQuan () * 105;
            else if (getFragrantSize() == 3)
                charge = getFragrantQuan ()* 160;
        }
        else  if (getFragrantBrand() == 4)
        {
            if (getFragrantSize() == 1)
                charge = 85;
            else if (getFragrantSize() == 2)
                charge = 120;
            else if (getFragrantSize() == 3)
                charge = 170;
        }
        else  if (getFragrantBrand() == 5)
        {
            if (getFragrantSize() == 1)
                charge = 63;
            else if (getFragrantSize() == 2)
                charge = 85;
            else if (getFragrantSize() == 3)
                charge = 125;
        }
        return charge;
    }

    public String bran()
    {
        String bran="";
        if (getFragrantBrand()==1){bran = " Cristian Dior";}
        else if(getFragrantBrand()==2){bran = "Burberry";}
        else if(getFragrantBrand()==2){bran = "Calvin Klein"; }
        else if(getFragrantBrand()==2){bran = "Prada";}
        else if(getFragrantBrand()==2){bran = "Versace";}
        return bran;
    }

    public String ml()
    {
        String ml="";
        if(fragrantSize==1){ml ="80ml";}
        else if(fragrantSize==2){ml ="90ml";}
        else if(fragrantSize==3){ml ="100ml";}
        return ml;
    }

    public String toString()
    {
        Date date = new Date();

        String str = "";
        str = 
        "\r\nName             :  " + super.custName +
        "\r\nID               :  " + super.custIC +
        "\r\nContact Number   :  " + super.getContactNumber() +
        "\r\nAddress          :  " + super.getAddress() +
        "\r\nDate order       :  " + super.getDateOrder() + 
        "\r\nType             :  " + "Fragrant" +
        "\r\nQuantity         :  " + this.getFragrantQuan() + 
        "\r\nFragrant Brand   :  " + bran() +
        "\r\nFragrant Size    :  " + ml() +
        "\r\nFee              :  " + this.calcFee() ;
        return str;
    }
}
