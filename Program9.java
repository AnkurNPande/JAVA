import java.util.*;




class MarvellousX
{
    public void Display(String s)
    {
        
       for (int i =0;i < s.length();i++)
       {
        System.out.println(s.charAt(i));
       }
    }

}
class Program9
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please  enter string");

        String str = sobj.nextLine();

        MarvellousX mobj = new MarvellousX();
        mobj.Display(str);

    }
}