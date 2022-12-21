import java.util.*;

class ArrayX
{
     public int Arr[];
     public int iSize;
 

    public ArrayX(int No)
    {
       iSize = No;
      Arr = new int [iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
    
        System.out.println("Enter the elements : ");

        
        for(int  iCnt = 0;iCnt < iSize; iCnt++)
        {
            Arr[iCnt]=sobj.nextInt();
        } 
    }

    public  void Display()
    {

        System.out.println("Elements of array are");

        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
          System.out.println(Arr[iCnt]);
        }
    }

    public int Addition()
    {
        
         int iSum = 0;
          
        for(int iCnt = 0; iCnt < iSize ; iCnt++)
        {
           iSum = iSum + Arr[iCnt];
        }
        return iSum;
    }

}

class ArrayOOP
{
    public static void main(String Arg[])
    {
        
        ArrayX aobj = new ArrayX(5);

        aobj.Accept();
        aobj.Display();


     int iRet = aobj.Addition();

       System.out.println("Addition of elements of array is: " + iRet);


    }
}