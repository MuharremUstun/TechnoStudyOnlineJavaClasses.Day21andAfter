package Day47.AbstarctTask;

public class ManagerLogin extends AbstractLogin {
    @Override
    public void testLogin() {
        System.out.println("Manager Login");
    }

    @Override
    public void testPassword() {
        System.out.println("Manager Password");
    }
}
