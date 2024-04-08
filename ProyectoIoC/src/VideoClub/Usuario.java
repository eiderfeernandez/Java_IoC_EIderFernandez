package VideoClub;

public class Usuario { //UsuarioImpOracle
	
	InterfazUsuarioEstandar usser;
	
	public Usuario(InterfazUsuarioEstandar usser) {
		this.usser = usser;
	}

	
	public void getInsertarUsuario() {
		usser.insertarUsuario();
	}
	
	public void getEliminarUsuario(int usuarioEstandar) {
		usser.eliminarUsuario(usuarioEstandar);
	
	}


}
