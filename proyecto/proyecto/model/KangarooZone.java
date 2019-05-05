package model;

public class KangarooZone {

//Atributos
private double heatSource;
private double humidity;
private double temperature;
private double filtration;
private double waterLiter;

//relaciones

private KangarooEnvirioment env1;
private KangarooEnvirioment env2;
private KangarooEnvirioment env3;

//Metodos

public KangarooZone(double heatSource, double humidity, double temperature, double filtration, double waterLiter, KangarooEnvirioment env1, KangarooEnvirioment env2 , KangarooEnvirioment env3){

this.heatSource= heatSource;
this.humidity = humidity;
this.temperature = temperature;
this.filtration = filtration;
this.waterLiter = waterLiter;
this.env1 = env1;
this.env2 = env2;
this.env3 = env3;

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
public KangarooEnvirioment getEnv1(){
return env1;
}
public void setEnv1(KangarooEnvirioment env1){
this.env1 = env1;
}
public KangarooEnvirioment getEnv2(){
return env2;
}
public void setEnv2(KangarooEnvirioment env2){
this.env2 = env2;
}
public KangarooEnvirioment getEnv3(){
return env3;
}
public void setEnv3(KangarooEnvirioment env3){
this.env3 = env3;
}

public double calculatedKangarooWaterLiter(){
   double waterLiter= 0.0;

   waterLiter = 1.5 * (env1.calculatedIMCkangaroo() + env2.calculatedIMCkangaroo() + env3.calculatedIMCkangaroo());

  return waterLiter;

}

public double calculatedArea(){
 double size = 0.0;

  size += env1.calcularArea() + env2.calcularArea() + env3.calcularArea();

  return size;
}

public double calculatedFoodAmount(){
 double food = 0.0;

  food += env1.calculatedFoodKangaroo() + env2.calculatedFoodKangaroo() + env3.calculatedFoodKangaroo();

  return food;

}

public String showKangarooInformation2(){
String message = "";

message += env1.showKangarooInformation1();
message += env2.showKangarooInformation1();
message += env3.showKangarooInformation1();

return message;


}


public String showVocalsOfTheKangaroo1(){
 String message = "";

 message += env1.showVocalsOfTheKangaroo();
 message += env2.showVocalsOfTheKangaroo();
 message += env3.showVocalsOfTheKangaroo();


 return message;

}

public String kangarooForEnv(Kangaroo add , int numEv){
String msj = "";
if(numEv == 1){
  msj += "Se agrego en el ambiente 1\n";
  msj += env1.addKangaroo(add);

}else if(numEv == 2){
  msj += "Se agrego en el ambiente 2\n";
  msj += env2.addKangaroo(add);

} else if(numEv == 3){
  msj += "Se agrego en el ambiente 3\n";
  msj += env3.addKangaroo(add);
}
else {
msj = "Por favor digite una opcion valida";

}

return msj;
}

public String deletedKangaroo1(int numbEnv, int Kangar){
 String msj ="";

  if(numbEnv == 1){
   msj += env1.deletedKangaroo(Kangar);
 } else if(numbEnv == 2){
   msj += env2.deletedKangaroo(Kangar);
 } else if(numbEnv == 3){
   msj += env3.deletedKangaroo(Kangar);
 }
 else{
   msj = "Por favor digite una opcion valida";
 }
return msj;
}

public String vacunne3(int actualDay , int actualMonth , int actualYear ){
String msj = "";

msj += env1.vacunne2(actualDay , actualMonth , actualYear);
msj += env2.vacunne2(actualDay , actualMonth , actualYear);
msj += env3.vacunne2(actualDay , actualMonth , actualYear);


  return msj;
}









}
