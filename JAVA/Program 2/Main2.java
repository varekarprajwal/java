import java.util.Scanner;
public class Main2 {
   public static void main(String[] args) {
   Scanner array1=new Scanner(System.in);
   System.out.println("enter the number elements of array");
   int i,n;
   float sum=0,avg;
   n=array1.nextInt();
   int[] array=new int[n];
   System.out.println("enter the  elements of array");
   for(i=0;i<n;i++)
   {
        array[i]=array1.nextInt();
   }
   for(int x: array)
   {
        sum += x;
   }
   avg=(sum)/(n);
   System.out.println("the average of array is:" +avg);
}
}