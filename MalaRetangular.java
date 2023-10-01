import java.util.Objects;

public class MalaRetangular {

    private String material;
    private double area;
    private int peso;
    private double lado1;
    private double lado2;

    public MalaRetangular(String material, double lado1, double lado2, int peso) {
        super();
        this.material = material;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getArea(){
        area = lado1 * lado2;
        return area;
    }

    public String getMaterial(){
        return material;
    }

    public double getPeso(){
        return peso;
    }

    public int hashCode() {
        return Objects.hash(material, peso, lado1, lado2);
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof MalaRetangular))
            return false;
        MalaRetangular other = (MalaRetangular) obj;
        return Objects.equals(material, other.material)
                && Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso)
                && Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area);
    }

    public String toString() {
        return "Prato redondo de " + material + ", com área " + getArea() + " e peso de " + getPeso() + " gramas.";
    }
}