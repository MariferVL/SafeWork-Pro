package sprintempresa;

import java.util.ArrayList;

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
      // lista asesorias
      ArrayList<Asesoria> listaAsesorias = new ArrayList<Asesoria>();
      // lista de objetos de la clase capacitacion
      ArrayList<Capacitacion> listaCapacitacion = new ArrayList<Capacitacion>();


      //- Almacenar cliente: permite agregar un nuevo cliente a la lista de instancias de la interface Asesoria.
      public void almacenarCliente(Cliente cliente){
        listaAsesorias.add(cliente);
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

