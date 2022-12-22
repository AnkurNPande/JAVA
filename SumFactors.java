import java.util.*;

class FactorsX
{
    public int iNo;
    public int iCnt;

    public FactorsX(int a)
    {
        iNo = a;

    }

    public int Factors()
    {
        int iCnt = 1;
        int iSum = 0;
        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt == 0))
            {
               iSum = iSum + iCnt;
                
            }
        }
        return iSum;
    }

}

class SumFactors
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number");
        int iNo1 = sobj.nextInt();

        FactorsX fobj = new FactorsX(iNo1);

       int iRet =  fobj.Factors();

        System.out.println ("sum of  Factors of " +iNo1+ " is " + iRet);


       
    }
}