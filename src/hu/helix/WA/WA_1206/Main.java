package hu.helix.WA.WA_1206;

public class Main {


    public static void main(String[] args) {

        System.out.println(Recursion.factorial(3));
        System.out.println(Recursion.sum(5));
        System.out.println(Recursion.fibonacci(3));



        Node root = new Node(1);
        Node node1 = new Node (0);
        Node node2 = new Node (2);
        Node node3 = new Node (5);
        Node node4 = new Node (10);
        Node node5 = new Node (6);
        Node node6 = new Node (7);
        root.setLeft(node1);
        root.setRight(node2);
        node1.setLeft(node3);
        node1.setRight(node4);
        node3.setLeft(node5);
        node3.setRight(node6);





      /*  MotoricVehicle m = new MotoricVehicle();
      try {
          m.go();
      }catch (NotImplementedException e){
          System.out.println(e);
      }catch (Exception e){
          System.out.println(e.getMessage());
      }finally {
          //
      }*/

    /*  Car car1=new Car();
      car1.setSpeed(150);
      car1.setEngineType(EngineType.DIESEL);



      Car car2=new Car();
      car2.setSpeed(120);
      car2.setEngineType(EngineType.GAS);

      try {
          car1.go();
          car2.go();
      } catch (SpeedingException e){
          System.out.println(e);
      }*/




            /*try {

        divide (10,0);}
        catch (ArithmeticException e){
            System.out.println("Elkaptuk "+ e.getMessage());
            //itt meg lehet hívni a saját metódust újra és pl ha elütötte beírhatja újra.
        } catch (Exception e){}*/


        /*try {
            int x = 10;
            System.out.println(x / 0);
        }
        catch (ArithmeticException e){
            //handle exception
            System.out.println("ne ossz 0-val!");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }*/
    }




   /* private static void divide(int a, int b) throws ArithmeticException{
        System.out.println(a/b);
    }*/
}

