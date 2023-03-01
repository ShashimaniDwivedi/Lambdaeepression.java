
interface car {
    void drive();
}
//  class WagonR implements car
//    {
//        public void drive()
//        {
//            System.out.println("driver");
//        }
//
//    }



public class AICDemo {
    public static void main(String[] args) {
   car obj=new car()
   {
       public void drive()
       {
           System.out.println("driver");//Anonomous in a class
       }
   };
   obj.drive();

    }
}
