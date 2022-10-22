package redesSociales;

public abstract class Login {

    private String usuario;
    private String contrasenia;

    public Login(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public Boolean validarUsuarioYContrasenia(String usuario, String contrasenia) {
        Boolean usuarioValido = Boolean.FALSE;
        if(usuario != null && contrasenia != null){
            usuarioValido = iniciarSesion(usuario, contrasenia);
        }
        return usuarioValido;
    }
    protected abstract Boolean iniciarSesion(String usuario, String contrasenia);

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
