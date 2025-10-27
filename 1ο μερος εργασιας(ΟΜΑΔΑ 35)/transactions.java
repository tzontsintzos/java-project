import java.util.Scanner;

//kiniseis

class transactions
{
    String name;
    double amount;
    String Type;
    public transactions(String name,String type,double amount)
    {
        
        setName(name);
        setAmount(amount);
        setType(type);

    }

//getters kai setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return Type;
    }



    

}