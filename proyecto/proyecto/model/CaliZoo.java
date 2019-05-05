package model;

public class CaliZoo{

//Atributos
private int zone;

//Relaciones

private BoardedDragonZone area1;
private KangarooZone area2;

public CaliZoo (int zone, BoardedDragonZone area1, KangarooZone area2){

this.zone = zone;
this.area1 = area1;
this.area2 = area2;

}

public int getZone(){
return zone;
}

public void setZone(int zone){

this.zone = zone;
}

public BoardedDragonZone getArea1(){
return area1;
}
public void setArea1(BoardedDragonZone area1 ){
this.area1 = area1;
}
public KangarooZone getArea2(){
 return area2;
}

public void setArea2(KangarooZone area2){
this.area2 = area2;
}

public String showKangarooInformation(){
String msj = "";

 msj += area2.showKangarooInformation2();

return msj;

}

public String showCalculatedArea(){
String msj ="";

msj += " El area es "  +  area2.calculatedArea() + "MTS";


return msj;

}

public String showWaterLiterKangaroo(){
 String msj = "";

 msj += "La cantidad de agua del kangaroo es:" + area2.calculatedKangarooWaterLiter();

 return msj;


}

public String showVocalsOfTheKangaroo2(){
String msj = "";

msj += "El kangaroo y el dragon con mas vocales son:" + area2.showVocalsOfTheKangaroo1() + area1.vocalsOfTheBoardedDragon1();

return msj;

}

public String showDeletedKangaroo(int numbEnv , int Kangar){
String msj = "";

msj += "Ha sido eliminado " + area2.deletedKangaroo1(numbEnv, Kangar);

return msj;

}

public String showAddKangaroo(int numEv, Kangaroo add){
String msj = "";

msj += "Se agrego en la zona " + area2.kangarooForEnv(add, numEv);

return msj;

}

public String showKangarooVacunne(int actualDay , int actualMonth , int actualYear){
String msj = "";

msj = "Su fecha de vacunacion es:" + area2.vacunne3(actualDay , actualMonth , actualYear);

return msj;

}

public String showBoardedDragonInformation1(){
String msj = "";

msj += area1.showBoardedDragonZone();

return msj;

}

public String showKangarooWaterLiter(){
String msj ="";

msj += "El consumo de agua es:" + area2.calculatedKangarooWaterLiter();

return msj;

}

public String showBoardedDragonWaterLiter(){
String msj = "";

msj += "El consumo de agua es:"+ area1.calculatedBoardedDragonWaterLiter();

return msj;
}
public String showBoardedDragonFood(){
String msj = "";

msj += "El consumo de comida es:"+ area1.showBoardedDragonnFood();

return msj;

}




}
