package com.ej_07;

public class DVDReader {
    private boolean canWrite;
    private String brand;

    public DVDReader() {
        brand = "";
    }

    public DVDReader(String brand, boolean canWrite) {
        setBrand(brand);
        setCanWrite(canWrite);
    }

    public boolean isCanWrite() {
        return canWrite;
    }

    public void setCanWrite(boolean canWrite) {
        this.canWrite = canWrite;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "DVDReader [canWrite=" + canWrite + ", brand=" + brand + "]";
    }
}
