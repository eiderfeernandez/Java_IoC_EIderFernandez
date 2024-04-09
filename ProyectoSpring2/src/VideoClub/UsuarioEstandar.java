package VideoClub;

public class UsuarioEstandar implements Usuarios {

	//creación de campo tipo creacionPrivilegios (interfaz)
	private CreacionPrivilegios priv;
	
	private String nombreEmpresa;
	private String nombreUsuario;
	private String email;

	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}


	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}


	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setPriv(CreacionPrivilegios priv) {
		this.priv = priv;
	}


	@Override
	public String getTipoUsuario() {
		// TODO Auto-generated method stub
		return "USUARIO ESTANDAR -> Tiene pocos prvilegios";
	}

	@Override
	public String getTipoPrivilegios() {
		// TODO Auto-generated method stub
		return "Privilegios del USUARIO ESTANDAR: " + priv.getTipoPrivilegiosEstandar();
	}

}
