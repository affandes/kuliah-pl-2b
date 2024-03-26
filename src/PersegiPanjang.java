public class PersegiPanjang {

    public int panjang;
    public int lebar;

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

}
