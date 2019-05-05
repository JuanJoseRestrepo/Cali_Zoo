package model;

public class Harbor{

//relaciones
 private Container container1;
 private Container container2;
 private Container container3;



public Harbor( Container container1 , Container container2 , Container container3){

 this.container1 = container1;
 this.container2 = container2;
 this.container3 = container3;
}

public Container getContainer1(){
return container1;
}
public void setContainer1(Container container1){
  this.container1 = container1;
}
public Container getContainer2(){
return container2;
}
public void setContainer2(Container container2){
  this.container2 = container2;
}
public Container getContainer3(){
return container3;
}
public void setContainer3(Container container3){
  this.container3 = container3;
}

public double calculateTotalMerca(){
double z = 0.0;

z = (container1.calculateTotal() + container2.calculateTotal() + container3.calculateTotal());

  return z;
}

public double calculateAvarageContainers(){
double s = 0.0;

s += calculateTotalMerca()/3;

return s;


}





}
