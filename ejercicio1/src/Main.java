public class Main {

    public static void main(String[] args) {
        int suma1 = suma(5,3,2);

        System.out.println(suma1);

        Coche miCoche = new Coche();
        miCoche.AgregarPuertas();

        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }


}

class Coche{
    public int puertas = 0;

    public void AgregarPuertas(){
        this.puertas++;
    }
}