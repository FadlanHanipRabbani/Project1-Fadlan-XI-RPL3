package classes;
import java.util.ArrayList;
public class Transaksi {
    private String noTransaksi;
    private String namaPemesan;
    private String tanggal;
    private String noMeja;
    private ArrayList<Pesanan> pesanan;
    private double uangBayar;
    private double pajak;
    private double totalBayar;
    //tambah
    private double biayaService=0;

    public Transaksi(String no_transaksi, String nm_pemesan, String tanggal, String no_meja) { }
    public Transaksi(String no_transaksi, String nama_pemesan, String tanggal, String no_meja) {
        this.noTransaksi = no_transaksi;
        this.namaPemesan = nama_pemesan;
        this.tanggal = tanggal;
        this.noMeja = no_meja;

    public void tambahPesanan(Pesanan pesanan) { }
        pesanan = new ArrayList<>();
    }

    public Pesanan getPesanan() { return null; }
    public void tambahPesanan(Pesanan pesanan) {
        this.pesanan.add(pesanan);
    }

    public ArrayList<Pesanan> getSemuaPesanan() { return null; }
//    public Pesanan getPesanan() { return null; }

    public ArrayList<Pesanan> getSemuaPesanan() {
        return pesanan;
    }

    public double hitungTotalBayar() { return 0; }

    public double hitungKembalian() { return 0; }
    public void cetakStruk() { }
}