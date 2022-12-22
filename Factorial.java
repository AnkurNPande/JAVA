import java.util.*;

class FactorialX
{
    public int iFact;
    public int iCnt;
    public int iValue1; 

    public FactorialX(int no)
    {
        iFact = 1;
        iCnt = 0;
        iValue1= no;


    }
    public int FactorialS()
    {     
         for(iCnt = 1; iCnt <= iValue1; iCnt++)
         {
            iFact = iFact * iCnt;
         }
         return iFact;
    }  
}

class Factorial
{
    public static void main(String Arg[])
    {
          Scanner sobj = new Scanner(System.in);

          System.out.println("Enter the  number");
          int iNo1 = sobj.nextInt();

          FactorialX fobj = new FactorialX(iNo1);

          int iRet = fobj.FactorialS();

          System.out.println("The Factorial of "+ iNo1+" are " +iRet);
    }
}