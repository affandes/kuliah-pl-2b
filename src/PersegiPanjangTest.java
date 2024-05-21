import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PersegiPanjangTest {

    @Test
    public void tesLuas() {

        PersegiPanjang p = new PersegiPanjang(100, 86);
        int hasil = 8600;

        assertEquals(hasil, p.luas());
    }


}