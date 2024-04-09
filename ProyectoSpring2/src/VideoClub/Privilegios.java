package VideoClub;

public class Privilegios implements CreacionPrivilegios {

	@Override
	public String getTipoPrivilegiosEstandar() {
		return "Puede realizar consultas";
	}
	
	@Override
	public String getTipoPrivilegiosMedio() {
		return "Dirige las consultas del USUARIO ESTÁNDAR";
	}
	
	@Override
	public String getTipoPrivilegiosPremium() {
		return "Dirige las consultas tanto del USUARIO MEDIO como del USUARIO PREMIUM";
	}

}
