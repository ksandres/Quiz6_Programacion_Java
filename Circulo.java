public class Circulo extends FiguraGeometrica {
private double radio;

public void Circulo(){
        this.radio = radio;
    }
public double obtenerArea(){
    return (radio*radio)*Math.PI;
}

    public double obtenerPerimetro() {
        return 2*(Math.PI)*radio;
    }
}
