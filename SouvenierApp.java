import java.io.*;
import java.util.*;
import java.text.*;

public class SouvenierApp
{
    static Souvenir[] sv = new Souvenir[100];
    static int count=0;
    static Date date = new Date();
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public static void main(String[] args) throws Exception
    {
        try
        {
            Scanner in = new Scanner (System.in);
            Scanner inline = new Scanner(System.in);
            Scanner inline2 = new Scanner(System.in);
            Scanner inline3 = new Scanner (System.in);
            Scanner inline4 = new Scanner (System.in);
            Scanner inline5 = new Scanner (System.in);
            read();
            String str;

            FileWriter outp1 = new FileWriter ("SalesReport.txt");
            PrintWriter pw = new PrintWriter (outp1);

            double total,high, low, totm,totf,totg,totc;
            total=high=totm=totf=totg=totc =0;
            low=99999;
            System.out.println("Welcome to Afiq's Souvenir Shop"); 
            String npk = in.nextLine();
            while(true)
            {
                System.out.println("\f");
                System.out.println("   Afiq's Souvenir Shop"); 
                System.out.println("\tMENU");
                System.out.println(" [S] Search For Record");
                System.out.println(" [A] Add New Order");
                System.out.println(" [U] Update Order");
                System.out.println(" [D] Display Order");
                System.out.println(" [R] Remove Order");
                System.out.println(" [P] Print Receipt");
                System.out.println(" [X] Exit");
                System.out.print("\r\n Current number of order : " + count + " order(s).");
                System.out.print("\n\n Enter your choice(S/A/U/D/R/P/X): ");
                char opt = in.next().toUpperCase().charAt(0);

                if(opt=='S')
                {   
                    //System.out.println("\f");
                    System.out.println ("Search Account......");
                    System.out.println ("Enter customer's IC: ");
                    String custid = in.next();
                    boolean isFound = false;
                    for (int v=0;v<sv.length;v++)
                    {
                        if(sv[v] !=null && sv[v].getCustID().equalsIgnoreCase(custid))
                        {
                            System.out.println(sv[v].toString());
                            isFound = true;
                        }
                    }
                    if (isFound == false)
                    {
                        System.out.println("Account not found");
                    }
                    System.out.println ("Press [ENTER] to continue...");
                    String pk = inline2.nextLine();
                }
                else if(opt == 'U')
                {
                    System.out.println("List of orders : ");
                    for (int q = 0; q < count; q++)
                    {
                        System.out.println("\n[" + (q+1) + "]" + "Name :" + sv[q].getCustName()+ "    " + "IC :" + sv[q].getCustID()+ "    " + "Address :" + sv[q].getAddress()+ "    " + "Contact No :" + sv[q].getContactNumber());
                    }
                    System.out.print("\n\nChoose number that you want to update : ");
                    int choose = in.nextInt();
                    System.out.print("\n[1]-Customer's name");
                    System.out.print("\n[2]-Customer's IC number ");
                    System.out.print("\n[3]-Customer's address");
                    System.out.print("\n[4]-Customer's contact number");                  
                    System.out.print("\n\nYour Choice ? : ");
                    int choose2 = in.nextInt();
                    switch(choose2)
                    {
                        case 1:
                        System.out.print("\n\tEnter new Name\t:");
                        String name = inline5.nextLine();
                        sv[choose - 1].setCustName(name);
                        break;

                        case 2:
                        System.out.print("\n\tEnter new IC Number\t:");
                        String ic = inline5.next();
                        sv[choose - 1].setCustId(ic);
                        break;

                        case 3:
                        System.out.print("\n\tEnter new Address\t:");
                        String address = inline5.next();
                        sv[choose - 1].setAddress(address);
                        break;

                        case 4:
                        System.out.print("\n\tEnter new Contact Number\t:");
                        String contact = inline5.next();
                        sv[choose -1].setContactNumber(contact);
                        break;
                    }
                    System.out.println("\nUPDATE COMPLETED");
                    System.out.println ("\nPress [ENTER] to continue...");
                    String c = inline2.nextLine();
                    write();
                    read();                    

                }
                else if(opt=='A')
                {   
                    read();
                    System.out.println("Enter customer's name : ");
                    String name = inline3.nextLine();
                    System.out.println("Enter customer's IC : ");
                    String id = inline3.nextLine();
                    System.out.println("Enter customer's contact number :");
                    String cNo = inline3.nextLine();
                    System.out.println("Order's date :");
                    System.out.println(date.toString());
                    String strDate = dateFormat.format(date);
                    System.out.println("Enter your address :");
                    String add = inline3.nextLine();
                    System.out.println("\nChoose souvenir type of your choice :");
                    System.out.println("\nChocolate(C)\nFlower(F)\nFragrant(G)\nMake Up(M)");
                    String t = inline3.nextLine();

                    if(t.equalsIgnoreCase ("C")) 
                    {
                        System.out.println("\f");
                        System.out.print("\n[1]Milk Chocolate (RM 10.00) \n[2]Dark Chocolate (RM 20.00) \n[3]White Chocolate (RM 15.00)");
                        System.out.println("\nType of chocolate :");
                        int toc =Integer.parseInt(inline.next());
                        System.out.print("\n[1]Small \n[2]Big (+ RM 10.00) \n[3]Jumbo (+ RM20.00)");
                        System.out.println("\nSize of chocolate :");
                        int soc =Integer.parseInt(inline.next());
                        System.out.println("\nQuantity : ");
                        int qoc =Integer.parseInt(inline.next());
                        sv[count]= new Chocolate(name,id,cNo,add,strDate,t,toc,soc,qoc );
                    }
                    else if (t.equalsIgnoreCase ("F"))
                    {
                        System.out.println("\f");
                        System.out.println("\nType of flower :");
                        System.out.print("\n[1]Orchid \n[2]Rose \n[3]Hibiscus");
                        int tof =Integer.parseInt(inline.next());
                        if(tof == 1)
                        {
                            System.out.print("\n[1]Red (RM 10.00) \n[2]White (RM 12.00) \n[3]Violet (RM 14.00)");
                        }
                        else if (tof == 2)
                        {
                            System.out.print("\n[1]Pink (RM 10.00) \n[2]Yellow (RM 12.00)\n[3]Blue (RM 14.00)");
                        }
                        else if (tof == 3)
                        {
                            System.out.print("\n[1]Red (RM 10.00) \n[2]Blue (RM 12.00) \n[3]Yellow (RM 14.00)");
                        }
                        System.out.println("\nColour of flower :");
                        int cof =Integer.parseInt(inline.next());
                        System.out.println("\nQuantity of flower :");
                        int qof =Integer.parseInt(inline.next());
                        sv[count] = new Flower(name,id,cNo,add, strDate,t,tof,cof,qof);
                    }
                    else if (t.equalsIgnoreCase ("G"))
                    {
                        System.out.println("\f");
                        System.out.print("\n[1]Cristian Dior \n[2]Burberry \n[3]Calvin Klein \n[4]Prada \n[5]Versace");
                        System.out.println("\nBrand of fragrant :");
                        int b =Integer.parseInt(inline.next());
                        if(b == 1)
                        {
                            System.out.print("\n[1]80ml (RM 54.00) \n[2]90ml (RM 80.00) \n[3]100ml (RM 120.00)");
                        }
                        else if (b == 2)
                        {
                            System.out.print("\n[1]80ml (RM 64.00) \n[2]90ml (RM 96.00) \n[3]100ml (RM 150.00)");
                        }
                        else if (b == 3)
                        {
                            System.out.print("\n[1]80ml (RM 74.00) \n[2]90ml (RM 105.00) \n[3]100ml (RM 160.00)");
                        }
                        System.out.println("\nSize of fragrant :");
                        int s =Integer.parseInt(inline.next());
                        System.out.println("\nQuantity of fragrant :");
                        int q =Integer.parseInt(inline.next());
                        sv[count] = new Fragrant(name,id,cNo,add,strDate,t,b,s,q);
                    }
                    else if (t.equalsIgnoreCase ("M"))
                    {
                        System.out.println("\f");
                        System.out.print("\n[1]Yves Saint Laurent \n[2]Estee Lauder \n[3]Chanel \n[4]Mary Kay");
                        System.out.println("\nSet of makeup :");
                        int sm =Integer.parseInt(inline.next());
                        System.out.print("\n[1]Lipstick (RM 50.00) \n[2]Eyeshadow (RM 60.00) \n[3]Foundation (RM 70.00)");
                        System.out.println("\nItem of makeup :");
                        int im =Integer.parseInt(inline.next());
                        if(im == 1)
                        {
                            System.out.print("\n[1]Red \n[2]Pink");
                        }
                        else if (im == 2)
                        {
                            System.out.print("\n[1]Black \n[2]Brown");
                        }
                        else if (im == 3)
                        {
                            System.out.print("\n[1]Almond \n[2]Beige");
                        }
                        System.out.println("\nColour of makeup :");
                        int c =Integer.parseInt(inline.next());
                        System.out.println("\nQuantity of makeup :");
                        int qm =Integer.parseInt(inline.next());
                        sv[count] = new MakeUp(name,id,cNo,add,strDate,t,sm,im,c, qm);
                    }   
                    write();
                    read();
                }
                else if(opt=='D')
                {   read();
                    for(int j=0;j<sv.length;j++)
                    {
                        if(sv[j] instanceof Chocolate)
                        {
                            System.out.println(sv[j].toString());
                            total=total + sv[j].calcFee();
                            totc=totc + sv[j].calcFee();
                            if(sv[j].calcFee() > high){high=sv[j].calcFee();}
                            if(sv[j].calcFee() < low){low=sv[j].calcFee();}
                        }   
                        else if(sv[j] instanceof Flower)
                        {
                            System.out.println(sv[j].toString());
                            total=total + sv[j].calcFee();
                            totf=totf + sv[j].calcFee();
                            if(sv[j].calcFee() > high){high=sv[j].calcFee();}
                            if(sv[j].calcFee() < low){low=sv[j].calcFee();}
                        }
                        else if(sv[j] instanceof Fragrant)
                        {
                            System.out.println(sv[j].toString());
                            total=total + sv[j].calcFee();
                            totg=totg + sv[j].calcFee();
                            if(sv[j].calcFee() > high){high=sv[j].calcFee();}
                            if(sv[j].calcFee() < low){low=sv[j].calcFee();}
                        }
                        else if(sv[j] instanceof MakeUp)
                        {
                            System.out.println(sv[j].toString());
                            total=total + sv[j].calcFee();
                            totm=totm + sv[j].calcFee();
                            if(sv[j].calcFee() > high){high=sv[j].calcFee();}
                            if(sv[j].calcFee() < low){low=sv[j].calcFee();}
                        }
                    }
                    System.out.println ("Press [ENTER] to continue...");
                    String pk = inline2.nextLine();
                }
                else if(opt == 'R')
                {
                    read();
                    System.out.println("List of orders : ");
                    for (int q = 0; q < count; q++)
                    {
                        System.out.println("\n[" + (q+1) + "]" + sv[q].getCustName() + "-" + sv[q].getCustID());
                    }
                    System.out.println("\nDo you want to remove order ? :(Y/N)");
                    char choice = in.next().toUpperCase().charAt(0);
                    if (choice ==  'Y' || choice ==  'y')
                        System.out.print("\nWhich order you want to be deleted? : ");
                    else {continue;}
                    int remove = inline.nextInt();
                    System.out.println(count);
                    sv[remove - 1] = null;

                    for(int a=remove-1; a<count;a++)
                    {
                        sv[a] = sv[a+1];
                        sv[a+1] = null;
                    }
                    count=count-1;
                    write();
                    System.out.println("\nREMOVE COMPLETED");
                    System.out.println ("\nPress [ENTER] to continue...");
                    String c = inline2.nextLine();

                }
                else if(opt == 'P') 
                {
                    System.out.println("List of orders : ");
                    for (int x = 0; x < count; x++)
                    {
                        System.out.println("\n[" + (x+1) + "]" + "Name :" + sv[x].getCustName()+ " " + "IC :" + sv[x].getCustID());
                    }
                    System.out.print("\nWhich order you want to print? : ");
                    int cho = in.nextInt();
                    if(sv[cho-1] instanceof Chocolate)
                    {
                        PrintWriter rec =new PrintWriter(new FileWriter(new File("receipt"+cho+".txt")));
                        rec.println((sv[cho-1].toString()));rec.close();
                    }   
                    else if(sv[cho-1] instanceof Flower)
                    {
                        PrintWriter rec =new PrintWriter(new FileWriter(new File("receipt"+cho+".txt")));
                        rec.println(((Flower)sv[cho-1]).toString());rec.close();
                    }
                    else if(sv[cho-1] instanceof Fragrant)
                    {
                        PrintWriter rec =new PrintWriter(new FileWriter(new File("receipt"+cho+".txt")));
                        rec.println(((Fragrant)sv[cho-1]).toString());rec.close();
                    }
                    else if(sv[cho-1] instanceof MakeUp)
                    {
                        PrintWriter rec =new PrintWriter(new FileWriter(new File("receipt"+cho+".txt")));
                        rec.println(((MakeUp)sv[cho-1]).toString());rec.close();
                    }else{continue;}
                    System.out.println("Printed!");
                    System.out.println ("Press [ENTER] to continue...");
                    String pk = inline2.nextLine();
                }
                else if(opt == 'X') {break;}

            }
            pw.print("");
            pw.print("\r\n\n\nSales Summary");
            pw.print("\r\n--------------------------------------------");
            pw.print("\r\nTotal make-up fee : RM" + totm);
            pw.print("\r\n--------------------------------------------");
            pw.print("\r\nTotal chocolate fee : RM" + totc);
            pw.print("\r\n--------------------------------------------");
            pw.print("\r\nTotal flower fee : RM" + totf);
            pw.print("\r\n--------------------------------------------");
            pw.print("\r\nTotal fragrant fee : RM" + totg);
            pw.print("\r\n--------------------------------------------");
            pw.print("\r\nTotal fee : RM" + total);
            pw.print("\r\n--------------------------------------------");
            pw.print("\r\nHighest fee : RM" + high);
            pw.print("\r\n--------------------------------------------");
            pw.print("\r\nLowest fee : RM" + low);
            pw.print("\r\nLast Data Update : " + date.toString());
            pw.close();
        }
        catch(Exception e){System.err.println(e.getMessage());}
        finally{System.out.println("End of the program...." + "\r\nTHANK YOU! ;)");}
    }

