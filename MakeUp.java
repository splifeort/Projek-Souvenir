import java.util.*;
import java.util.Date;

public class MakeUp extends Souvenir
{
    private int set_MakeUp;
    private int quantity_MakeUp;
    private int item_MakeUp;
    private int colour_MakeUp;

    public MakeUp(){}

    public MakeUp(String n , String id , String cNo ,String ad, String dO, String t, int s , int i, int c, int q)
    {
        super(n , id, cNo, ad, dO, t);
        this.set_MakeUp = s ;
        this.item_MakeUp = i;
        this.colour_MakeUp = c;
        this.quantity_MakeUp = q ;
    }

    public MakeUp(MakeUp a)
    {
        this.set_MakeUp = a.set_MakeUp;
        this.item_MakeUp = a.item_MakeUp;
        this.colour_MakeUp = a.colour_MakeUp;
        this.quantity_MakeUp = a.quantity_MakeUp; 

    }

    public int getSetOfMakeUp(){ return this.set_MakeUp;}

    public int getItemOfMakeUp(){return this.item_MakeUp;}

    public int getColourOfMakeUp(){return this.colour_MakeUp;}

    public int getQuantityOfMakeUp(){return this.quantity_MakeUp;}

    public void setSetOfMakeUp(int s ) {this.set_MakeUp = s;}
    public void setItemOfMakeUp ( int i ){this.item_MakeUp = i;}

    public void setColourOfMakeUp ( int c ){this.colour_MakeUp = c;}

    public void setQuantityOfMakeUP( int q ){ this.quantity_MakeUp = q;}

    public double calcFee()
    {
        double charge=0.00;

        if(getSetOfMakeUp() == 1)
        {
            if(getItemOfMakeUp() == 1)
            {
                if(getColourOfMakeUp() == 1)
                {charge = getQuantityOfMakeUp() * 50.00;}
                else if(getColourOfMakeUp() == 2)
                {charge = getQuantityOfMakeUp() * 50.00;}
            }
            else if(getItemOfMakeUp() == 2)
            {
                if(getColourOfMakeUp() == 1)
                {charge = getQuantityOfMakeUp() * 60.00;}
                else if(getColourOfMakeUp() == 2)
                {charge = getQuantityOfMakeUp() * 60.00;}
            }
            else if(getItemOfMakeUp() == 3)
            {
                if(getColourOfMakeUp() == 1)
                {charge = getQuantityOfMakeUp() * 70.00;}
                else if(getColourOfMakeUp() == 2)
                {charge = getQuantityOfMakeUp() * 70.00;}
            }

        }
        else if(getSetOfMakeUp() == 2)
        {
            if(getItemOfMakeUp() == 1)
            {
                if(getColourOfMakeUp() == 1)
                {charge = getQuantityOfMakeUp() * 50.00;}
                else if(getColourOfMakeUp() == 2)
                {charge = getQuantityOfMakeUp() * 50.00;}
            }
            else if(getItemOfMakeUp() == 2)
            {
                if(getColourOfMakeUp() == 1)
                {charge = getQuantityOfMakeUp() * 60.00;}
                else if(getColourOfMakeUp() == 2)
                {charge = getQuantityOfMakeUp() * 60.00;}
            }
            else if(getItemOfMakeUp() == 3)
            {
                if(getColourOfMakeUp() == 1)
                {charge = getQuantityOfMakeUp() * 70.00;}
                else if(getColourOfMakeUp() == 2)
                {charge = getQuantityOfMakeUp() * 70.00;}
            }
        }

        else if(getSetOfMakeUp() == 3)
        {
            if(getItemOfMakeUp() == 1)
            {
                if(getColourOfMakeUp() == 1)
                {charge = getQuantityOfMakeUp() * 50.00;}
                else if(getColourOfMakeUp() == 2)
                {charge = getQuantityOfMakeUp() * 50.00;}
            }
            else if(getItemOfMakeUp() == 2)
            {
                if(getColourOfMakeUp() == 1)
                {charge = getQuantityOfMakeUp() * 60.00;}
                else if(getColourOfMakeUp() == 2)
                {charge = getQuantityOfMakeUp() * 60.00;}
            }
            else if(getItemOfMakeUp() == 3)
            {
                if(getColourOfMakeUp() == 1)
                {charge = getQuantityOfMakeUp() * 70.00;}
                else if(getColourOfMakeUp() == 2)
                {charge = getQuantityOfMakeUp() * 70.00;}
            }
        }

        else if(getSetOfMakeUp() == 4)
        {
            if(getItemOfMakeUp() == 1)
            {
                if(getColourOfMakeUp() == 1)
                {charge = getQuantityOfMakeUp() * 50.00;}
                if(getColourOfMakeUp() == 2)
                {charge = getQuantityOfMakeUp() * 50.00;}
            }
            else if(getItemOfMakeUp() == 2)
            {
                if(getColourOfMakeUp() == 1)
                {charge = getQuantityOfMakeUp() * 60.00;}
                if(getColourOfMakeUp() == 2)
                {charge = getQuantityOfMakeUp() * 60.00;}
            }
            else if(getItemOfMakeUp() == 3)
            {
                if(getColourOfMakeUp() == 1)
                {charge = getQuantityOfMakeUp() * 70.00;}
                if(getColourOfMakeUp() == 2)
                {charge = getQuantityOfMakeUp() * 70.00;}
            }
        }

        return charge;
    }

    public String make()
    {
        String make = "";
        if(set_MakeUp==1){make="Yves Saint Laurent";}
        else if(set_MakeUp==2){make="Estee Lauder";}
        else if(set_MakeUp==3){make="Chanel";}
        else if(set_MakeUp==4){make="Mary Kay";}
        return make;
    }

    public String ite()
    {
        String ite="";
        if (item_MakeUp==1){ite="Lipstick";}
        else if (item_MakeUp==2){ite="Eyeshadow";}
        else if (item_MakeUp==3){ite="Foundation";}
        return ite;
    }

    public String color()
    {
        String color="";
        if (item_MakeUp==1)
        {
            if(colour_MakeUp==1){color = "Red";}
            else if(colour_MakeUp==2){color ="Pink";}
        }
        else if (item_MakeUp==2)
        {
            if(colour_MakeUp==1){color = "Black";}
            else if(colour_MakeUp==2){color ="Brown";}
        }
        else if (item_MakeUp==3)
        {
            if(colour_MakeUp==1){color = "Almond";}
            else if(colour_MakeUp==2){color ="Beige";}
        }
        return color;
    }

    public String toString()
    {
        Date date = new Date();
        String str = "";
        str = 
        "\r\nName                   : " + super.custName + 
        "\r\nID                     : " + super.custIC + 
        "\r\nContact Number         : " + super.getContactNumber() +
        "\r\nAddress                : " + super.getAddress() +
        "\r\nDate order             : " + super.getDateOrder() + 
        "\r\nType                   : " + "Make-Up" +
        "\r\nSet Of Make Up         : " + make() +
        "\r\nItem Of Make Up        : " + ite() + 
        "\r\nColour Of Make Up      : " + color() +
        "\r\nQuantity Of Make Up    : " + this.getQuantityOfMakeUp() + 
        "\r\nFee                    : " + this.calcFee() ;
        return str;

    }

}
