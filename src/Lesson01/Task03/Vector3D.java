package Lesson01.Task03;

public class Vector3D {

    private int x;
    private int y;
    private int z;

    public Vector3D() {
    }

    public Vector3D(int x, int y, int z) {

        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setZ(int z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getZ() {
        return z;
    }

    public Vector3D addVector(Vector3D vector) {

        return new Vector3D(x + vector.x, y + vector.y, z + vector.z);
    }

    public Vector3D getVectorProduct(Vector3D vector) {

        return new Vector3D(y * vector.z - z * vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.x);
    }

    public double getScalarProduct(Vector3D vector) {

        return x * vector.x + y * vector.y + z * vector.z;
    }

    @Override
    public String toString() {

        return "Vector3D : {" + "x = " + x + ", y = " + y + ", z = " + z + "}";
    }
}
