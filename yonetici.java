public class yonetici extends calisanBase{
    private int sorumluKisi;

    public yonetici(String adSoyad,int id,int sorumluKisi) {
        super(adSoyad, id);
        this.setSorumluKisi(sorumluKisi);
    }
    public void bilgiGoster(){
        super.bilgiGoster();
        System.out.println("Sorumlu oldugu kisi sayisi: "+sorumluKisi );
    }
    public void zamYap(int zam){
        System.out.println(zam+"tl yapildi...");
    }

    public int getSorumluKisi() {
        return sorumluKisi;
    }

    public void setSorumluKisi(int sorumluKisi) {
        this.sorumluKisi = sorumluKisi;
    }
}
