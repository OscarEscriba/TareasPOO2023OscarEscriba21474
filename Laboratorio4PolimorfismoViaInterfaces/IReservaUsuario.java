package Laboratorio4PolimorfismoViaInterfaces;

public interface IReservaUsuario {
    void login(String Username, String Password);  //metodo para realizar el login  
    void CambiarContrasenia(); //metodo cuando se quiera cambiar de contraseña  
    /* 
     * metodo de confirmacion y cambair el tipo de usuario... quedan pendientes
     * luego tengo que programar la parte principal de nuestro programa... que es donde estén las clases... 
     * (pensar como podemos diferenciar entre cliente premium y basico...)
     * luego todo lo demas ya lo tenemos resuelto a excepcion de la parte de mostrar los datos en un csv... 
     */
}
