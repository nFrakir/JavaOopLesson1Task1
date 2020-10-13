package com.gmail.seliverstova.hanna;

public class Vector3d {
    private double x;
    private double y;
    private double z;

    public Vector3d(double x, double y, double z) {
        super();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3d() {
        super();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector3d [x=" + x + ", y=" + y + ", z=" + z + "]";
    }

    public double getScalarMultiplication(Vector3d vector) {
        double scalar = vector.getX() * this.getX() + vector.getY() * this.getY() + vector.getZ() * this.getZ();
        return scalar;
    }

    public Vector3d getVectorMultiplication(Vector3d vector) {
        double rx = this.getY() * vector.getZ() - this.getZ() * vector.getY();
        double ry = this.getZ() * vector.getX() - this.getX() * vector.getZ();
        double rz = this.getX() * vector.getY() - this.getY() * vector.getX();
        return new Vector3d(rx, ry, rz);
    }

    public Vector3d getVectorSum(Vector3d vector) {
        Vector3d sumVector = new Vector3d(vector.getX() + this.getX(), vector.getY() + this.getY(),
                vector.getZ() + this.getZ());
        return sumVector;
    }
}
