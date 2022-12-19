//use of toCharArray() method


import java.util.*;

class Program13
{
    public static void main(String Ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please string : ");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        System.out.println(Arr);
      
    }
}