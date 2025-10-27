import java.util.Scanner;
import java.util.Random;

//Dapani ergazomenou

class work_expense
{
    String name;
    String type;
    double value;
    String reason;
    String unit;
    double price_per;
    static int k=0;
    public work_expense(String name,String type,String unit,double price_per_unit,String code)
    {
        Random rand = new Random();
        if (k<12)           //arxikopoihsh
        {
                setName(name);
                setType(type);
                setReason(reason);
                setUnit(unit);
                setPrice(price_per_unit);
                setValue(rand.nextInt(1000)/10);//tyxaies times
        }
        else
        {
            setName(name);
            setType(type);
            Scanner myObj9 = new Scanner(System.in);
            if (code.charAt(0)=='A')//diaxorismos se type_A kai Type_B
            {
                System.out.print("Doste axia dapanis: ");
                Double percent = myObj9.nextDouble();
                setValue(percent);
            }
            else
            {
                System.out.print("Doste posotita dapanis: ");
                Double percent = myObj9.nextDouble();
                setValue(percent);
            }
            
            
            Scanner myObj7 = new Scanner(System.in);
            System.out.print("Doste perigrafi: ");
            String reason = myObj7.nextLine();
            setReason(reason);
            setUnit(unit);
            setPrice(price_per_unit);
        }
        
        
    }

    //getters kai setters

    public void setName(String name)
    {
        this.name=name;
    }
    public void setType(String type)
    {
        this.type=type;
    }
    public void setValue(double value)
    {
        this.value=value;
    }
    public void setReason(String reason)
    {
        this.reason=reason;
    }

    public void setUnit(String unit)
    {
        this.unit=unit;
    }

    public void setPrice(double price_per_unit)
    {
        this.price_per = price_per_unit;
    }

    public String getName()
    {
        return name;
    }
    public String getType()
    {
        return type;
    }
    public double getValue()
    {
        return value;
    }
    public String getReason()
    {
        return reason;
    }

    public String getUnit() {
        return unit;
    }

    public double getAksia_apoz() {
        return value*price_per;         //aksia apozimiosis=posotita * timi 
    }
}