/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoi;

import java.util.Scanner;

/**
##########################################################
#             Desarrolllador: Daniela Abril              #
#             Fecha: 10/07/2021                          #
#             Versión1                                   #
#             Reto I-Ciclo2                              #
##########################################################
 */
public class Main {

    public static void main(String[] args) {
       PersonClass Person1 = new PersonClass( "Luisa" , "C.C" , 102630781 , 'F' , 1995 , 58.4 , 1.64 , "Cundinamarca" , "Bogotá" , "Calle 57 Z # 75 D 07" , "3184866656" , "Comunicadora Social" , "Soltera" , true , false , false , "Chapinero" , "Marta" , "Raul");
       PersonClass Person2 = new PersonClass( "Cristian" , "C.C" , 103584349 , 'M' , 1984 , 72.7 , 1.87 , "Boyacá" , "Tunja" , "Carrera 5 # 47 06" , "3157232657" , "Economista" , "Casado" , false , true , true , "Ciudad Jardin" , "Sandra" , "Jose");
      
        System.out.println("Ingrese el número del contacto a consultar: ");
        Scanner Number = new Scanner(System.in);
        int contact = Number.nextInt();
        
        if (contact == 1){
           // Imprimir información Primer Contacto 
        System.out.println("INFORMACIÓN PRIMER CONTACTO \n     >>Nombre: " + Person1.getName() + "\n     >>Tipo de documento: " + Person1.getDocumentType() + "\n     >>Número de documento: " + Person1.getDocumentNumber() + "\n     >>Género: " + Person1.information1());
        System.out.println("     >>Edad: " + Person1.Age() + " años \n     >>Peso: " + Person1.getWeight() + " Kg \n     >>Altura: " + Person1.getHeight() + " metros \n     >>Nacido en (Departamento): " + Person1.getBirthDepartment() + "\n     >>Nacido en (Ciudad): " + Person1.getBirthCity()); 
        System.out.println("     >>Vive: Barrio " + Person1.getLive() + "\n     >>Dirección: " + Person1.getAddress() + "\n     >>Número de contacto: " + Person1.getMobile() + "\n     >>Estado civil: " + Person1.getCivilStatus());
        System.out.println("     >>¿Tiene hijos?: " + Person1.hijos1());
        Person1.hijos();
        System.out.println("     >>Profesión: " + Person1.getProfession() + "\n     >>Discapacidad: " + Person1.information2() + "\n     >>Estudia: " + Person1.information3() + "\nACCIONES PRIMER CONTACTO: ");
        Person1.Talk();
        Person1.Eat();
        Person1.Work();
        Person1.Walk();
        Person1.Breathe();
        Person1.Read();
        Person1.Sleep();
        Person1.Run();
        Person1.Call();
        Person1.MotherCall();
        Person1.FatherCall(); 
        }else{
           // Imprimir información Segundo Contacto 
        System.out.println("INFORMACIÓN SEGUNDO CONTACTO \n     >>Nombre: " + Person2.getName() + "\n     >>Tipo de documento: " + Person2.getDocumentType() + "\n     >>Número de documento: " + Person2.getDocumentNumber() + "\n     >>Género: " + Person2.information1());
        System.out.println("     >>Edad: " + Person2.Age() + " años \n     >>Peso: " + Person2.getWeight() + " Kg \n     >>Altura: " + Person2.getHeight() + " metros \n     >>Nacido en (Departamento): " + Person2.getBirthDepartment() + "\n     >>Nacido en (Ciudad): " + Person2.getBirthCity()); 
        System.out.println("     >>Vive: Barrio " + Person2.getLive() + "\n     >>Dirección: " + Person2.getAddress() + "\n     >>Número de contacto: " + Person2.getMobile() + "\n     >>Estado civil: " + Person2.getCivilStatus());
        System.out.println("     >>¿Tiene hijos?: " + Person2.hijos1());
        Person2.hijos();
        System.out.println("     >>Profesión: " + Person2.getProfession() + "\n     >>Discapacidad: " + Person2.information2() + "\n     >>Estudia: " + Person2.information3() + "\nACCIONES SEGUNDO CONTACTO: 2"
                + "");
        Person2.Talk();
        Person2.Eat();
        Person2.Work();
        Person2.Walk();
        Person2.Breathe();
        Person2.Read();
        Person2.Sleep();
        Person2.Run();
        Person2.Call();
        Person2.MotherCall();
        Person2.FatherCall(); 
        }
            
        }
    
    }
