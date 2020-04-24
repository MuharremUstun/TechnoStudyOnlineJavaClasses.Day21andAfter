package Day47.AbstarctTask;

public class UserLogin extends  AbstractLogin {
    @Override
    public void testLogin() {
        System.out.println("User Login");
    }

    @Override
    public void testPassword() {
        System.out.println("User Password");
    }
}
