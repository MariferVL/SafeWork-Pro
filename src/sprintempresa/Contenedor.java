package sprintempresa;

import java.util.ArrayList;
import java.util.Scanner;

import ActividadesEmpresa.Capacitacion;

public class Contenedor {

  /* 
  Cree la clase Contenedor, la cual deberá tener declarado como atributos dos listas: 
  una lista de instancias de la interface Asesoria, y una lista de objetos de la 
  clase Capacitacion. En la primera lista pueden ser almacenados distintos tipos de usuarios. */

      //scanner
      Scanner teclado = new Scanner(System.in)  ;
      // lista asesorias
      ArrayList<Asesoria> listaAsesorias = new ArrayList<Asesoria>();
      // lista de objetos de la clase capacitacion
      ArrayList<Capacitacion> listaCapacitacion = new ArrayList<Capacitacion>();

      
      
      //- Almacenar cliente: permite agregar un nuevo cliente a la lista de instancias de la interface Asesoria.
      public void almacenarCliente(){
        Cliente cliente = new Cliente();
        cliente.setRut(cliente.validarRut("Ingresar (ej: 99.999.999) --> ", teclado));
        cliente.setNombres(cliente.validarNombreApellido("Ingresar nombre, mínimo 5 caracteres, máximo 30 --> ", teclado));
        cliente.setApellidos(cliente.validarNombreApellido("Ingresar apellido, mínimo 5 caracteres, máximo 30 --> ", teclado));
        cliente.setFechaNacimiento(cliente.validarFecha("Ingresa fecha de nacimiento, formato: DD/MM/AAAA --> ", teclado));
        cliente.setTelefono(cliente.validarTelefono("Ingresa tu numero de telefono (8 digitos) --> ", teclado));
        cliente.setAfp(cliente.validarAfp("AFP: mínimo 4 caracteres, máximo 30 --> ", teclado));
        cliente.setSistemaSalud(cliente.validarSalud("Sistema de salud: 1 (Fonasa) o 2 (Isapre) --> ", teclado));
        cliente.setDireccion(cliente.validarDireccion("Dirección: minimo 2 caracteres, máximo 70 caractere --> ", teclado));
        cliente.setComuna(cliente.validarComuna("Comuna: máximo 50 caracteres --> ", teclado));
        cliente.setEdad(cliente.validarEdad("Edad: obligatorio, número mayor o igual a cero, y menor a 150 --> ", teclado));

        listaAsesorias.add(cliente);
        
      }
      
      //- Almacenar profesional: permite agregar un nuevo profesional a la lista de instancias de la interface Asesoria.
      public void almacenarProfesional(){
        Profesional profesional = new Profesional();
        profesional.setNombre(profesional.validarNombre("Ingresar nombre, mínimo 10 caracteres, máximo 50 --> ", teclado));
        profesional.setFechaNacimiento(profesional.validarFecha("Ingresa fecha de nacimiento, formato: DD/MM/AAAA --> ", teclado));
        profesional.setRut(profesional.validarRut("Ingresar rut (ej: 99.999.999) --> ", teclado));
        profesional.setTitulo(profesional.validarNombreTitulo("Ingresar título, mínimo 10 caracteres, máximo 50 --> ", teclado));
        profesional.setFechaIngreso(profesional.validarFecha("Ingresa fecha de ingreso, formato: DD/MM/AAAA --> ", teclado));

        listaAsesorias.add(profesional);
       
      }

      //- Almacenar administrativo: permite agregar un nuevo administrativo a la lista de instancias de la interface Asesoria.
      public void almacenarAdministrativo(){
        Administrativo administrativo = new Administrativo();
        administrativo.setNombre(administrativo.validarNombre("Ingresar nombre, mínimo 10 caracteres, máximo 50 --> ", teclado));
        administrativo.setFechaNacimiento(administrativo.validarFecha("Ingresa fecha de nacimiento, formato: DD/MM/AAAA --> ", teclado));
        administrativo.setRut(administrativo.validarRut("Ingresar rut (ej: 99.999.999) --> ", teclado));
        administrativo.setArea(administrativo.validarArea("Ingresar área, mínimo 5 caracteres, máximo 20 --> ", teclado));
        administrativo.setExperiencia(administrativo.validarExperiencia("Ingrese años de experiencia --> ", teclado));

        listaAsesorias.add(administrativo);
        
      }

      //- Almacenar capacitación: permite agregar una nueva capacitación a la lista de instancias de la clase Capacitación.
      public void almacenarCapacitacion(){
        Capacitacion cap = new Capacitacion();
        cap.setId(cap.validarId("Ingresar ID --> ", teclado));
        cap.setRutCliente(cap.validarRun("Ingresar rut (ej: 99.999.999) --> ", teclado));
        cap.setDia(cap.validarDiaSemana("Ingresar día --> ", teclado));
        cap.setHora(cap.validarHora("Ingresar hora --> ", teclado));
        cap.setLugar(cap.validarLugar_NombreRev("Ingresar lugar --> ", teclado));
        cap.setCantidadAsistentes(cap.validarAsistentes("Ingresar cantidad asistentes --> ", teclado));

        listaCapacitacion.add(cap);
      }

