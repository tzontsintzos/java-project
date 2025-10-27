import java.util.Scanner;

//typos dapanis


class expense
{
    String desc;
    Double monthly_al;
    static int code=1;
    static int j=0;

    public expense()
    {
        if(j<=5) {      //arxikopoihsh
            if(j==0)
            {
                setdesc("odiporika");
                setMonthly(100.0);
                j++;
            }
            else if(j==1)
            {
                setdesc("diatrofh");
                setMonthly(80.0);
                j++;
            }
            else if(j==2)
            {
                setdesc("diamoni");
                setMonthly(250.0);
                j++;
            }
            else if(j==3)
            {
                setdesc("rouxa");
                setMonthly(50.0);
                j++;
            }
            else if(j==4)
            {
                setdesc("taxi");
                setMonthly(50.0);
                j++;
            }
            else if(j==5)
            {
                setdesc("security");
                setMonthly(200.0);
                j++;
            }
            
        }
        else
        {
            Scanner myObj4 = new Scanner(System.in);
            System.out.print("Doste perigrafi: ");
            String desc = myObj4.nextLine();
    
            Scanner myObj5 = new Scanner(System.in);
            System.out.print("Doste megisti miniaia apozimiosi: ");
            Double monthly = myObj5.nextDouble();
    
            setdesc(desc);
            setMonthly(monthly);
        }

        
    }

    //getters kai setters

    public void setdesc(String n){
        desc = n;
    }

    public void setMonthly(Double n){
        monthly_al = n;
    }

    public String getCode()
    {
        return getCode();
    }
    public String getDesc()
    {
        return desc;
    }
    public double getMonthly()
    {
        return monthly_al;
    }
    
    public String getUnit()
    {
        return getUnit();
    }

    public double getPrice()
    {
        return getPrice();
    }

    
}