package l16;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MainTest {
    @Test
    public void testValidateNameValid() {
        assertTrue(Main.validate_name("Toyota"));
    }

    @Test
    public void testValidateNameInvalid() {
        assertFalse(Main.validate_name("Toyota123"));
    }

    @Test
    public void testValidateCompanyValid() {
        assertTrue(Main.validate_company("Ford"));
    }

    @Test
    public void testValidateCompanyInvalid() {
        assertFalse(Main.validate_company("Ford#"));
    }

    @Test
    public void testValidateSpecificationsValid() {
        assertTrue(Main.validate_specifications("Hybrid"));
    }

    @Test
    public void testValidateSpecificationsInvalid() {
        assertFalse(Main.validate_specifications("Hybrid123"));
    }

    @Test
    public void testValidatePriceValid() {
        assertTrue(Main.validate_price("25000+"));
    }

    @Test
    public void testValidatePriceInvalid() {
        assertFalse(Main.validate_price("25000"));
    }

    @Test
    public void testTryFromFile() {
        String data = "Toyota,Camry,2019,25000+,Hybrid\n" +
                "Ford,Mustang,2022,30000+,Gasoline\n" +
                "Chevrolet,Camaro,2021,35000+,Gasoline\n";

        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Main.Try_From_File();

        System.setIn(stdin);
    }

    @Test
    public void testMainValid() {
        String data = "Toyota\nCamry\n2019\n25000+\nHybrid\n";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Main.main(null);

        System.setIn(stdin);
    }

    @Test
    public void testMainInvalid() {
        String data = "Toyota123\nCamry\n2019\n25000\nHybrid\n";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Main.main(null);

        System.setIn(stdin);
    }
}
