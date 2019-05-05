package model;


public class Container{

private double lenght;
private double width;
private double high;

public Container(double lenght,double width,double high){
this.lenght = lenght;
this.width = width;
this.high = high;

}

public double getLenght(){
 return lenght;
}

public  void setLenght(double lenght){
 this.lenght = lenght;
}

public double getWidth(){
 return width;
}

public void setWidth(){
   this.width = width;
}

public double getHigh(){
 return high;
}

public void setHigh(){
   this.high = high;
}

public double calculateTotal(){
double m = 0.0;

m += (getLenght() * getWidth() * getHigh());

return m;

}










}
