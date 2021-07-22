import java.util.Scanner;

public class calisanBase {

    private String adSoyad;
    private int id;

    public calisanBase(String adSoyad,int id){
        this.setAdSoyad(adSoyad);
        this.setId(id);
    }
    public void bilgiGoster(){
        System.out.println("Ad ve Soyad: " + adSoyad);
        System.out.println("ID: "+ id);
    }


    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
