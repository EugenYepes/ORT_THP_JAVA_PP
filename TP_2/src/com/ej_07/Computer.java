package com.ej_07;

public class Computer{
    private DVDReader DVDReader;
    private ComputerTypes computerType;
    private boolean itsOn;
    private CPU cpu;
    
    public Computer(ComputerTypes computerType, DVDReader dvdReader, CPU cpu) {
        this.cpu = cpu; 
        this.computerType = computerType;
        this.DVDReader = dvdReader;
        itsOn = false;
    }

    public Computer() {
        cpu = new CPU();
        DVDReader = new DVDReader();
    }

    public void turnOn() {
        itsOn = true;
        cpu.setTemperature(30);
    }

    public void reset() {
        itsOn = false;
        System.out.println("Restarting...");
        cpu.setTemperature(30);
        itsOn = true;
    }

    public void turnOff() {
        cpu.setTemperature(0);
        itsOn = false;
    }

    public DVDReader getDVDReader() {
        return DVDReader;
    }

    public void setDVDReader(DVDReader dVDReader) {
        DVDReader = dVDReader;
    }

    public ComputerTypes getComputerType() {
        return computerType;
    }

    public void setComputerType(ComputerTypes computerType) {
        this.computerType = computerType;
    }

    public boolean isItsOn() {
        return itsOn;
    }

    public void setItsOn(boolean itsOn) {
        this.itsOn = itsOn;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computer [DVDReader=" + DVDReader + ", computerType=" + computerType + ", itsOn=" + itsOn + ", cpu=" + cpu + "]";
    }
}