      //- Eliminar usuario: permite eliminar un usuario desde la lista de interfaces de Asesoría acuerdo con el RUN del usuario.

      /* 
      - Listar usuarios: permite desplegar la lista completa de usuarios, independiente del tipo. 
      En este método solo se deben desplegar los datos de la clase usuario. */

    public void listarUsuarios() {
      System.out.println("Lista de usuarios:\n");
      for (Asesoria asesoria : listaAsesorias) {
        if (asesoria instanceof Cliente) {
            Cliente cliente = (Cliente) asesoria;
            System.out.println("RUT: " + cliente.getRut());
            System.out.println("Nombre: " + cliente.getNombres() + " " + cliente.getApellidos());
            System.out.println("Fecha de nacimiento: " + cliente.getFechaNacimiento());
            System.out.println("Teléfono: " + cliente.getTelefono());
            System.out.println("AFP: " + cliente.getAfp());
            System.out.println("Sistema de salud: " + cliente.getSistemaSalud());
            System.out.println("Dirección: " + cliente.getDireccion());
            System.out.println("Comuna: " + cliente.getComuna());
            System.out.println("Edad: " + cliente.getEdad() + "\n");
        } else if (asesoria instanceof Profesional) {
            Profesional profesional = (Profesional) asesoria;
            System.out.println("RUT: " + profesional.getRut());
            System.out.println("Nombre: " + profesional.getNombre());
            System.out.println("Fecha de nacimiento: " + profesional.getFechaNacimiento());
            System.out.println("Título: " + profesional.getTitulo());
            System.out.println("Fecha de ingreso: " + profesional.getFechaIngreso() + "\n");
        } else if (asesoria instanceof Administrativo) {
            Administrativo administrativo = (Administrativo) asesoria;
            System.out.println("RUT: " + administrativo.getRut());
            System.out.println("Nombre: " + administrativo.getNombre());
            System.out.println("Fecha de nacimiento: " + administrativo.getFechaNacimiento());
            System.out.println("Área: " + administrativo.getArea());
            System.out.println("Años de experiencia: " + administrativo.getExperiencia() + "\n");
        }
    }
}
  /* 
      - Listar usuarios por tipo: recibe un tipo de usuario (cliente, administrador o profesional), 
      y retorna los datos respectivos según el tipo de usuario.
      - Listar capacitaciones: este método despliega las capacitaciones registradas en la lista respectiva, 
      junto con los datos del cliente al que está asociada dicha capacitación.
      */
      public void listarUsuariosPorTipo(String tipo) {
        for (Asesoria asesoria : listaAsesorias) {
          if (tipo.equalsIgnoreCase("cliente") && asesoria instanceof Cliente) {
            System.out.println("Rut: " + ((Cliente) asesoria).getRut());
            System.out.println("Nombres: " + ((Cliente) asesoria).getNombres());
            System.out.println("Apellidos: " + ((Cliente) asesoria).getApellidos());
            System.out.println("Fecha de nacimiento: " + ((Cliente) asesoria).getFechaNacimiento());
            System.out.println("Teléfono: " + ((Cliente) asesoria).getTelefono());
            System.out.println("AFP: " + ((Cliente) asesoria).getAfp());
            System.out.println("Sistema de salud: " + ((Cliente) asesoria).getSistemaSalud());
            System.out.println("Dirección: " + ((Cliente) asesoria).getDireccion());
            System.out.println("Comuna: " + ((Cliente) asesoria).getComuna());
            System.out.println("Edad: " + ((Cliente) asesoria).getEdad());
            System.out.println();
          } else if (tipo.equalsIgnoreCase("administrativo") && asesoria instanceof Administrativo) {
            System.out.println("Nombre: " + ((Administrativo) asesoria).getNombre());
            System.out.println("Fecha de nacimiento: " + ((Administrativo) asesoria).getFechaNacimiento());
            System.out.println("Rut: " + ((Administrativo) asesoria).getRut());
            System.out.println("Área: " + ((Administrativo) asesoria).getArea());
            System.out.println("Años de experiencia: " + ((Administrativo) asesoria).getExperiencia());
            System.out.println();
          } else if (tipo.equalsIgnoreCase("profesional") && asesoria instanceof Profesional) {
            System.out.println("Nombre: " + ((Profesional) asesoria).getNombre());
            System.out.println("Fecha de nacimiento: " + ((Profesional) asesoria).getFechaNacimiento());
            System.out.println("Rut: " + ((Profesional) asesoria).getRut());
            System.out.println("Título: " + ((Profesional) asesoria).getTitulo());
            System.out.println("Fecha de ingreso: " + ((Profesional) asesoria).getFechaIngreso());
            System.out.println();
          }
        }
      }
}

