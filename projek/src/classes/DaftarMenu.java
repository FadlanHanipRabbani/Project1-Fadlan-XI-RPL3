public class DaftarMenu {
    private ArrayList<Menu> daftarMenu;

    public DaftarMenu() { }
    public DaftarMenu() {
        daftarMenu = new ArrayList<>();
    }

    public void tambahMenu(Menu menu) { }
    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
    }

    public void getMenuByKategori(String kategori) { }
    public void getMenuByKategori(String kategori) {
        System.out.println("======== " + kategori + " ========");

    public void tampilDaftarMenu() { }
        for (int i = 0; i < daftarMenu.size(); i++) {
            Menu m = daftarMenu.get(i);
            if (m.getKategori().equals(kategori)) {
                System.out.println((i + 1) + ". " + m.getNama_menu() + "\t" + m.getHarga());
            }

        }
    }

    public void tampilDaftarMenu() {
        System.out.println("======== ULTRAMEN ========");
        getMenuByKategori("Ramen");
        getMenuByKategori("Kuah");
        getMenuByKategori("Toping");
        getMenuByKategori("Minuman");
    }
}