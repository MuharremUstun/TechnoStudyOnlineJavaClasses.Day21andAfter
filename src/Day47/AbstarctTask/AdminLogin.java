package Day47.AbstarctTask;

public class AdminLogin extends AbstractLogin {
    @Override
    public void testLogin() {
        System.out.println("Adm Login");
    }

    @Override
    public void testPassword() {
        System.out.println("Adm Password");
    }
}
