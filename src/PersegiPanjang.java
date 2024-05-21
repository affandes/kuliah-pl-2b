public class PersegiPanjang {

    public int panjang;
    public int lebar;

    PersegiPanjang() {
    }

    PersegiPanjang(String panjang, String lebar) {
        this.panjang = Integer.parseInt(panjang);
        this.lebar = Integer.parseInt(lebar);
    }

    PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int luas() {
        return this.panjang * this.lebar;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(panjang,2)+Math.pow(lebar, 2));
    }

    public void printLuas(String satuan) {
        System.out.println(luas() + satuan);
    }

    @Override
    public String toString() {
        return "Luas PersegiPanjang: " + this.luas();
    }
}
