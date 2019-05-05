package model;

public class KangarooEnvirioment{

//Constantes

public final static double AREAZOO = 8.0 ;


//Atributos
private double size;


//Relaciones
private Kangaroo kgo1;
private Kangaroo kgo2;
private Kangaroo kgo3;

//Metodos

public KangarooEnvirioment (double size, Kangaroo kgo1 , Kangaroo kgo2 , Kangaroo kgo3 ){

this.size = size;
this.kgo1 = kgo1;
this.kgo2 = kgo2;
this.kgo3 = kgo3;

}

public double getSize(){
return size;
}

public void setSize(double size){
this.size = size;
}

public Kangaroo getKgo1(){
return kgo1;
}
public void setKgo1(Kangaroo kgo1){
this.kgo1= kgo1;
}

public Kangaroo getKgo2(){
return kgo2;
}
public void setKgo2(Kangaroo kgo2){
this.kgo2= kgo2;
}

public Kangaroo getKgo3(){
return kgo3;
}
public void setKgo3(Kangaroo kgo3){
this.kgo3= kgo3;
}

public double calcularArea(){
double sizz = 0;

 sizz += kgo1.getHeight();
sizz += kgo2.getHeight();
sizz += kgo3.getHeight();

size = sizz * AREAZOO;

return size;
}

public String deletedKangaroo (int kangar ){
String message = "";
if(kangar == 1){
 if( kgo1 !=null){
 kgo1 = null;
message = "Ha sido eliminado";
}
}
else if(kangar == 2){
if( kgo2 !=null){
  kgo2 = null;
message = "Ha sido eliminado";
}
}
else if(kangar == 3){
 if( kgo3 !=null){
  kgo3 = null;
message = "Ha sido eliminado";
}

}

return message;

}

public double calculatedFoodKangaroo(){
 double food = 0.0;

 food += kgo1 == null ? 0:kgo1.calculatedTotalllyFoodKangaroo();
 food += kgo2 == null ? 0:kgo2.calculatedTotalllyFoodKangaroo();
 food += kgo3 == null ? 0:kgo3.calculatedTotalllyFoodKangaroo();

 return food;
}

public double calculatedIMCkangaroo(){

  double imc = 0.0;

 imc += kgo1 == null ? 0:kgo1.getImc();
 imc += kgo2 == null ? 0:kgo2.getImc();
 imc += kgo3 == null ? 0:kgo3.getImc();

  return imc;

}


public String showKangarooInformation1(){
  String message = "";

  message += kgo1 ==null ? 0: kgo1.showInformationKangaroo();
  message += kgo2 ==null ? 0: kgo2.showInformationKangaroo();
  message += kgo3 ==null ? 0: kgo3.showInformationKangaroo();

  return message;

}


public String showVocalsOfTheKangaroo(){
String message = "";


message += kgo1 ==null ? 0: kgo1.VocalsOfTheKangaroo();
message += kgo2 ==null ? 0: kgo2.VocalsOfTheKangaroo();
message += kgo3 ==null ? 0: kgo3.VocalsOfTheKangaroo();

return message;


}
public String addKangaroo(Kangaroo add){
 String message = "";

if(kgo1 == null || kgo2==null || kgo3 == null){

  if(add.getGender().equals(Kangaroo.MALE)){
    if(maleFull()){
        message = "El ambiente tienes espacio pero no fue posible agregar al canguro por las restricciones de genero en los ambientes, lo siento " +add.  getName();
    }else{
      addKangarooRelation(add);
      message = "El canguro ha sido agregado " +add.getName();
    }
  }else{
        addKangarooRelation(add);
        message = "El canguro ha sido agregado " +add.getName();
  }

}else{
  message = "El ambiente esta lleno, por lo cual no se puedo agregar el canguro" +add.getName();
}

return message;

}

public boolean maleFull(){
boolean lleno = false;

if(kgo1 != null && kgo1.getGender().equals(Kangaroo.MALE)){
  lleno = true;
}
if(kgo2 != null && kgo2.getGender().equals(Kangaroo.MALE)){
  lleno = true;
}
if(kgo3 != null && kgo3.getGender().equals(Kangaroo.MALE)){
  lleno = true;
}

return lleno;
}

public void addKangarooRelation (Kangaroo add){

if(kgo1== null){
  kgo1 = add;
}else if (kgo2==null){
  kgo2 = add;
}else{
  kgo3 = add;
}

}

public String vacunne2(int actualDay , int actualMonth , int actualYear){
String msj = "";

msj+= kgo1 == null ? 0 : kgo1.vacunne1(actualDay , actualMonth , actualYear);
msj+= kgo2 == null ? 0 : kgo2.vacunne1(actualDay , actualMonth , actualYear);
msj+= kgo3 == null ? 0 : kgo3.vacunne1(actualDay , actualMonth , actualYear);


return msj;

}

}
