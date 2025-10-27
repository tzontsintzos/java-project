import java.util.Scanner;
import java.util.ArrayList;

/*OMADA 35:
DIMITRIOS ROUSALIS P3200166
TSINTZOS IOANNIS P3200211 */


public class mainApp 
{

    public static void main (String args[]) 
    {
        /* Dimiourgia listarrays gia montelopoihsh ton 4 liston(ergazomenon,typon dapanis,dapanon ergazomenon,kiniseon) */
        ArrayList<workers> worker = new ArrayList<workers>(10);                        
        ArrayList<expense> expense_type = new ArrayList<expense>(10);
        ArrayList<work_expense> work_exp = new ArrayList<work_expense>(10);
        ArrayList<transactions> trans = new ArrayList<transactions>(10);
        Scanner choice = new Scanner(System.in);                //arxikopoihsh liston
        expense_type.add(new Type_A());
        expense_type.add(new Type_A());
        expense_type.add(new Type_A());
        expense_type.add(new Type_B());
        expense_type.add(new Type_B());
        expense_type.add(new Type_B());
        worker.add(new workers());
        worker.add(new workers());
        worker.add(new workers());
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                work_exp.add(new work_expense(worker.get(i).getLastName(), expense_type.get(j).getDesc(), expense_type.get(j).getUnit(), expense_type.get(j).getPrice(), expense_type.get(j).getCode()));
            }
            trans.add(new transactions(worker.get(i).getLastName(), "prokatabolh", 150.0));
            
        }

        
        while(true)
        {
			//menu
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("1.Eisagogi neou typou dapanis");
            System.out.println("2.Eisagogi neou ergazomenou");
            System.out.println("3.Eisagogi neas dapanis ergazomenou");
            System.out.println("4.Eisagogi neas kinisis prokatabolis");
            System.out.println("5.Emfanisi dapanon ergazomenon");
            System.out.println("6.Ekkatharisi dapanon enos ergazomenou");
            System.out.println("7.Emfanisi ton kiniseon ergazomenon");
            System.out.println("8.Ekkatharisi dapanon olon ton ergazomenon tis etairias");
            System.out.println("9.Emfanisi telikou mhniaiou posou apozimiosis olon ton ergazomenon");
            System.out.println("-------------------------------------------------------------------------");
            System.out.print("Dwste epilogi:");
            switch(choice.nextInt())
            {
                case 1:     
                Scanner obj1 = new Scanner(System.in);
                System.out.print("Doste 1 gia typo A, 2 gia typo B: ");
                int code = obj1.nextInt();
    

                if(code==1)
                {
                    expense_type.add(new Type_A());
                }

                if(code==2)
                {
                    expense_type.add(new Type_B());
                }
                break;

                case 2:

                worker.add(new workers());
                break;
                

                case 3:
                Scanner obj2 = new Scanner(System.in);
                
                for(int i=0;i<worker.size();i++)        //tiponei ti lista ton ergazomenon kai zhta apo to xristi na epilexei enan apo autous
                {
                    System.out.println((i+1)+" ---> "+worker.get(i).getLastName());
                }
                System.out.print("Na epileksete ergazomeno (1,2,3,klp) : ");
                int work = obj2.nextInt();
                
                for(int i=0;i<expense_type.size();i++)
                {
                    System.out.println((i+1)+" ---> "+expense_type.get(i).getDesc());
                }
                System.out.print("Na epileksete typo dapanis(1,2,3,klp) : ");
                int exp = obj2.nextInt();

                work_exp.add(new work_expense(worker.get(work-1).getLastName(), expense_type.get(exp-1).getDesc(),expense_type.get(exp-1).getUnit(),expense_type.get(exp-1).getPrice(),expense_type.get(exp-1).getCode()));
                break;

                case 4:
                Scanner obj3 = new Scanner(System.in);
                for(int i=0;i<worker.size();i++)
                {
                    System.out.println((i+1)+" +++> "+worker.get(i).getLastName());
                }
                System.out.print("Na epileksete ergazomeno (1,2,3,klp) : ");
                int ch=obj3.nextInt();
                Scanner a = new Scanner(System.in);
                System.out.print("Doste poso prokatabolis: ");
                double amount = a.nextDouble();
                trans.add(new transactions(worker.get(ch-1).getLastName(),"prokatabolh",amount));
                break;

                case 5:
                for(int i=0;i<trans.size();i++)
                {
                    
                    System.out.print("\t"+work_exp.get(i).getName()+"\t\t"+work_exp.get(i).getType()+"\t\t"+work_exp.get(i).getAksia_apoz()+" Euro\n---------------------------------------------------------------------------------------------------------------------------------\n");
                }
                for(int i=0;i<work_exp.size();i++)
                {
                    System.out.print("\t"+work_exp.get(i).getName()+"\t\t"+work_exp.get(i).getType()+"\t\t"+work_exp.get(i).getValue()+' '+work_exp.get(i).getUnit()+"\t\t"+work_exp.get(i).getAksia_apoz()+" euro\n------------------------------------------------------------\n");
                }
                break;
                case 6: 
                Scanner obj4 = new Scanner(System.in);
                for(int i=0;i<worker.size();i++)        /* to programma saronei ti lista dapanon ergazomenon,omadopoiei tous diaforetikous tipous dapanon
                                                         tou xristi kai prosthetei sti lista ton kiniseon ta stoixeia*/ 
                {
                    System.out.println((i+1)+" ---> "+worker.get(i).getLastName());
                }
                System.out.print("Na epileksete ergazomeno (1,2,3,klp) : ");
                int choc=obj4.nextInt();
               
                double sum=0;
                for(int j=0;j<work_exp.size();j++)
                {
                    if (work_exp.get(0).getType()==work_exp.get(j).getType() && work_exp.get(j).getName()==worker.get(choc-1).getLastName())
                    {
                        sum+=work_exp.get(j).getAksia_apoz();
                        if(j>0)
                        {
                            work_exp.remove(j);
                        }

                        if (sum>expense_type.get(0).getMonthly())
                        {
                            sum=expense_type.get(0).getMonthly();
                        }
                        
                        trans.add(new transactions(worker.get(choc-1).getLastName(), work_exp.get(0).getType(),sum));
                        work_exp.remove(0);
                    }
                }
                    
                /*to programma ypologizei th diafora*/
                double sum2=0;
                for(int i=0;i<trans.size();i++)
                {
                    if (trans.get(i).getName()==worker.get(choc-1).getLastName())
                    {
                        sum2+=trans.get(i).getAmount();
                    }
                }
                if(sum2>worker.get(choc-1).getMonthly())
                {
                    trans.add(new transactions(worker.get(choc-1).getLastName(), "Diafora",sum-worker.get(choc-1).getMonthly()));
                }
                else
                {
                    trans.add(new transactions(worker.get(choc-1).getLastName(), "Diafora",0));
                }
                
                break;
                case 7:
                String type1="apozimiwsh";
                String type2="";
                Scanner obj5 = new Scanner(System.in);
                for(int i=0;i<worker.size();i++)
                {
                    System.out.println((i+1)+" ---> "+worker.get(i).getLastName());
                }
                System.out.print("Na epileksete ergazomeno (1,2,3,klp) : ");
                int chocic=obj5.nextInt();
                for(int i=0;i<trans.size();i++)
                {
                    
                    if(trans.get(i).getName()==worker.get(chocic-1).getLastName())
                    {
                        if(trans.get(i).getType()=="prokatabolh")
                        {
                            type1="prokatabolh";
                        }
                        if(trans.get(i).getType()=="Diafora")
                        {
                            type1="diference";
                        }
                        if(trans.get(i).getType()!="Diafora")
                        {
                            type2=trans.get(i).getType();
                        }
                        System.out.println(type1+"\t"+worker.get(chocic-1).getLastName()+"\t"+type2+"\t"+trans.get(i).getAmount());
                        type1="apozhmiwsh";
                        type2="";
                    }

                }
                break;

                case 8:         //idia leitourgia me to case 6 apla gia olous tous ergazomenous
                for(int choc1=1;choc1<worker.size()+1;choc1++)
                {
                    double sum3=0;
                    for(int j=0;j<work_exp.size();j++)
                    {
                        if (work_exp.get(0).getType()==work_exp.get(j).getType() && work_exp.get(j).getName()==worker.get(choc1-1).getLastName())
                        {
                            sum3+=work_exp.get(j).getAksia_apoz();
                            if(j>0)
                            {
                                work_exp.remove(j);
                            }
    
                            if (sum3>expense_type.get(0).getMonthly())
                            {
                                sum3=expense_type.get(0).getMonthly();
                            }
                            
                            trans.add(new transactions(worker.get(choc1-1).getLastName(), work_exp.get(0).getType(),sum3));
                            work_exp.remove(0);
                        }
                    }
                        
                    
                    double sum4=0;
                    for(int i=0;i<trans.size();i++)
                    {
                        if (trans.get(i).getName()==worker.get(choc1-1).getLastName())
                        {
                            sum4+=trans.get(i).getAmount();
                        }
                    }
                    if(sum4>worker.get(choc1-1).getMonthly())
                    {
                        trans.add(new transactions(worker.get(choc1-1).getLastName(), "Diafora",sum4-worker.get(choc1-1).getMonthly()));
                    }
                    else
                    {
                        trans.add(new transactions(worker.get(choc1-1).getLastName(), "Diafora",0));
                    }
                    
                    }
                    break;

                case 9:
                for(int i=0;trans.size()>0;)
                {
                    double sum3=0;
                    for(int j=0;j<trans.size();j++)
                    {
                        if(trans.get(i).getName()==trans.get(j).getName())

                        {          //teliko poso apozimiosis=axia kiniseon apozimiosis-axia prokatabolis-axia diaforas
                            if(trans.get(j).getType()=="prokatabolh" && trans.get(i).getType()=="prokatabolh")
                            {
                                sum3-=trans.get(j).getAmount();
                                if(j>0)
                                {
                                    trans.remove(j);
                                }
                            }
                            else if(trans.get(j).getType()=="Diafora" && trans.get(i).getType()=="Diafora")
                            {
                                sum3-=trans.get(j).getAmount();
                                if(j>0)
                                {
                                    trans.remove(j);
                                }
                            }
                            else
                            {
                                sum3+=trans.get(j).getAmount();
                                if(j>0)
                                {
                                    trans.remove(j);
                                }
                            }
                        }
                    }
                    System.out.println("telikh apozhmiwsh"+"\t"+trans.get(0).getName()+"\t\t"+sum3);
                    trans.remove(0);
                } 
            }
        }
    }

}
