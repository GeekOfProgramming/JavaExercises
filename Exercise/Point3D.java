public class Point3D extends Point2D {

    private float z = 0.0f;

    public Point3D(float aX, float aY, float aZ) {
        super(aX, aY);
        this.z = aZ;
    }

    public Point3D() {
        super();
        this.z = 0.0f;
    }

    /**
     * @return the z
     */
    public float getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float aX, float aY, float aZ) {
        super.setXY(aX, aY);
        this.z = aZ;
    }

    public float[] getXYZ() {
        float[] result = new float[3];
        result[0] = super.getX();
        result[1] = super.getY();
        result[2] = getZ();
        return result;
    }

    @Override
    public String toString() {
        return "\"" + getX() + "," + getY() + "," + z + ")\"";
    }
}