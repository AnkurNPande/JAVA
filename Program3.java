//Accept two numbers from user and display common factors of that two numbers.



import java.util.*;

class Numbers
{
    public void CommonFactorsDisplay(int iNo1, int iNo2)
    {
        int iCnt = 0;

      System.out.println("Common Factors are : ");

      for (iCnt = 1; ((iCnt <= iNo1/2) && (iCnt <= iNo2));iCnt++)
       {
          if(((iNo1 % iCnt )==0)&&((iNo2 % iCnt)==0))
          {
            System.out.println(iCnt);
          }
       }
    }
}

class Program3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the First number");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the second number");
        int iNo2 = sobj.nextInt();

        Numbers nobj = new Numbers();

        nobj.CommonFactorsDisplay(iNo1,iNo2);

    }
}