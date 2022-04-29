import java.util.Scanner;

public class Mario2 {

    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter height of pyramid");
        int num = 0;

        while (true) {
            num= input.nextInt();

            if (num<0|| num> 8) {
                System.out.println("try again");
                continue;
            }
            else if(num>0 || num<8){
                System.out.println("great");
            }
            //Print right and left side
            System.out.println("Right and left");
            for(int i=1;i<=num;i++){
                //Print the blank space

                for(int c=num;c>i;c--)

                    System.out.print("");
                for(int c=num;c>i;c--)
                    System.out.print(" ");

                for (int ii=1; ii<=num; ii++);

                for (int jj=1; jj<=i; jj++);

                //Print #
                for(int j=1;j<=i;j++)
                    System.out.print("#");
                System.out.print("\t");


                for(int j=1;j<=i;j++)
                    System.out.print("#");

                System.out.println();


            }

        }
    }
}