    public static void write() throws Exception{
        try{
            PrintWriter op = new PrintWriter (new FileWriter("listOrder.txt"));
            for(int z=0;z<sv.length;z++)
            {
                if(sv[z] instanceof Chocolate) 
                {
                    op.println(((Chocolate)sv[z]).getCustName()+ ";" + ((Chocolate)sv[z]).getCustID() + ";" + ((Chocolate)sv[z]).getContactNumber()+ ";"+ ((Chocolate)sv[z]).getAddress() + ";" + ((Chocolate)sv[z]).getDateOrder()  +";"+ ((Chocolate)sv[z]).getType() + ";" + ((Chocolate)sv[z]).getTypeOfChoco() + ";"  + ((Chocolate)sv[z]).getSizeOfChoco() + ";" + ((Chocolate)sv[z]).getQuanOfChoco());
                }
                else if (sv[z] instanceof Flower)
                {
                    op.println(((Flower)sv[z]).getCustName()+ ";" + ((Flower)sv[z]).getCustID() + ";" + ((Flower)sv[z]).getContactNumber()+ ";"+ ((Flower)sv[z]).getAddress() + ";" + ((Flower)sv[z]).getDateOrder() + ";"+ ((Flower)sv[z]).getType()+ ";"+ ((Flower)sv[z]).getTypeOfFlower() +  ";" + ((Flower)sv[z]).getColorOfFlower() + ";" +((Flower)sv[z]).getQuanOfFlower());
                }
                else if (sv[z] instanceof Fragrant)
                {
                    op.println(((Fragrant)sv[z]).getCustName()+ ";" + ((Fragrant)sv[z]).getCustID() + ";" + ((Fragrant)sv[z]).getContactNumber()+ ";"+ ((Fragrant)sv[z]).getAddress() + ";" + ((Fragrant)sv[z]).getDateOrder() + ";"+ ((Fragrant)sv[z]).getType()+ ";" +  ((Fragrant)sv[z]).getFragrantSize()+ ";"+ ((Fragrant)sv[z]).getFragrantBrand() +  ";" + ((Fragrant)sv[z]).getFragrantQuan());
                }
                else if (sv[z] instanceof MakeUp)
                {
                    op.println( ((MakeUp)sv[z]).getCustName()+ ";" +  ((MakeUp)sv[z]).getCustID() + ";" +  ((MakeUp)sv[z]).getContactNumber()+ ";"+  ((MakeUp)sv[z]).getAddress() + ";" + ((MakeUp)sv[z]).getDateOrder() + ";"+ ((MakeUp)sv[z]).getType() + ";"+ ((MakeUp)sv[z]).getSetOfMakeUp() +  ";" + ((MakeUp)sv[z]).getItemOfMakeUp() + ";" + ((MakeUp)sv[z]).getColourOfMakeUp()+ ";"+ ((MakeUp)sv[z]).getQuantityOfMakeUp());
                }
            }
            op.close();
        }
        catch(Exception e) { System.err.println(e.getMessage());}
    }

