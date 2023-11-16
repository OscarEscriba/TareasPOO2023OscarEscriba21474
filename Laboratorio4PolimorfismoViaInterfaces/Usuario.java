package Laboratorio4PolimorfismoViaInterfaces;

public class Usuario implements IReservaUsuario{ 

    private String Username; 
    private String Password; 

    public Usuario() { 
        Username=""; 
        Password=""; 
    } 
    //metodos get y set
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

    //metodos de la interfaz... 
    @Override
    public void login(String Username, String Password) {  
        this.Username = Username; 
        this.Password=Password; 
        System.out.println("Usario Basico Registrado...");
    }
    @Override
    public void CambiarContrasenia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CambiarContrasenia'");
    } 
} 
