package UI.Tekstikayttoliittyma;

import fi.helsinki.cs.tmc.edutestutils.MockStdio;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;

/**
 *
 * @author jarmo
 */
public class LukijaTest {

    @Rule
    public MockStdio io = new MockStdio();

    @Test
    public void testKysyString() {
        String merkkijono = "tämä on ilkeä testi trolololoololololoooo";
        io.setSysIn(merkkijono + "\n");
        Lukija l = new Lukija();
        String saatu = l.kysyString("Anna viesti: ");
        assertEquals("Ei lue annettua kirjainjokukkoa  oikein.", merkkijono, saatu);
    }
    
     @Test
    public void testKysyString2() {
        String merkkijono = "tämä on ilkeä testi trolololoololololooootämä on ilkeä testi trolololoololololooootämä on ilkeä testi trolololoololololoooo";
        io.setSysIn(merkkijono + "\n");
        Lukija l = new Lukija();
        String saatu = l.kysyString("Anna viesti: ");
        assertEquals("Ei lue annettua kirjainjokukkoa  oikein.", merkkijono, saatu);
    }

    @Test
    public void testKysyInt() {
        io.setSysIn("5\n");
        Lukija l = new Lukija();
        int saatu = l.kysyInt("Anna numero: ");
        assertEquals("Ei lue annettua int arvoa oikein.", 5, saatu);
    }
    
     @Test
    public void testKysyInt2() {
        io.setSysIn("50\n");
        Lukija l = new Lukija();
        int saatu = l.kysyInt("Anna numero: ");
        assertEquals("Ei lue annettua int arvoa oikein.", 50, saatu);
    }
     
     @Test
    public void testKysyInt3() {
        io.setSysIn("50000\n");
        Lukija l = new Lukija();
        int saatu = l.kysyInt("Anna numero: ");
        assertEquals("Ei lue annettua int arvoa oikein.", 50000, saatu);
    }

    @Test
    public void testKysyIntToimiiOikeinVirheTilanteissa() {
        String merkkijono = "5 trololololoo";
        io.setSysIn("\n");
        Lukija l = new Lukija();
        int saatu = l.kysyInt("Anna numero: ");
        assertEquals("Virheellisen int arvon antaminen ai toimi, kuuluisi palauttaa \"-1\" ", -1, saatu);
    }
    
    @Test
    public void testKysyIntToimiiOikeinVirheTilanteissa2() {
        String merkkijono = "5 trolololadadasdasdasdasdqeeqfwfoloo 6";
        io.setSysIn("\n");
        Lukija l = new Lukija();
        int saatu = l.kysyInt("Anna numero: ");
        assertEquals("Virheellisen int arvon antaminen ai toimi, kuuluisi palauttaa \"-1\" ", -1, saatu);
    }
}
