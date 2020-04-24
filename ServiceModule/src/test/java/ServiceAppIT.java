import org.junit.Test;

public class ServiceAppIT {

    @Test
    public void testForSub() {
        new ServiceApp().sub(30, 10);
    }
}
