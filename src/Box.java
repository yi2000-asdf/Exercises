public class Box {
    double width;
    double height;
    double depth;

    double volume(){

        return width*height*depth;

    }

    void setDim(double w, double h, double d){
        this.width=w;
        this.height=h;
        this.depth=d;
    }


    static class boxDemo3{


    public static void main (String args[]){

        Box mybox1 = new Box();
        Box mybox2 = new Box();


        double vol;

        mybox1.width =10;
        mybox1.height=20;
        mybox1.depth =15;

        mybox2.width =8;
        mybox2.height=7;
        mybox2.depth =3;


        mybox1.setDim(18,22,45);
        double vol1 = mybox1.volume();
        double vol2 = mybox2.volume();

        System.out.println(vol1);
    }
    }
}
