public class Parte5Switch {
    public static void main(String[] args) {
        var season="VERANO";
            switch (season){
                case "VERANO":
                    System.out.println("es Verano");
                    break;
                case "PRIMAVERA":
                    System.out.println("es Primavera");
                    break;
                case "OTOÑO":
                    System.out.println("es Otoño");
                    break;
                case "INVIERNO":
                    System.out.println("es Invierno");
                    break;
                default:
                    System.out.println("no es una estacion");
                }
    }
}
