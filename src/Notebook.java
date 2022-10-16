import java.util.Objects;

public class Notebook {
    String ramCapacity;
    String hddCapacity;
    String cpu;
    String os;
    String color;
    boolean status;

    void turnOn(){
        status = true;
    }
    void shutdown(){
        status = false;
    }
    public Notebook(String RAM, String HDD, String CPU, String OS, String Color){
        ramCapacity = RAM;
        hddCapacity = HDD;
        cpu = CPU;
        os = OS;
        color = Color;
        status = false;
    }

    @Override
    public String toString() {
        return "RAM: " + ramCapacity +"Gb; HDD: " + hddCapacity + "Gb; CPU: "+ cpu + "; OS: " + os + "; Color: " + color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notebook notebook)) return false;
        return ramCapacity.equals(notebook.ramCapacity)  && hddCapacity.equals(notebook.hddCapacity) && status == notebook.status
                && cpu.equals(notebook.cpu) && os.equals(notebook.os) && color.equals(notebook.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ramCapacity, hddCapacity, cpu, os, color, status);
    }
}
