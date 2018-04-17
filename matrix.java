import java.util.*;
class matrix
{  public static void main (String arg[] )
   {  int r1, c1, r2, c2;
      Scanner s = new Scanner(System.in);
      System.out.println(" Enter the rows and columns for the first matrix : ");
      r1 = s.nextInt();
      c1 = s.nextInt();
      System.out.println(" Enter the rows and columns for the second matrix : ");
      r2 = s.nextInt();
      c2 = s.nextInt();
      if ( r2!=c1 )
       System.out.println(" Matrix multiplication not possible..");
     else
     {  int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        int c[][] = new int[r1][c2];
        System.out.println(" Enter elements for first matrix : ");
        for ( int i=0; i<r1; i++ )
          for ( int j=0; j<c1; j++ )
             a[i][j] = s.nextInt();
        System.out.println(" Enter elements for second matrix : ");  
        for ( int i=0; i<r2; i++ )
           for ( int j=0; j<c2; j++ )
              b[i][j] = s.nextInt();
        for ( int i=0; i<r1; i++ )
        {  for ( int j=0; j<c2; j++ )
           {  c[i][j] = 0;
              for ( int k=0; k<c1; k++ )
               { c[i][j] = c[i][j] + (a[i][k]*b[k][j]);
               }
           }
        }
        int t[][] = new int[c2][r1];
        for ( int i=0; i<c2; i++ )
          for ( int j=0; j<r1; j++ )
            t[i][j] = c[j][i];
        System.out.println(" The resultant matrix is : ");
        for ( int i=0; i<r1; i++ )
        {  for ( int j=0; j<c2; j++ )
             System.out.print(c[i][j]+" ");
           System.out.println();
        }
        System.out.println(" The resultant transpose matrix is : ");
        for ( int i=0; i<c2; i++ )
        {  for ( int j=0; j<r1; j++ )
             System.out.print(t[i][j]+" ");
           System.out.println();
        } 
    }
}
}
 
      