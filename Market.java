import java.util.Scanner;
class Pedagang{
    String namaPedagang, jenisDagangan;
    boolean isDatang,isBukaLapak;
    int laba,rugi;
    public Pedagang(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        this.namaPedagang = input.nextLine();
        System.out.print("Jenis Barang Dagangan : ");
        this.jenisDagangan = input.nextLine();
        this.isDatang = false;
        this.isBukaLapak = false;
        this.laba = 0;
        this.rugi = 0;
    }
    public void setDatang(){
        boolean berangkat;
        Scanner inp = new Scanner(System.in);
        System.out.print("berangkat (true/false) ");
        berangkat = inp.nextBoolean();
        if (berangkat){
            this.isDatang = true;
            System.out.print(this.namaPedagang + " tiba di pasar");
            this.laba = 200000;
        }else{
            this.isDatang = false;
            System.out.print(this.namaPedagang + " tidak berangkat ke pasar");
        }
    }
    public int getLaba(){
        return this.laba;
    }
}
class Pasar{
    String namaPasar,lokasiPasar;
    boolean isBuka;
    int kapasitas;
    public Pasar(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Pasar : ");
        this.namaPasar = input.nextLine();
        System.out.print("Lokasi : ");
        this.lokasiPasar = input.nextLine();
        this.isBuka = false;
        this.kapasitas = 5;
    }
    public void Buka(){
        byte jam;
        Scanner input = new Scanner(System.in);
        System.out.print("Jam Sekarang : ");
        jam = input.nextByte();
        if ((jam >= 5)&&(jam <= 12)){
            this.isBuka = true;
            System.out.print("Pasar "+ this.namaPasar +", "+this.lokasiPasar+" sudah buka\n");
            this.kapasitas -= 5;
        }else{
            this.isBuka = false;
            System.out.print("Pasar "+ this.namaPasar +" sudah tutup\n");
        }
    }
    public int getKapasitas(){
        return this.kapasitas;
    }
}
public class Market {
    public static void main(String[]args){
        Pasar pasar2 = new Pasar();
        Pedagang pedagang2 = new Pedagang();

        pasar2.Buka();
        pedagang2.setDatang();
        System.out.print(" & mendapat laba sebesar "+pedagang2.getLaba());
        System.out.print("\nSisa lapak : "+pasar2.getKapasitas());

    }

}
