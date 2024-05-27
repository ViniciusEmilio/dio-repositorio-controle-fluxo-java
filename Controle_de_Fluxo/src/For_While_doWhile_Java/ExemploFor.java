package For_While_doWhile_Java;

public class ExemploFor {
    public static void main(String[] args) {
        for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos ++){
            System.out.println(carneirinhos + " Carneirinhos");
            if (carneirinhos == 20) {
                System.out.println("Flavinha dormiu!");
            }
        }
        for(int dias = 1; dias <= 30; dias ++){
            System.out.println("Hoje estamos no dia " + dias + " do mês de Janeiro");
        }
        for(int numero = 0; numero <=100; numero++){
            if (numero == 0) {
                System.out.println("Este é um contador de 0 a 100 " + numero);    
                continue;
            }
        System.out.println(numero);
            
        }
    }   

}
