package model;

public class Kangaroo {
// Constantes
public final static String MALE = "Male";
public final static String FEMALE = "Female";
public final static String TIPO_AB = "AB";
public final static String TIPO_A = "A";
public final static String TIPO_B = "B";
public final static String TIPO_O = "O";


//Atributos

private String name;
private double weight;
private double height;
private double imc;
// 1 hombre , 2 mujer
private String gender;
private double food;
private String typeOfBlood;
private String vacunne;

//Relaciones
private Dated birthday;


//Metodos
public Kangaroo (String name, double weight, double height ,double imc, String gender, double food, String typeOfBlood, Dated birthday){
this.name = name ;
this.weight = weight;
this.height= height;
this.imc = imc;
this.gender = gender;
this.food = food ;
this.typeOfBlood = typeOfBlood;
this.birthday = birthday;

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
public double getImc(){
return imc ;
}
public void setImc(double imc ){
this.imc = imc;
}
public String getGender(){
return gender;
}
public void setGender(String gender){
this.gender = gender;
}
public double getFood(){
return food;
}
public void setFood(double food){
this.food = food;
}
public String getTypeOfBlood(){
return typeOfBlood;
}
public void setTypeOfBlood(String typeOfBlood){
this.typeOfBlood = typeOfBlood;
}
public Dated getBirthday(){
return birthday;
}
public void setBirthday (Dated birthday ){
  this.birthday = birthday;
}

public String cardiaRisk (){
String message = "";

if(imc < 18){
if(typeOfBlood.equals(TIPO_A)){
  message = "Riesgo bajo";
      }
if(typeOfBlood.equals(TIPO_AB)){
  message = "Riesgo bajo";
       }
if (typeOfBlood.equals(TIPO_O)){
  message = "Riesgo moderado";
        }
if (typeOfBlood.equals(TIPO_B)){
  message = "Riesgo moderado";
           }
if(imc >= 18 && imc <= 25){
 message = "Riesgo Bajo";
    }
if(imc > 25){
if(typeOfBlood.equals(TIPO_A)){
  message = "Riesgo bajo";
        }
if(typeOfBlood.equals(TIPO_B)){
  message = "Riesgo Alto";
        }
if (typeOfBlood.equals(TIPO_O)){
  message = "Riesgo Alto";
        }
if (typeOfBlood.equals(TIPO_AB)){
  message = "Riesgo moderado";
      }
   }
 }
 return message;
}

public String fecha(){
 String message = "";

 message = "dia:"+ "" + birthday.getDay() + "Su mes es:" +  "" +birthday.getMonth() + "Su year es:" + ""+ birthday.getYear();

return message;
}

public String VocalsOfTheKangaroo(){
String message ="";
int x = 0;

if(name.charAt(x) == 'a' || name.charAt(x) == 'e' || name.charAt(x)== 'i' || name.charAt(x) == 'o' || name.charAt(x) == 'u' || name.charAt(x) == 'a' || name.charAt(x) == 'E' || name.charAt(x)== 'I' || name.charAt(x) == 'O' || name.charAt(x) == 'U'){
 message ="Tiene vocales iniciales:" +  name;
} else if  (finalsVocalsKangaroo()){
  message = name;
} else{
  message = "No tiene vocales" + name;
}

return message;
}


public  double calculatedKangarooIMC(){
  double imc11 = 0;
  double imc22 = 0;

  imc11 +=getWeight();
  imc22 +=getHeight();


 imc = imc11 / (imc22 * imc22);

  return imc;
}




public boolean finalsVocalsKangaroo(){
 boolean message =true;
  char vo = name.charAt(name.length()-1);

  if ( vo == 'a' || vo == 'e'|| vo == 'i' || vo == 'o' || vo == 'u' || vo == 'A' || vo == 'E'|| vo == 'I' || vo == 'O' || vo == 'U'){
  message =true;

} else {
  message =false;
}
  return message;
}

public double calculatedTotalllyFoodKangaroo(){
  double food = 0.0;

if(weight < 30){
   food = weight * 0.8;
 }
else if(weight >=30 && weight<= 48){
  food = weight * 1.1;
}
else if(food > 48){
  food = 40 + 0.4 *(weight-48);
}
return food;
}

public String showInformationKangaroo(){
String msj = "";

msj += "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
                                                                                msj += "\n Hola soy el Kangaroo: " + name;
                                                                                msj += " \n mi peso es: " + weight;
                                                                                msj += "\n mi tamano es:" + height;
                                                                                msj += "\n mi imc es :" + calculatedKangarooIMC();
                                                                                msj += " \n mi genero es:" + gender;
                                                                                msj += "\n mi comida es:" + calculatedTotalllyFoodKangaroo();
                                                                                msj += "\n mi sangre es y su riesgo cardiaco :" + typeOfBlood + ",  " + cardiaRisk();
                                                                                msj += "\n Su fecha de nacimiento:" + fecha();
msj += "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
msj += "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
return msj;

}
public String vacunne1(int actualDay , int actualMonth , int actualYear){
String msj = "";

msj +=  getName() + "\n"+ birthday.vacunne(actualDay , actualMonth , actualYear) + "\n";

return msj;

}

}
