import java.util.*;
class strsum
{ public static void main(String arg[])
  { String str;
    int sum = 0, eve = 0, odd = 0;
   Scanner s = new Scanner(System.in);
   System.out.println(" Enter the string : ");
   str = s.nextLine();
   StringTokenizer stoken = new StringTokenizer(str);
   System.out.println(" The list is : ");
   while ( stoken.hasMoreTokens())
   { String n = stoken.nextToken();
      int x = Integer.parseInt(n);
     System.out.print(" "+x);
     if ( x%2==0 )   
        eve++;
     else
        odd++;
      sum = sum + x;
   }
   System.out.println("\n The Sum is : "+sum);
   System.out.println(" The list contains "+eve+" even numbers and "+odd+" odd numbers..");
 }
}