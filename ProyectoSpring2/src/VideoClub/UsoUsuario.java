package VideoClub;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoUsuario {

	public static void main(String[] args) {
		/*
		//Creacion de los objetos tipo Usuarios
		Usuarios usuario1 = new UsuarioPremium();
		
		//Uso de los objetos creados
		System.out.println(usuario1.getTipoUsuario());*/
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*UsuarioMedio Eider = contexto.getBean("miUsuarioMedio", UsuarioMedio.class);
		
		System.out.println(Eider.getTipoUsuario());
		
		System.out.println(Eider.getTipoPrivilegios());
		
		System.out.println("Nombre USUARIO MEDIO: " + Eider.getNombreUsuario());
		
		System.out.println("Email: " + Eider.getEmail());*/
		
		/*UsuarioEstandar Amara = contexto.getBean("miUsuarioEstandar", UsuarioEstandar.class);
		
		System.out.println(Amara.getTipoUsuario());
		
		System.out.println(Amara.getTipoPrivilegios());
		
		System.out.println("Nombre de la empresa: " + Amara.getNombreEmpresa());
		
		System.out.println("Email: " + Amara.getEmail());
		
		System.out.println("Nombre USUARIO ESTÁNDAR: " + Amara.getNombreUsuario());*/
		
		
		UsuarioPremium Juan = contexto.getBean("miUsuarioPremium", UsuarioPremium.class);
		
		System.out.println(Juan.getTipoUsuario());
		
		System.out.println(Juan.getTipoPrivilegios());
		
		System.out.println("Nombre de la empresa: " + Juan.getNombreEmpresa());
		
		System.out.println("Nombre USUARIO PREMIUM: " + Juan.getNombreUsuario());
		
		System.out.println("Email: " + Juan.getEmail());
		
		
		contexto.close();

	}

}
