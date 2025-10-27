import java.util.Scanner;

//typos dapanis B

class Type_B extends expense
{

    Double percent;
    String code1;
    static int k=0;

    public Type_B()     
    {
        if(k<=3) {          //arxikopoihsh
            if(k==0)
            {
                setPrice(80.0);
                setCode();
                k++;
            }
            else if(k==1)
            {
                setPrice(50.0);
                setCode();
                k++;
            }
            else if(k==2)
            {
                setPrice(60.0);
                setCode();
                k++;
            }
            
        }
        else
        {
            Scanner myObj7 = new Scanner(System.in);
            System.out.print("Doste pososto: ");
            Double percent = myObj7.nextDouble();
            setPrice(percent);
            setCode();
        }

    }

    //getters kai setters

    public void setPrice(Double n){
        percent = n;
    }
    public void setCode() {
        code1="B"+code;
        code++;
    }

    public double getPrice()
    {
        return percent/100;//epistrofi posostou
    }

    public String getUnit()
    {
        return "euro";
    }

    public String getCode() {
        return code1;
    }

    
}