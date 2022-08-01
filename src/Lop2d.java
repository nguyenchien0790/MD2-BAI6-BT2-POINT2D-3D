public class Lop2d {
    private float x=0;
    private float y=0;

    public Lop2d() {
    }

    public Lop2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x =x;
        this.y=y;
    }
    public float [] getXY(){
        return new float[] {x,y};

    }

    @Override
    public String toString() {
        return "Lop2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
