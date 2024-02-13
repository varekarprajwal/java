import java.util.Scanner;
class Main3
{
        public static void main(String[] args)
    {   int n;
        System.out.println("Enter the digits");
        Scanner input = new Scanner(System.in);
        String str=input.next();
        int count[] = new int[256];
        int len = str.length();
        for (int i = 0; i < len; i++)
        
            count[str.charAt(i)]++;
        char ch[] = new char[str.length()];
        System.out.println("The break of above digits ");
        for (int i = 0; i < len; i++)
        {
            ch[i] = str.charAt(i);
            n=i+1;
        System.out.println("The digits of "+ n +" place");
        System.out.println(ch[i]);
        }
    }
                    
} 