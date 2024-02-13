import java.util.Scanner;
class Main1
{
        public static void main(String[] args)
    {
        System.out.println("Enter the character without sapce");
        Scanner input = new Scanner(System.in);
        String str=input.next();
        int count[] = new int[256];
        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++)
        {
            ch[i] = str.charAt(i); 
            int find = 0;
            for (int j = 0; j <= i; j++)
            {
             if (str.charAt(i) == ch[j])
             find++;
            }
 
            if (find == 1)
                System.out.println("Number of Occurrence of "+ str.charAt(i)+ " is:" + count[str.charAt(i)]);
        }
    }
                    
}     