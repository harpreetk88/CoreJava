class BreakAndContinue
{
    public static void main(String args[])
    {
        System.out.println("Break");
        for(int i=1;i<=5;i++)
        {
            if(i==4) break;
            System.out.println(i);
        }
        System.out.println("Continue");
        for(int i=1;i<=5;i++)
        {
            if(i==4) continue;
            System.out.println(i);
        }
    }
} 




