import java.util.Scanner;

class Main {
public static void main(String[] args) {
  /*   FOR LOOP
   for (int i = 1 ; i <=10; i++ ){
        System.out.println("The number is : "+ i);
    }
   Q. TAKE AN INTEGER AND ANOTHER VALUES OF N INTEGER AND THEN GIVE THE MAX OUT OF ALL VALUES
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int maxVal = Integer.MIN_VALUE;    --- takes min value possible
    for (int i= 1; i<= N; i++ ){
        int i1 = sc.nextInt();
        maxVal = Math.max(maxVal,i1);      ---compare min value nd input to give the biggest out of them
    }
    System.out.println(maxVal);

    WHILE LOOP
    int i = 1;           ---initialise variable
    while (i<=10){         ---give condition
        System.out.println(i);
        i++;                   ---updation of variable
    }
    Q. COUNT THE DIGITS
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int digits = 0;
    while (N>0){
        N /= 10;           ----divide by 10 to reduce the digits [9876/10=987/10=98/10=9 etc.]
        digits++;
    }
    System.out.println(digits);

    DO WHILE LOOP         --- condition is checked at exit time (body is executed at least 1 )
    int i = 5;
    do{
        System.out.println(i);
        i--;
    }while (i>=0);

    Q. SUM OF POSITIVE NUMBERS  --- Read the input till a -ve occurs and then add all
    Scanner sc = new Scanner(System.in);
    int sm = 0;                 ---initial sum
    int N;                      ---declaring variable
    do {
        N = sc.nextInt();      ---taking input
        sm = sm+ N;
    }while (N>=0);            ---condition

    System.out.println(sm); */

    //Q. RANDOM GAME --- Generate random number till u get 5
    while (true){
        int num = (int)(Math.random()*10 + 1);  //random give number btwn 0.0 to <1 --- give range [1,10]
        if (num==5)
            break;
        System.out.println(num + " ");

    }
}}