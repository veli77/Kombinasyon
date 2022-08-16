import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        long n,r,nfac=1,rfac=1,nmrfac=1,komb;
        System.out.println("n sayısını giriniz: ");
        n = giris.nextInt();
        System.out.println("r sayısını giriniz: ");
        r = giris.nextInt();
        for (int i=1;i <= n; i++){
            nfac=nfac*i;
        }
        for (int i=1;i <= r; i++){
            rfac=rfac*i;
        }
        for (int i=1;i <= (n-r); i++){
            nmrfac=nmrfac*i;
        }
        komb = nfac/(rfac*nmrfac);
        System.out.println(komb);



    }
}





