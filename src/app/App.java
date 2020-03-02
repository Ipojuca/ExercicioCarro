package app;

public class App {
    
    public static  void main(final String[] args) {
        System.out.println("Projeto Carro - LP2");

        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();
        System.out.println("Carro 1");
        c1.setModelo("Palio");
        c1.setAno(2010);
        c1.setChassi("RN123131");
        c1.setPlaca("FXZ90X9");
        c1.setCor("Branco");
        c1.motor.setKilometragem(5000);
        c1.motor.setCombustivel("Gasolina");
        System.out.println(c1.toString());
        c1.liga();
        c1.motor.trocaOleo();
        c1.abastecer();
        c1.acelera();
        c1.freia();
        System.out.println( c1.toString());
        
        System.out.println("\n\nCarro 2");
        c2.setModelo("HB 20");
        c2.setAno(2020);
        c2.setChassi("RN114131312");
        c2.setPlaca("ZYB23cC3");
        c2.setCor("AZUL");
        c2.motor.setKilometragem(400);
        c2.motor.setCombustivel("FLEX");
        System.out.println(c2.toString());
        c2.liga();
        //c2.motor.trocaOleo();
        c2.abastecer();
        c2.acelera();
        c2.freia();
        System.out.println( c2.toString());
        
        System.out.println("\n\nCarro 3");
        c3.setModelo("FUSCA");
        c3.setAno(1973);
        c3.setChassi("JP12312312");
        c3.setPlaca("WSA56Y7");
        c3.setCor("VERMELHA");
        c3.motor.setKilometragem(150000);
        c3.motor.setCombustivel("GASOLINA");
        System.out.println(c3.toString());
        c3.liga();
        c3.motor.trocaOleo();
        c3.abastecer();
        c3.acelera();
        c3.freia();
        System.out.println( c3.toString());

    }
}