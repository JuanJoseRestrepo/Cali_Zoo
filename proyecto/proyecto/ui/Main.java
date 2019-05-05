package ui;

import model.*;
import java.util.Scanner;

public class Main{
//Relacion
 private CaliZoo zoo3;
 private Scanner reader;

 public Main() {

   init();
  reader = new Scanner(System.in);

}

public static void main(String[] args) {

Main m = new Main();
m.showMenu();

}

public void showMenu(){



  int userInput = 0;

  System.out.println("***************************************************************************************************************************************************************************************************************");
  System.out.println("***************************************************************************************************************************************************************************************************************");
  System.out.println("**********************************************BIENVENIDOS A LA EXHIBICIÓN**************************************************************************************************************************************");
  System.out.println("****************************************WELCOME TO THE AUSTRALIAN DEMOSTRATION*********************************************************************************************************************************");
  System.out.println("***************************************************************************************************************************************************************************************************************");
  System.out.println("********************************BIENVENIDO AL ZOOLOGICO DE CALI, POR FAVOR ELIGIR UNA DE LAS OPCIONES**********************************************************************************************************");
  System.out.println("***************************************************************************************************************************************************************************************************************");
  System.out.println("**********************************************1. Mostrar info kangaroo*****************************************************************************************************************************************");
  System.out.println("**********************************************2. Borrar los kangaroos******************************************************************************************************************************************");
  System.out.println("*********************************************3. Crear nuevos kangaroos*****************************************************************************************************************************************");
  System.out.println("****************************************4. Mostrar los animales con mas vocales********************************************************************************************************************************");
  System.out.println("******************************************5. calcular la fecha de la vacuna************************************************************************************************************************************");
  System.out.println("*********************************************6. cambiar a los canguros*****************************************************************************************************************************************");
  System.out.println("***************************************7.mostrar la información de los dragones barbados***********************************************************************************************************************");
  System.out.println("***************************************8. Mostrar el area calculada de los ambientes***************************************************************************************************************************");
  System.out.println("****************************************9. Mostrar el consumo de agua de los canguros**************************************************************************************************************************");
  System.out.println("***********************************10. Mostrar el consumo de agua de los dragones barbados*********************************************************************************************************************");
  System.out.println("***********************************11. Mostrar la cantidad de comida de los dragones barbados******************************************************************************************************************");
  System.out.println("**************************************************12.Salir del programa****************************************************************************************************************************************");
  System.out.println("***************************************************************************************************************************************************************************************************************");
  System.out.println("***************************************************************************************************************************************************************************************************************");

 while(userInput !=12){

     userInput = reader.nextInt();
     reader.nextLine();

    if (userInput == 1){
       System.out.println("1. Ha elegido ver los kangaroos");
        System.out.println(zoo3.showKangarooInformation());


    } else if ( userInput == 2){
     System.out.println(zoo3.showKangarooInformation());
      System.out.println("2.Digite  el ambiente en el cual desea borrar el canguro \n 1. Ambiente 1 \n 2.Ambiente 2 \n 3. ambiente 3");
      int numbEnv = reader.nextInt();
      reader.nextLine();

      System.out.println("2.Digite el canguro que desea borra \n 1.Kangaroo 1 \n 2.Kangaroo 2 \n 3. Kangaroo 3");
      int Kangar = reader.nextInt();
      reader.nextLine();

      System.out.println(zoo3.showDeletedKangaroo(numbEnv , Kangar));

    }else if (userInput == 3){
      System.out.println("3. ¿Cual desea crear?");

      System.out.println("Por favor ingrese el nombre");
      String name = reader.nextLine();

      System.out.println("Por favor ingrese el peso");
      double weight = reader.nextDouble();
      reader.nextLine();

      System.out.println("por favor ingresar la altura");
      double height = reader.nextDouble();
      reader.nextLine();

      System.out.println("por favor ingrese el imc");
      double imc = reader.nextDouble();
      reader.nextLine();

      System.out.println("Digite cual es el sexo \n 1. MALE \n 2. FEMALE ");
      int seleccion = reader.nextInt();
      reader.nextLine();

      String gender = seleccion ==1 ? Kangaroo.MALE : Kangaroo.FEMALE;

      System.out.println("Digite la cantidad de comida");
      double food = reader.nextDouble();
      reader.nextLine();

      System.out.println("por favor digite tipo de sangre");
      String typeOfBlood = reader.nextLine();

      System.out.println("por favor digite su dia ");
      int dia = reader.nextInt();
      reader.nextLine();

      System.out.println("Digite su Mes");
      int month = reader.nextInt();
      reader.nextLine();

      System.out.println("Digite su año");
      int year = reader.nextInt();
      reader.nextLine();

      Kangaroo add = new Kangaroo(name, weight,height , imc,  gender, food, typeOfBlood, new Dated (dia, month, year ));

      System.out.println("Digite en que ambiente lo quiere agregar \n 1. Ambiente 1 \n 2. Ambiente 2 \n 3. Ambiente 3" );
      int numEnv = reader.nextInt();
      reader.nextLine();


      System.out.println(zoo3.showAddKangaroo( numEnv, add));
    } else if( userInput == 4){

      System.out.println(zoo3.showVocalsOfTheKangaroo2());

    } else if( userInput == 5){
      System.out.println("ingrese los siguientes digitos para calcular la vacuna");

      System.out.println("Indique el dia actual");
      int actualDay = reader.nextInt();
      reader.nextLine();

      System.out.println("Indique el mes actual");
      int actualMonth = reader.nextInt();
      reader.nextLine();

      System.out.println("Por favor indique el year actual");
      int actualYear = reader.nextInt();
      reader.nextLine();

      System.out.println(zoo3.showKangarooVacunne(actualDay , actualMonth , actualYear));

    }else if ( userInput == 6){
      System.out.println(zoo3.showKangarooInformation());
      System.out.println("Por favor digite el ambiente que desee \n 1. Ambiente 1 \n 2. Ambiente 2 \n 3. Ambiente 3");
      int  numbEnv = reader.nextInt();
      reader.nextLine();

      System.out.println("Por favor escoja el Kangaroo que desea cambiar, posteriormente se eliminara del ambiente\n 1. Kangaro 1 \n 2. Kangaroo 2 \n 3. Kangaroo 3 ");
      int Kangar = reader.nextInt();
      reader.nextLine();

      System.out.println(zoo3.showDeletedKangaroo(numbEnv , Kangar));

      System.out.println("Por favor digite el nombre del cangaro que selecciono");
      String nombre = reader.nextLine();

      System.out.println(" Por favor digite el peso del canguro que selecciono");
      double weight = reader.nextDouble();
      reader.nextLine();

      System.out.println(" Por favor digite la altura del canguro que selecciono");
      double height = reader.nextDouble();
      reader.nextLine();

      System.out.println("Por favor digite el imc ");
      double imc = reader.nextDouble();
      reader.nextLine();

      System.out.println(" Por favor digite el genero del kangaroo que selecciono: \n 1. MASCULINO \n 2.FEMENINO");
      int seleccion1 = reader.nextInt();
      reader.nextLine();

      String gender = seleccion1 == 1 ? Kangaroo.MALE : Kangaroo.FEMALE;

      System.out.println("Por favor digite la cantidad de comida del canguro que selecciono ");
      double food = reader.nextDouble();
      reader.nextLine();

      System.out.println("Por favor digite el tipo de sangre del canguro");
      String typeOfBlood = reader.nextLine();

      System.out.println("por favor digite su dia del canguro que selecciono ");
      int dia = reader.nextInt();
      reader.nextLine();

      System.out.println("Digite el Mes del canguro que selecciono");
      int month = reader.nextInt();
      reader.nextLine();

      System.out.println("Digite el año año del canguro que selecciono");
      int year = reader.nextInt();
      reader.nextLine();

      Kangaroo add = new Kangaroo(nombre, weight,height , imc,  gender, food, typeOfBlood, new Dated (dia, month, year ));
      System.out.println("Por favor digite nuevamente en que ambiente desea, para poder poner el nuevo kangaroo que selecciono \n 1. Ambiente 1 \n 2. Ambiente 2 \n 3. Ambiente 3");
      int  numbEnv1 = reader.nextInt();
      reader.nextLine();

  System.out.println(zoo3.showAddKangaroo( numbEnv1, add));

    } else if ( userInput == 7){
      System.out.println(zoo3.showBoardedDragonInformation1());

    } else if( userInput == 8){
      System.out.println(zoo3.showCalculatedArea());
    } else if( userInput == 9){
      System.out.println(zoo3.showWaterLiterKangaroo());
    } else if( userInput == 10){
      System.out.println(zoo3.showBoardedDragonWaterLiter());
    } else if( userInput == 11){
      System.out.println(zoo3.showBoardedDragonFood());
    }
     else{
      userInput = 12;
      System.out.println("Ha salido con exito, vuelva pronto");
}
}


}
public void init(){

  Kangaroo Nick =  new Kangaroo( "Nick", 80.0 , 1.50 ,1.0, "Male" ,12.0, "AB", new Dated( 12 , 3 , 1995));
  Kangaroo Rochelle =  new Kangaroo( "Rochelle", 28.0 , 1.4 ,2.0, "Female" , 22.4 , "B", new Dated( 15 , 5 , 1980));
  Kangaroo Ellis =  new Kangaroo( "Ellis", 38.0 , 2.0 ,1.0, "Male" ,12.0 , "B", new Dated( 30 , 9 , 1996));
  Kangaroo Bill =  new Kangaroo( "Bill", 41.0 , 1.5 ,1.2, "Male" ,13.0 , "O", new Dated( 28 , 2 , 1986));
  Kangaroo Francis =  new Kangaroo( "Francis", 26.0 , 1.5 ,2.0, "Male" ,20.8 , "AB", new Dated( 30 , 9 , 1990));
  Kangaroo Louis =  new Kangaroo( "Louis", 49.0 , 2.0 ,3.0, "Male" ,12.0, "A", new Dated( 3 , 05 , 1989));
  Kangaroo Jose =  new Kangaroo( "Jose", 36.0 , 2.5 ,2.3, "Male" , 12.0 , "B", new Dated( 12 , 03 , 1995));
  Kangaroo Yurani =  new Kangaroo( "Yurani", 24.0 , 1.4 ,13.3, "Female" , 19.2 , "O", new Dated( 30 , 9 , 1990));
  Kangaroo Juana =  new Kangaroo( "Juana", 41.0 , 1.2 ,10.0, "Female" ,12.0 , "A", new Dated( 2 , 03 , 2019));

  BoardedDragon Janna = new BoardedDragon ( "Janna", 4.0 , 40.0, "Female" , 3.2,19.0);
  BoardedDragon Draven = new BoardedDragon ( "Draven", 5.0, 60.0 , "Male" , 4.0,19.0);


  KangarooEnvirioment ke = new KangarooEnvirioment (750, Nick , Rochelle , Ellis );
  KangarooEnvirioment ke2 = new KangarooEnvirioment (750,Bill , Francis , Louis );
  KangarooEnvirioment ke3 = new KangarooEnvirioment (750, Jose , Yurani , Juana );

  KangarooZone kz = new KangarooZone(46.0, 12.5 ,50.0 , 95.0 , 13.5, ke , ke2 , ke3);
  BoardedDragonZone bd = new BoardedDragonZone(47.0 , 78.0 , 49.0 ,78.0 , 89.0, Janna, Draven );


  zoo3 = new CaliZoo(2, bd , kz);
}









}
