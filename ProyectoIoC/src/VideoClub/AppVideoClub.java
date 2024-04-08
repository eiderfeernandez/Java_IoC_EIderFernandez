package VideoClub;

public class AppVideoClub { //app
	
	public static void main(String[] args) {
		Usuario estandar = new Usuario(new UsuarioMedio());
		estandar.getInsertarUsuario();
		estandar.getEliminarUsuario(1);
	}	
}
