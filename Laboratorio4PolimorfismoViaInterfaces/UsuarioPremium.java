package Laboratorio4PolimorfismoViaInterfaces;

public class UsuarioPremium implements IReservaUsuario{ 

    //atributos de esta clase... 
    private String Username;
    private String Password; 

    public UsuarioPremium () { 
        Username=""; 
        Password=""; 
    } 

    //metodos get y set de cada uno de los atributos anterioes... 
    public String getUsername() {
        return this.Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return this.Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }  
    
    //metodo ToString
    @Override
    public String toString() {
        return "{" +
            " Username='" + getUsername() + "'" +
            ", Password='" + getPassword() + "'" +
            "}";
    }

    //metodos implementados de la interfaz controladora de los usuarios, IReservaUsuario. 
    @Override
    public void login(String Password, String Username) {
        this.Username = Username; 
        this.Password = Password; 
        System.out.println("Usuario Premium registrado con exito...");
    }

    @Override
    public void CambiarContrasenia() {
       //metodo para el cambio de contrasenia... 
    } 
}