    public static void read() throws Exception
    {
        try
        {
            BufferedReader br = new BufferedReader (new FileReader("listOrder.txt"));
            String st = br.readLine();
            count=0;
            while(st!= null)
            {
                StringTokenizer token = new StringTokenizer(st,";");
                String name = token.nextToken();
                String id = token.nextToken();
                String cNo = token.nextToken();
                String add = token.nextToken();
                String date = token.nextToken();
                String  t = token.nextToken();
                if(t.equalsIgnoreCase ("C")) 
                {
                    int qoc =Integer.parseInt(token.nextToken());
                    int toc =Integer.parseInt(token.nextToken());
                    int soc =Integer.parseInt(token.nextToken());
                    sv[count++]= new Chocolate(name,id,cNo,add,date,t,toc,soc , qoc);
                }
                else if (t.equalsIgnoreCase ("F"))
                {
                    int qof =Integer.parseInt(token.nextToken());
                    int tof =Integer.parseInt(token.nextToken());
                    int cof =Integer.parseInt(token.nextToken());
                    sv[count++] = new Flower(name,id,cNo,add,date,t,tof,cof,qof);
                }
                else if (t.equalsIgnoreCase ("G"))
                {
                    int q =Integer.parseInt(token.nextToken());
                    int b =Integer.parseInt(token.nextToken());
                    int s =Integer.parseInt(token.nextToken());
                    sv[count++] = new Fragrant(name,id,cNo,add,date,t,b,s,q);                  
                }
                else if (t.equalsIgnoreCase ("M"))
                {
                    int q =Integer.parseInt(token.nextToken());
                    int sm =Integer.parseInt(token.nextToken());
                    int im =Integer.parseInt(token.nextToken());
                    int c =Integer.parseInt(token.nextToken());
                    sv[count++] = new MakeUp(name,id,cNo,add,date,t,sm,im,c, q);
                }
                st=br.readLine();
            }
            br.close();
        }
        catch(Exception e) { System.err.println(e.getMessage());}
    }
}
/***while(str != null)
for(int j=0;j<sv.length;j++)
{
if(sv[j].getCustID()!= null){System.out.println (sv[j].getCustID());
/  
if(sv[j] instanceof Chocolate)
{

PrintWriter pw =new PrintWriter(new FileWriter(new File("receipt"+j+".txt")));
pw.println(((Chocolate)sv[j]).toString());
}   
else if(sv[j] instanceof Flower)
{
PrintWriter pw =new PrintWriter(new FileWriter(new File("receipt"+j+".txt")));
pw.println(((Flower)sv[j]).toString());
}
else if(sv[j] instanceof Fragrant)
{
PrintWriter pw =new PrintWriter(new FileWriter(new File("receipt"+j+".txt")));
pw.println(((Fragrant)sv[j]).toString());
}
else if(sv[j] instanceof MakeUp)
{
PrintWriter pw =new PrintWriter(new FileWriter(new File("receipt"+j+".txt")));
pw.println(((MakeUp)sv[j]).toString());
}
}
}
}***/
