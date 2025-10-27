import java.util.Scanner;
//ergazomenoi
class workers
{
    private String name_first;
    private String name_last;
    private Double monthly_return;
    static int n=0;

    public workers()
    {
        if(n<=2)
        {
            if(n==0)
            {
                setName("Leo","Messi");
                month_return(400.0);
                n++;
            }
            else if(n==1)
            {
                setName("Cristiano","Ronaldo");
                month_return(300.0);
                n++;
            }
            else if(n==2)
            {
                setName("Gareth","Bale");
                month_return(200.0);
                n++;
            }
        }
        else
        {
            Scanner myObj = new Scanner(System.in);
            System.out.print("Doste mikro onoma : ");
            String first = myObj.nextLine();
    
    
            Scanner myObj1 = new Scanner(System.in);
            System.out.print("Doste epitheto: ");
            String last = myObj1.nextLine();
            
    
            Scanner myObj2 = new Scanner(System.in);
            System.out.print("Doste megisti miniaia apozimiosi: ");
            Double monthly = myObj2.nextDouble();
            setName(first,last);
            month_return(monthly);
        }
        
    }

    public void setName(String n,String m){
        name_first = n;
        name_last=m;
    }

    public void month_return(Double n){
        monthly_return = n;
    }
    
    public String getFirstName()
    {
        return name_first;
    }
    public String getLastName()
    {
        return name_last;
    }
    public double getMonthly()
    {
        return monthly_return;
    }
}