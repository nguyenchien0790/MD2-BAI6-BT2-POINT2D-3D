public class Lop3d extends Lop2d{
    private float z = 0.0f;

    public Lop3d() {
    }

    public Lop3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        float[] XYZ = {super.getX(),super.getY(),this.z};
    }
    public float[] getXYZ(){
        float[] XYZ = {super.getX(),super.getY(),this.z};
        return XYZ;
    }

    @Override
    public String toString() {
        return "Lop3d{" + " x = "+ getX()+ " y = "+ getY()+
                " z = " + z +
                '}';
    }
}
