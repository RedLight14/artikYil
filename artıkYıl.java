import java.util.Scanner;

public class artıkYıl {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int yıl,x;

        System.out.print("Yil giriniz : ");
        yıl = inp.nextInt();

        if(yıl%100==0)
        {
            if(yıl%400==0)
            {
                System.out.print(yıl+" Artik yildir");
            }
            else
            {
                System.out.print(yıl+" Artik yil degildir");
            }
        }
        else if(yıl%4==0)
        {
            System.out.print(yıl+" Artik yildir");
        }

        else
        {
            System.out.print(yıl+" Artik yil degildir");
        }


    }
    }
