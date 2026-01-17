package Interfaces;

import java.lang.*;
import SourceFiles.*;

public interface UserSignupInterface {
    void saveSignupData(String username, char[] password, String mobileNumber, String email, String formattedDateTime);
}
