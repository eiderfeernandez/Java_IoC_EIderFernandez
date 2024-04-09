package VideoClub;

public class UsuarioMedio implements Usuarios { //jefe empleado

	//creación de campo tipo creacionPrivilegios (interfaz)
		private CreacionPrivilegios priv;
		
		private String nombreUsuario;
		private String email;

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
			return "USUARIO MEDIO -> Tiene la mitad de los privilegios";
		}

		@Override
		public String getTipoPrivilegios() {
			// TODO Auto-generated method stub
			return "Privilegios del USUARIO MEDIO: " + priv.getTipoPrivilegiosMedio();
		}

}
