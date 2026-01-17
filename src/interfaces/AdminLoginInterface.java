package Interfaces;

import java.lang.*;
import SourceFiles.*;


public interface AdminLoginInterface {
    boolean checkLoginData(String username, char[] password);
}