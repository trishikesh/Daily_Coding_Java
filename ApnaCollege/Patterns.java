import java.util.Scanner;

public class Patterns{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

//        print rectangle    ***
//                           ***
//                           ***
//                           ***
//        for (int i=1; i<=n;i++){
//            for(int j=1;j<=m;j++){
//                System.out.print( "*");
//            }
//            System.out.println( );
//        }
//
//        half pyramid *
//                     **
//                     ***
//        for (int i =1; i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println( );
//        }
//
//        half pyramid inverted  ***
//                               **
//                               *
//        for (int i =n; i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println( );
//        }
//
//        mirrored pyramid
//        for (int i =1; i<=n;i++){
//            for(int j=1;j<=(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j<=i ;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//           print 1
//                 1 2
//                 1 2 3
//        for(int i=1; i<=n;i++){
//            for(int j =1; j<=i ; j++){
//                System.out.print(j);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//
//        inverted number pyramid
//        for (int i=n;i>=1;i--){
//              for(int j=1;j<=i;j++){
//                  System.out.print(j + " ");
//              }
//              System.out.println();
//          }
//
//          Floyd's Triangle
//          int s = 0;
//          for(int i=1; i<=n;i++){
//              for(int j=1; j<=i;j++){
//                  s+=1;
//                  System.out.print(s + " ");
//              }
//              System.out.println();
//          }
//
//          rhombus
//        for(int i=1;i<=n;i++){
//            int x = n-i;
//            int y = n-x-1;
//            for (int j=1;j<=x;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=n;j++){
//                System.out.print("* ");
//            }
//            for(int j=1;j<=y;j++){
//               System.out.print(" ");
//            }
//            System.out.println();
//
//        }
//
//        number pyramid
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(i + " ");
//            }
//            System.out.println( );
//        }
//
//        palindromic pattern
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int k =0;
            for(int j=1;j<=i;j++){
                System.out.print(j-k + " ");
                k++;
            }
            System.out.println();
        }

    }
}
