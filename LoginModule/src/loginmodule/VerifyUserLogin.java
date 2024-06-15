package loginmodule;

import java.util.*;

public class VerifyUserLogin {
    private ArrayList<String> credentialsList;
    
    public VerifyUserLogin() {
        ReadCredentialsFile reader = new ReadCredentialsFile();
        credentialsList = new ArrayList<String>(reader.getCredentialsList());
    }
    
    public boolean verifyUserLoginCredentials(String inputUserName, String inputPassword){
        for(int i = 0; i < credentialsList.size(); i++) {
            String[] credentials = credentialsList.get(i).split(",");
            if(inputUserName.equals(credentials[0]) && inputPassword.equals(credentials[1])) {
                return true;
            }
        }
        return false;
    }
    
    public boolean verifyLogin(String username, String password) {
        // Code to verify the user's credentials against a database or other system
        // For the purposes of this example, we will assume that the correct username and password are "testuser" and "password" respectively
        if (username.equals("testuser") && password.equals("password")) {
            return true;
        } else {
            return false;
        }
    }
}
