package VideoClub;

public class UsuarioEstandar implements InterfazUsuarioEstandar { //usuario factory

	@Override
	public void insertarUsuario() {
		// TODO Auto-generated method stub
		System.out.println("Inserte un usuario estándar");
	}

	@Override
	public void eliminarUsuario(int usuarioEstandar) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando un usuario estándar: " + usuarioEstandar);
		
	}

}
