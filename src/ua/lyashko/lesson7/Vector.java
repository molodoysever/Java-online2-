package ua.lyashko.lesson7;

public class Vector {
    double x;
    double y;
    double z;

    public Vector (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double vectorLenghth () {
        return Math.sqrt ( x * x + y * y + z * z );
    }

    public Vector vectorProduct ( Vector vector) {
        return new Vector (
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }

    public double scalarProduct ( Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public double cos ( Vector vector) {
        return scalarProduct ( vector ) / vectorLenghth () * vector.vectorLenghth ();
    }

    public Vector add ( Vector vector) {
        return new Vector (
                x + vector.x,
                y + vector.y,
                z + vector.z);
    }

    public Vector substract ( Vector vector) {
        return new Vector (
                x - vector.x,
                y - vector.y,
                z - vector.z);
    }

    public static Vector[] create (int n) {
        Vector[] vectors = new Vector[n];
        for(int i =0; i < n; i++){
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }

    @Override
    public String toString () {
        return "Vector{" +
                " x = " + x +
                ", y = " + y +
                ", z = " + z +
                '}';
    }
}
