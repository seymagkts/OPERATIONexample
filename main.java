import java.sql.SQLOutput;
import java.util.Scanner;

public  class b {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = "1. Yazilimci İslemleri\n"+
                "2. Yönetici İslemleri\n" +
                "Cıkıs icin q'ya basiniz";

        System.out.println(islemler);


        while (true) {
            System.out.println("İslem seciniz:");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Program sonlanıyor...");
                break;
            } else if (islem.equals("1")) {
                yazilimci yazilimci = new yazilimci("Seyma Goktas", 490, "java,C#");
                String yazilimciİslem = "1. Format at\n"+
                        "2. Bilgileri göster\n"+
                        "Cıkıs icin q'ya basiniz...";
                System.out.println(yazilimciİslem);

                while (true) {
                    System.out.println("İslem seciniz:");
                    String isleem = scanner.nextLine();
                    if(isleem.equals("q")){
                        System.out.println("Program sonlanıyor...");
                        break;
                    }else if(isleem.equals("1")){
                        System.out.println("Kullanilan isletim sistemi : ");
                        String isletimSis=scanner.nextLine();
                        yazilimci.formatAt(isletimSis);

                    }else if(isleem.equals("2")){
                        yazilimci.bilgiGoster();
                    }else{
                        System.out.println("Gecersiz islem...");
                    }

                }
            } else if (islem.equals("2")) {
                yonetici yonetici = new yonetici("Sudenur Goktas", 857, 12);
                String yoneticiİslem = "1. Zam yap\n"+
                               "2. Bilgileri göster\n"+
                        "Cıkıs icin q'ya basiniz...";
                System.out.println(yöneticiİslem);

                while (true) {
                    System.out.println("İslem seciniz:");
                    String islemm = scanner.nextLine();
                    if(islemm.equals("q")){
                        System.out.println("Program sonlanıyor...");
                        break;
                    }else if(islemm.equals("1")){
                        System.out.println("Yapilmak istenen zam tutarı : ");
                        int zam=scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zam);

                    }else if(islemm.equals("2")){
                        yonetici.bilgiGoster();
                    }else{
                        System.out.println("Gecersiz islem...");
                    }
                }

            } else {
                System.out.println("Gecersiz İslem...");
            }
        }
     }
   }
