package sprintempresa;

import java.util.ArrayList;
import java.util.Scanner;

import ActividadesEmpresa.Capacitacion;

public class Contenedor {

  /* 
  Cree la clase Contenedor, la cual deberá tener declarado como atributos dos listas: 
  una lista de instancias de la interface Asesoria, y una lista de objetos de la 
  clase Capacitacion. En la primera lista pueden ser almacenados distintos tipos de usuarios. 
  Los métodos que debe contener esta clase son:


- Listar usuarios: permite desplegar la lista completa de usuarios, independiente del tipo. 
  En este método solo se deben desplegar los datos de la clase usuario.
- Listar usuarios por tipo: recibe un tipo de usuario (cliente, administrador o profesional), 
  y retorna los datos respectivos según el tipo de usuario.
- Listar capacitaciones: este método despliega las capacitaciones registradas en la lista respectiva, 
junto con los datos del cliente al que está asociada dicha capacitación.
    */

      //scanner
      Scanner teclado = new Scanner(System.in)  ;
      // lista asesorias
      ArrayList<Asesoria> listaAsesorias = new ArrayList<Asesoria>();
      // lista de objetos de la clase capacitacion
      ArrayList<Capacitacion> listaCapacitacion = new ArrayList<Capacitacion>();

      
      
      //- Almacenar cliente: permite agregar un nuevo cliente a la lista de instancias de la interface Asesoria.
      public void almacenarCliente(){
        Cliente cliente = new Cliente();
        cliente.setRut(cliente.validarRut("Ingresa tu rut (ej: 99.999.999) --> ", teclado));
        cliente.setNombres(cliente.validarNombreApellido("Ingresar nombre, mínimo 5 caracteres, máximo 30 --> ", teclado));
        cliente.setApellidos(cliente.validarNombreApellido("Ingresar apellido y apellido, mínimo 5 caracteres, máximo 30 --> ", teclado));
        cliente.setFechaNacimiento(cliente.validarFecha("Ingresa fecha de nacimiento, formato: DD/MM/AAAA --> ", teclado));
        cliente.setTelefono(cliente.validarTelefono("Ingresa tu numero de telefono (8 digitos) --> ", teclado));
        cliente.setAfp(cliente.validarAfp("AFP: mínimo 4 caracteres, máximo 30 --> ", teclado));
        cliente.setSistemaSalud(cliente.validarSalud("Sistema de salud: 1 (Fonasa) o 2 (Isapre) --> ", teclado));
        cliente.setDireccion(cliente.validarDireccion("Dirección: minimo 2 caracteres, máximo 70 caractere --> ", teclado));
        cliente.setComuna(cliente.validarComuna("Comuna: máximo 50 caracteres --> ", teclado));
        cliente.setEdad(cliente.validarEdad("Edad: obligatorio, número mayor o igual a cero, y menor a 150 --> ", teclado));

        listaAsesorias.add(cliente);
        System.out.println(cliente.toString());
        
      }


      //- Almacenar profesional: permite agregar un nuevo profesional a la lista de instancias de la interface Asesoria.
      public void almacenarProfesional(Profesional profesional){

        listaAsesorias.add(profesional);
      }
      //- Almacenar administrativo: permite agregar un nuevo administrativo a la lista de instancias de la interface Asesoria.
      public void almacenarAdministrativo(){
        listaAsesorias.add(new Administrativo(null, null, null, null, null));
      }
      //- Almacenar capacitación: permite agregar una nueva capacitación a la lista de instancias de la clase Capacitación.
      public void almacenarCapacitacion(){
        listaCapacitacion.add(new Capacitacion(null, null, null, null, null, null));
      }

      //- Eliminar usuario: permite eliminar un usuario desde la lista de interfaces de Asesoría acuerdo con el RUN del usuario.
    
}

