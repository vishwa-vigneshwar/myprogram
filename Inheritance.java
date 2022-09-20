import java.util.Scanner;

class Employee
{
    String EName;
    int EId;
    String EAddress;
    String EPhno;
    String Emailid;
}

class Programmer extends Employee
{
    int BPay;
    float Da;
    float Hra;
    float Pf;
    float CFund;
    float Gross;
    float Deduct;
    float Net;
    
    public void GetBPay()
    {
        System.out.println("Enter Basic Pay : ");
        Scanner sc= new Scanner(System.in); 
        BPay = sc.nextInt();
    }
    
    public void GetDetail()
    {
        System.out.println("Name     : ");
        Scanner sc= new Scanner(System.in); 
        EName  = sc.next();
        System.out.println("ID       : ");
        EId  = sc.nextInt();
        System.out.println("Address  : ");
        EAddress = sc.next();
        System.out.println("Phone   : ");
        EPhno = sc.next();
        System.out.println("Emailid  : ");
        Emailid = sc.next();
    }
    public void CalcSalary()
    {
        Da = BPay * (97.0f/100);
        Hra = BPay * (10.0f/100);
        Pf = BPay * (12.0f/100);
        CFund = BPay * (0.1f/100);
        Gross = BPay + Da + Hra;
        Deduct = Pf + CFund;
        Net = Gross - Deduct;
    }
    
   
    public void ShowDetail()
    {
        System.out.println("Employee Name                  : " + EName);
        System.out.println("Employee Id                    : " + EId);
        System.out.println("Employee Address               : " + EAddress);
        System.out.println("Employee Phone No.             : " + EPhno);
        System.out.println("Employee Emailid               : " + Emailid);
        System.out.println("Employee Basicpay              : " + BPay);
        System.out.println("Employee Dearness Allowance    : " + Da);
        System.out.println("Employee House Rent Allowance  : " + Hra);
        System.out.println("Employee Provident Fund        : " + Pf);
        System.out.println("Employee Club Fund             : " + CFund);
        System.out.println("==============================================");
        System.out.println("Gross Salary                   : " + Gross);
        System.out.println("Deduction                      : " + Deduct);
        System.out.println("==============================================");
        System.out.println("Net Salary                     : " + Net);
        System.out.println("==============================================");
    }
}

class Assproffessor extends Programmer 
{
    public void ShowAssproffessorDetail()
    {
        System.out.println("Assproffessor Name                  : " + EName);
        System.out.println("Assproffessor Id                    : " + EId);
        System.out.println("Assproffessor Address               : " + EAddress);
        System.out.println("Assproffessor Phone No.             : " + EPhno);
        System.out.println("Assproffessor Emailid               : " + Emailid);
        System.out.println("Assproffessor Basicpay              : " + BPay);
        System.out.println("Assproffessor Dearness Allowance    : " + Da);
        System.out.println("Assproffessor House Rent Allowance  : " + Hra);
        System.out.println("Assproffessor Provident Fund        : " + Pf);
        System.out.println("Assproffessor Club Fund             : " + CFund);
        System.out.println("==============================================");
        System.out.println("Gross Salary                   : " + Gross);
        System.out.println("Deduction                      : " + Deduct);
        System.out.println("==============================================");
        System.out.println("Net Salary                     : " + Net);
        System.out.println("==============================================");
    }
}

class proffessor extends Programmer 
{
    public void ShowproffessorDetail()
    {
        System.out.println("proffessor Name                  : " + EName);
        System.out.println("proffessor Id                    : " + EId);
        System.out.println("proffessor Address               : " + EAddress);
        System.out.println("proffessor Phone No.             : " + EPhno);
        System.out.println("proffessor Emailid               : " + Emailid);
        System.out.println("proffessor Basicpay              : " + BPay);
        System.out.println("proffessor Dearness Allowance    : " + Da);
        System.out.println("proffessor House Rent Allowance  : " + Hra);
        System.out.println("proffessor Provident Fund        : " + Pf);
        System.out.println("proffessor Club Fund             : " + CFund);
        System.out.println("==============================================");
        System.out.println("Gross Salary                   : " + Gross);
        System.out.println("Deduction                      : " + Deduct);
        System.out.println("==============================================");
        System.out.println("Net Salary                     : " + Net);
        System.out.println("==============================================");
    }
}


public class Inheritance {

    public static void main(String[] args) {
        int choice=0;
        Scanner sc= new Scanner(System.in);
        while(choice!=4)
       {
        System.out.println("Choose one form the below options....");
        System.out.println("\n1.Assproffessor\n2.Proffessor\n3.Employee\n4.exit");
        System.out.println(" Enter your choice :");
        choice = sc.nextInt();
        System.out.println(" ");
        switch(choice)
        {
            case 1 -> 
            {
                Assproffessor asspro =new Assproffessor();
                asspro.GetDetail();
                asspro.GetBPay();
                asspro.CalcSalary();
                asspro.ShowAssproffessorDetail();
            }
            case 2 ->
            {
                Programmer pg = new Programmer();
                pg.GetDetail();
                pg.GetBPay();
                pg.CalcSalary();
                pg.ShowDetail();
                
            }
            case 3 ->
            {
                proffessor pro =new proffessor();
                pro.GetDetail();
                pro.GetBPay();
                pro.CalcSalary();
                pro.ShowproffessorDetail();
            }
            case 4 ->
            {
                System.out.println("Exiting....");
                
            }
            default ->
            {
                System.out.println("please enter valid choice");
            }
        }
       }
    }
}
