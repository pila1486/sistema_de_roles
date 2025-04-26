

package com.mycompany.login;

import com.mycompany.login.igu.LoginInicial;
import com.mycompany.login.logica.Controladora;


public class Login {

    public static void main(String[] args) {
        
        LoginInicial principal = new LoginInicial();  
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        
        Controladora control = new Controladora();
        
    }
}
