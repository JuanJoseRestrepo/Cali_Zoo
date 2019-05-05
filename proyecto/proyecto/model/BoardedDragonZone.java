package model;

public class BoardedDragonZone {

//Atributos
private double heatSource;
private double humidity;
private double temperature;
private double filtration;
private double waterLiter;


//Relaciones

private BoardedDragon boarD1;
private BoardedDragon boarD2;

//Metodos

public BoardedDragonZone (double heatSource, double humidity, double temperature, double filtration, double waterLiter, BoardedDragon boarD1,BoardedDragon boarD2){

this.heatSource= heatSource;
this.humidity = humidity;
this.temperature = temperature;
this.filtration = filtration;
this.waterLiter = waterLiter;
this.boarD1 = boarD1;
this.boarD2 = boarD2;
}

public double getHeatSource(){
return heatSource;
}

public void setHeatSource(double heatSource){
this.heatSource = heatSource;
}

public double getHumidity(){
return humidity;
}

public void setHumidity(double humidity){
this.humidity = humidity;
}

public double getTemperature(){
return temperature;
}

public void setTemperature(double temperature){
this.temperature = temperature;
}

public double getFiltration(){
return filtration;
}

public void setFiltration(double filtration){
this.filtration = filtration ;
}

public double getWaterLiter(){
return waterLiter;
}

public void setWaterLiter(double waterLiter){
this.waterLiter = waterLiter;
}

public BoardedDragon getBoarD1(){
return  boarD1;
}

public void setBoarD1(BoardedDragon boarD1){
this.boarD1 = boarD1;
}

public BoardedDragon getBoarD2(){
return boarD2;
}

public void setBoarD2(BoardedDragon boarD2){
this.boarD2 = boarD2;
}

public double calculatedBoardedDragonWaterLiter(){
double waterLiter = 0.0;

waterLiter = boarD1.calculatedBoardedDragonWaterLiter2();
waterLiter = boarD2.calculatedBoardedDragonWaterLiter2();

 return waterLiter;

}
public String vocalsOfTheBoardedDragon1(){
String msj ="";

msj += boarD1.vocalsOfTheBoardedDragon();
msj += boarD2.vocalsOfTheBoardedDragon();


return msj;
}
public String showBoardedDragonZone(){
String msj = "";

msj += boarD1.informationBoardedDragon();
msj += boarD2.informationBoardedDragon();

return msj;

}
public String showBoardedDragonnFood(){
  String msj ="";

  msj += boarD1.foodDragon();
  msj += boarD2.foodDragon();

return msj;
}



}
