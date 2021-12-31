//Step 3
//Create a Factory to generate object of concrete class based on given information

//ShapeFactory.java

public class ShapeFactory {

//use getShape method to get object of type shape
public Shape getShape(String shapeType){
if(shapeType == null){
return null;
}
if(shapeType.equalsIgnoreCase("CIRCLE")){
return new Circle();

} else if(shapeType.equalsIgnoreCase("RECTANGLE")){
return new Rectangle();

} else if(shapeType.equalsIgnoreCase("SQUARE")){
return (Shape) new Square();
}

return null;
}
}