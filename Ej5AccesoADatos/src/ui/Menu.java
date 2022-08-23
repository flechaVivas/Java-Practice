package ui;


import java.util.LinkedList;
import java.util.Scanner;

import entities.*;
import logic.Login;

public class Menu {
	Scanner s=null;
	Login ctrlLogin = new Login();

	public void start() {
		s = new Scanner(System.in);
		Persona p=login();
		System.out.println("Bienvenido "+p.getNombre()+" "+p.getApellido());
		System.out.println();
		
		String command;
		do {
			command=getCommand();
			executeCommand(command);
			System.out.println();
			
		}while(!command.equalsIgnoreCase("exit"));
		
		s.close();
	}

	private void executeCommand(String command) {
		switch (command) {
		case "list":
			System.out.println(ctrlLogin.getAll());
			break;
		case "find":
			System.out.println(find());
			break;
		case "search":
			System.out.println(findByApellido());
			break;
		case "new":
			nuevo();
			break;
		case "edit":
			modifica();
			break;
		case "delete":
			elimina();
			break;
		default:
			break;
		}
	}

	private String getCommand() {
		System.out.println("Ingrese el comando según la opción que desee realizar");
		System.out.println("list\t\tlistar todos");
		System.out.println("find\t\tbuscar por tipo y nro de documento"); //solo debe devolver 1
		System.out.println("search\t\tlistar por apellido"); //puede devolver varios
		System.out.println("new\t\tcrea una nueva persona y asigna un rol existente");
		System.out.println("edit\t\tbusca por tipo y nro de documento y actualiza todos los datos");
		System.out.println("delete\t\tborra por tipo y nro de documento");
		System.out.println();
		System.out.print("comando: ");
		return s.nextLine();
	}
	
	public Persona login() {
		Persona p=new Persona();
		
		System.out.print("Email: ");
		p.setEmail(s.nextLine());

		System.out.print("password: ");
		p.setPassword(s.nextLine());
		
		p=ctrlLogin.validate(p);
		
		return p;
		
	}
	
	private Persona find() {
		System.out.println();
		Persona p=new Persona();
		Documento d=new Documento();
		p.setDocumento(d);
		System.out.print("Tipo doc: ");
		d.setTipo(s.nextLine());

		System.out.print("Nro doc: ");
		d.setNro(s.nextLine());
		
		return ctrlLogin.getByDocumento(p);
	}
	
	private LinkedList<Persona> findByApellido() {
		System.out.println();
		Persona p = new Persona();
		System.out.println("Apellido: ");
		p.setApellido(s.nextLine());
		
		return ctrlLogin.getByApellido(p);
	}
	
	private void nuevo() {
		System.out.println();
		Persona p = new Persona();
		Documento d = new Documento();
		
		System.out.println("Nombre: ");
		p.setNombre(s.nextLine());
		System.out.println("Apellido: ");
		p.setApellido(s.nextLine());
		
		System.out.println("Tipo Doc: ");
		d.setTipo(s.nextLine());
		System.out.println("Nro Doc: ");
		d.setNro(s.nextLine());
		
		p.setDocumento(d);

		System.out.println("Telefono: ");
		p.setTel(s.nextLine());
		
		System.out.println("Email: ");
		p.setEmail(s.nextLine());
		
		System.out.println("Password: ");
		p.setPassword(s.nextLine());
		
//		System.out.println("Asigna rol? S/N");
//		String rta = s.nextLine();
//		if (rta == "S") {		
//			Boolean otro = true;
//			while (otro) {
//				ctrlLogin.getAllRoles();
//				System.out.println("Rol? ");
//			}
//		}
		
		ctrlLogin.add(p);
	}
	
	private void modifica() {
		Persona p=new Persona();
		Documento d=new Documento();
		
		System.out.print("Tipo doc: ");
		d.setTipo(s.nextLine());

		System.out.print("Nro doc: ");
		d.setNro(s.nextLine());
		
		p.setDocumento(d);
		
		System.out.println("Nombre: ");
		p.setNombre(s.nextLine());
		System.out.println("Apellido: ");
		p.setApellido(s.nextLine());
		
		System.out.println("Telefono: ");
		p.setTel(s.nextLine());
		
		System.out.println("Email: ");
		p.setEmail(s.nextLine());
		
		System.out.println("Password: ");
		p.setPassword(s.nextLine());
		
		ctrlLogin.update(p);
	}
	
	private void elimina() {
		Persona p=new Persona();
		Documento d=new Documento();
		
		System.out.print("Tipo doc: ");
		d.setTipo(s.nextLine());

		System.out.print("Nro doc: ");
		d.setNro(s.nextLine());
		
		p.setDocumento(d);
		
		ctrlLogin.delete(p);
		
	}
	

}
