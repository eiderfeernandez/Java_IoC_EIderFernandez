package VideoClub;

public class UsuarioMedio implements InterfazUsuarioEstandar {

	@Override
	public void insertarUsuario() {
		System.out.println("Insertando usuario medio");

	}

	@Override
	public void eliminarUsuario(int usuarioEstandar) {
		System.out.println("Eliminando usuario medio: " + usuarioEstandar);

	}

}
