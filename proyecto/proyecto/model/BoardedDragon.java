package model;

public class BoardedDragon {

//Atributos

private String name;
private  double weight;
private double height;
// 1 hombre, 2 mujer
private String gender;
private double food;
private double imc;
//Metodos

public BoardedDragon (String name, double weight , double height, String gender, double food, double imc){

this.name = name;
this.weight = weight;
this.height = height;
this.gender = gender;
this.food = food;
this.imc = imc;

}

public String getName(){
return name;
}
public void setName(String name){
 this.name = name;
}
public double getWeight(){
return weight;
}
public void setWeight(double weight){
this.weight = weight;
}
public double getHeight(){
return height;
}
public void setHeight(double height){
this.height = height;
}
public String getGender(){
return gender;
}
public void setGender(String gender){
this.gender= gender;
}
public double getFood(){
return food;
}
public void setFood(double food){
this.food = food;
}
public double getImc(){
return imc;
}
public void setImc(double imc){
this.imc = imc;
}

public String foodDragon(){
   String message ="";
  if(food < 5.0){
    message = "El alimento es menor a 5 kg";
  }
  else {
    message = "Esta todo en orden";
  }
  return message;
}

public  double calculatedDragonIMC(){
  double imc11 = 0;
  double imc22 = 0;

  imc11 +=getWeight();
  imc22 +=getHeight();


 imc = imc11 / (imc22 * imc22);

  return imc;
}
public String vocalsOfTheBoardedDragon(){
String message ="";
int x = 0;

if(name.charAt(x) == 'a' || name.charAt(x) == 'e' || name.charAt(x)== 'i' || name.charAt(x) == 'o' || name.charAt(x) == 'u' || name.charAt(x) == 'A' || name.charAt(x) == 'E' || name.charAt(x)== 'I' || name.charAt(x) == 'O' || name.charAt(x) == 'U'){
 message ="El nombre es:" +  name;
} else if(finalsVocalsBoardedDragon()){
  message = name;
} else {
  message = "No tiene vocales" + name;
}
return message;
}

public boolean finalsVocalsBoardedDragon(){
  boolean message = true;
  char vo = name.charAt(name.length()-1);

  if (vo == 'a' || vo == 'e'|| vo == 'i' || vo == 'o' || vo == 'u' || vo == 'A' || vo == 'E'|| vo == 'I' || vo == 'O' || vo == 'U'){
  message = true;
} else {
  message = false;
}
  return message;
}

public String informationBoardedDragon(){
  String msj ="";
msj += "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
                                                                                msj += "\n Hola soy el Dragon: " +name;
                                                                                msj += " \n mi peso es: " + weight;
                                                                                msj += "\n mi tamano es:" + height;
                                                                                msj += " \n mi genero es:" + gender;
                                                                                msj += "\n mi comida es:" + food;
                                                                                msj += "\n mi imc es :" + calculatedDragonIMC();

msj += "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
msj += "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
return msj;
}
public double calculatedBoardedDragonWaterLiter2(){
  double waterLiter = 0.0;

 waterLiter = (imc * 0.75) + (imc * 0.75);

 return waterLiter;

}

}
