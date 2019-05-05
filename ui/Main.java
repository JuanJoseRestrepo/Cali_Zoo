package ui;
import model.*;
import java.util.Scanner;

public class Main{

  private Harbor merch;
  private Scanner reader;

public Main(){

reader = new Scanner(System.in);


}

public static void main(String[] args) {
  Main m = new Main();
  m.init();
  m.showMenu();
}

public void init(){
System.out.println("Solo digite uno valor, por favor");
System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("Contenedor 1 \n");
System.out.println("Digite la longitud \n");
double leng1 = reader.nextDouble();
reader.nextLine();

System.out.println("Digite el ancho \n");
double wid1 = reader.nextDouble();
reader.nextLine();

System.out.println("Digite el largo \n");
double hig1 = reader.nextDouble();
reader.nextLine();

System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("Contenedor 2 \n");
System.out.println("Digite la longitud \n");
double leng2 = reader.nextDouble();
reader.nextLine();

System.out.println("Digite el ancho \n");
double wid2 = reader.nextDouble();
reader.nextLine();

System.out.println("Digite el largo \n");
double hig2 = reader.nextDouble();
reader.nextLine();

System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("Contenedor 3 \n");
System.out.println("Digite la longitud");
double leng3 = reader.nextDouble();
reader.nextLine();


System.out.println("Digite el ancho");
double wid3 = reader.nextDouble();
reader.nextLine();


System.out.println("Digite el largo");
double hig3 = reader.nextDouble();
reader.nextLine();



merch = new Harbor(new Container(leng1,wid1,hig1),new Container(leng2,wid2,hig2),new Container(leng3, wid3, hig3));


}
public void showMenu(){

System.out.println("El total de ganancias es:" + merch.calculateTotalMerca());
System.out.println("El promedio de las contenedoras es:" + merch.calculateAvarageContainers());



}







}
