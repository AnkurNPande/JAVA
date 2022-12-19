import java.util.*;

class Numbers
{
    public void EvenFactorsDisplay(int iNo)
    {
        int iCnt=0;

        for (iCnt = 1; iCnt <=iNo; iCnt++)
        {
            if(((iNo % iCnt)==0)&&((iCnt % 2)==0))
            {
                System.out.println("the Even factors are "+iCnt);
            }
        }
    }
}

class Program1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        nobj.EvenFactorsDisplay(iNo);

    }
}