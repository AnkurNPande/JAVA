import java.util.*;

class FactorsX
{
    public int iNo;
    public int iCnt;

    public FactorsX(int a)
    {
        iNo = a;

    }

    public void DisplayFactors()
    {
        int iCnt = 1;
          System.out.println (" Factors of given number is");
        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt == 0))
            {
                System.out.println(iCnt);
                
            }
        }
    }

}




class Factors
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number");
        int iNo1 = sobj.nextInt();

        FactorsX fobj = new FactorsX(iNo1);

        fobj.DisplayFactors();
    }
}