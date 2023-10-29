public class Executor {


    public static void main(String[] args) {

        Pencil myPencil = new Pencil();

        System.out.println(myPencil.write());

        System.out.println(myPencil.getWriterType());
        System.out.println(myPencil.getWriterType("Pencil Type"));


        System.out.println("_________________________________");

        Pen myPen = new Pen();

        System.out.println(myPen.write());
        System.out.println(myPen.getWriterType());
        System.out.println(myPencil.getWriterType("Pen Type"));


        System.out.println("_________________________________");

        Brush myBrush = new Brush();

        System.out.println(myBrush.write());


    }

}
