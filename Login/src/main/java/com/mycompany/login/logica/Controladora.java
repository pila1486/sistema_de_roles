
package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public User validarUsuario(String usuario, String contrasena) {
        
        User usr = null;
       // String mensaje = "";
        List<User> listaUsuarios = controlPersis.traerUsuarios();
        for(User user : listaUsuarios){
        if(user.getNombre().equals((usuario))){
           if(user.getContrasena().equals(contrasena)){
           //mensaje = "Usuario y contraseña correctos. Bienvenido/a";
           usr = user;
           return usr;
           }else {
           //mensaje =  "Contraseña incorrecta";
           usr = null;
           return usr;
           }
        }   
            
        }
             return usr;
    }

    public List<User> traerUsuarios() {
        
     return controlPersis.traerUsuarios();

    }

    public List<Rol> traerRoles() {
        
        return controlPersis.traerRoles();
            
    }

    public void crearUsuario(String usuario, String contrasena, String rolRecibido) {
        
       User usu = new User();
       usu.setNombre(usuario);
       usu.setContrasena(contrasena);
       
       //Tenemos que buscar el rol
       Rol rolEncontrado = new Rol();
       rolEncontrado = this.traerRol(rolRecibido);
       
       if(rolEncontrado != null){
       usu.setUnRol(rolEncontrado);
       }   
       controlPersis.crearUsuario(usu);
    }
    

    private Rol traerRol(String rolRecibido) {
        
       List <Rol> listaRoles = controlPersis.traerRoles();
       
       for (Rol rol: listaRoles){
       
           if(rol.getNombreRol().equals(rolRecibido)){
           return rol;
           }
       }
       return null;
    }

    public void borrarUsuario(int idUsuario) {
        controlPersis.borrarUsuario(idUsuario);
    }

    public User traerUsuario(int idUsuario) {
        return controlPersis.traerUsuario(idUsuario);

    }

    public void editarUsuario(User usuario, String nombreUsuario, String contrasena, String rolRecibido) {
        
               usuario.setNombre(nombreUsuario);
               usuario.setContrasena(contrasena);
               
               Rol rolEncontrado = new Rol();
               rolEncontrado = this.traerRol(rolRecibido);
       
               if(rolEncontrado != null){
               usuario.setUnRol(rolEncontrado);
             }   
               
              controlPersis.editarUsuario(usuario);
               
               
        
    }




}
