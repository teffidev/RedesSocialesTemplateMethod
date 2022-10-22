package redesSociales;

public class FacebookLogin extends Login {

    public FacebookLogin(String usuario, String contrasenia) {
        super(usuario, contrasenia);
    }

    @Override
    protected Boolean iniciarSesion(String usuario, String contrasenia) {
        System.out.println("Validando usuario y contraseña con Facebook");
        return validarUsuarioYContrasenia(usuario, contrasenia);
    }
}
