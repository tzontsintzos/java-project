import java.util.Scanner;

//typos dapanis A

class Type_A extends expense
{
    
    String unit;
    Double price_per_unit;
    String code1;
    static int h=0;
    
    public Type_A()
    {
        if(h<=2) //arxikopoihsh
        {
            if(h==0)
            {
                setUnit("euro/km");
                setPrice(1.5);
                setCode();
                h++;
            }
            else if(h==1)
            {
                setUnit("euro/hmera");
                setPrice(30.0);
                setCode();
                h++;
            }
            else if(h==2)
            {
                setUnit("euro/hmera");
                setPrice(40.0);
                setCode();
                h++;
            }
            
        }
        else
        {
            Scanner myObj6 = new Scanner(System.in);
            System.out.print("Doste monada metrisis: ");
            String unit = myObj6.nextLine();

            Scanner myObj7 = new Scanner(System.in);
            System.out.print("Doste timi apozimiosis: ");
            Double price = myObj7.nextDouble();
            
            setUnit(unit);
            setPrice(price);
            setCode();
        }
        
    }
     
    //getters kai setters

    public void setUnit(String n){
        unit = n;
    }

    public void setPrice(Double n){
        price_per_unit = n;
    }

    
    public void setCode() {
        code1="A"+code;
        code++;
    }


    public String getUnit()
    {
        return unit;
    }

    public double getPrice()
    {
        return price_per_unit;
    }

    
    public String getCode() {
        
        return code1;
    }


}