//step 4
//Use the factory to get object of concrete class by passing an information such as type.

//FactoryPatternDemo.java

public class FactoryPatternDemo {
    
      public static void main(String[] args) {
         ShapeFactory shapeFactory = new ShapeFactory();

         //get an object of Circle and call its draw method.
         Shape shape1 = shapeFactory.getShape("CIRCLE");

         //call draw method of Circle
         shape1.draw();

         //get an objects of Rectangle and call its draw method 
         Shape shape2 = shapeFactory.getShape("Rectangle");

         //call draw method of rectangle
         shape2.draw();

         //get an object 
     }

}
