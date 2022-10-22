package redesSociales;

public class GoogleLogin extends Login {

    public GoogleLogin(String usuario, String contrasenia) {
        super(usuario, contrasenia);
    }

    @Override
    protected Boolean iniciarSesion(String usuario, String contrasenia) {
        System.out.println("Validando usuario y contraseña con Google");
        return validarUsuarioYContrasenia(usuario, contrasenia);
    }
}
