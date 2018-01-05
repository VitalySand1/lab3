import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;

public class AbonentTest {
    @Test
    public void testIfPilgoviy(){
        Abonent A = new Abonent("Vitaly", "Sand",false,03722424, LocalDate.of(1998,12,14));
        Assert.assertEquals(A.IfPilgoviy(),false);
    }

    @Test
    public void testIfPensioner(){
        Abonent A = new Abonent("Vitaly", "Sand",false,03722424, LocalDate.of(1998,12,14));
        Assert.assertEquals(A.IfPensioner(),false);
    }
}