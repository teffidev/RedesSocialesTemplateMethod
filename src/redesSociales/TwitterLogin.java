package redesSociales;

public class TwitterLogin extends Login {

    public TwitterLogin(String usuario, String contrasenia) {
        super(usuario, contrasenia);
    }

    @Override
    protected Boolean iniciarSesion(String usuario, String contrasenia) {
        System.out.println("Validando usuario y contraseña con Twitter");
        return validarUsuarioYContrasenia(usuario, contrasenia);
    }

}
