package model;

public class Dated{

//Atributos
private int day;
private int month;
private int year;

public Dated (int day, int month , int year){

this.day = day;
this.month = month;
this.year = year;

}


public int getDay(){
 return day;
}

public void setDay( int day){
  this.day = day;
}

public int getMonth(){
  return month;
}
public void setMonth(int month){
  this.month = month;
}

public int getYear(){
  return year;
}

public void setYear(int year){
  this.year= year;
}
public String vacunne(int actualDay , int actualMonth, int actualYear){
 String message = "";
 int bornDay = 0;
 int actualDay1 = 0;
 int ageday = 0;
 int diasqueFaltan = 0;
 int semanasQueFaltan = 0;

 bornDay += (month -1)* 30 + day;
 actualDay1 += (actualMonth -1)* 30 + actualDay;
 ageday += 360 - (day+ actualDay1);

if( ageday >= 360){
   message = "No tiene que vacunarse";
  }
 else {
   diasqueFaltan = (360 - ageday)/7;
   semanasQueFaltan = (360 - ageday)%7;
   message = "Los dias que faltan son:"+ "\n" + diasqueFaltan + "\n" +"semanasQueFaltan"+ "\n" + semanasQueFaltan;
 }
 return message;
}



}
