public class yazilimci extends calisanBase {
    private String diller;
    public yazilimci(String adSoyad,int id,String diller){
        super(adSoyad,id);
        this.setDiller(diller);
    }
    public void bilgiGoster(){
        super.bilgiGoster();
        System.out.println("Bilinen diller: "+diller );
    }
    public void formatAt(String isletimSistemi){
        System.out.println(getAdSoyad() +" "+ isletimSistemi + " yüklüyor...");

    }

    public String getDiller() {
        return diller;
    }

    public void setDiller(String diller) {
        this.diller = diller;
    }
}
