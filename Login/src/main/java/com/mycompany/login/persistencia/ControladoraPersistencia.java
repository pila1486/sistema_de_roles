
package com.mycompany.login.persistencia;

import com.mycompany.login.logica.Rol;
import com.mycompany.login.logica.User;
import com.mycompany.login.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    UserJpaController userJpa = new UserJpaController();
    RolJpaController rolJpa = new RolJpaController();
   


    public List<User> traerUsuarios() {

        return userJpa.findUserEntities();

    }

    public List<Rol> traerRoles() {
        
        return rolJpa.findRolEntities();
    }



    public void crearUsuario(User usu) {
        
        userJpa.create(usu);
    }

    public void borrarUsuario(int idUsuario) {
        
        try { 
            userJpa.destroy(idUsuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public User traerUsuario(int idUsuario) {
        
      return  userJpa.findUser(idUsuario); 
        
    }

    public void editarUsuario(User usuario) {
        
        try {
            userJpa.edit(usuario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   

}
