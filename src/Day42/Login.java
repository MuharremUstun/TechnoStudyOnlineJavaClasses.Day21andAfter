package Day42;

import java.util.regex.Pattern;

class Login {
    private String username;
    private String password;
    private boolean rememberMe;

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.contains("[[:alpha:]]+")) {
            this.password = password;
        } else {
            this.password = null;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
