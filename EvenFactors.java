import java.util.*;

class EvenFactorsX
{
  
    public int iValue; 

    public EvenFactorsX(int No)
    {
       iValue = No;
     
    }
       
    public void EvenFactorsF()
    {
        int iCnt =0;
           
        for(iCnt = 2; iCnt <= (iValue/2);  iCnt+=2 )
        {
              if((iValue % iCnt) ==0) 
              {
                 System.out.println(iCnt);
              }
        }
    }
 
}

class EvenFactors
{
    public static void main(String Arg[])
    {
          Scanner sobj = new Scanner(System.in);

          System.out.println("Enter the  number");
          int iNo1 = sobj.nextInt();

          EvenFactorsX eobj = new EvenFactorsX(iNo1);
          System.out.println("The even factots of given number are ");

          eobj.EvenFactorsF();
          
    }
}