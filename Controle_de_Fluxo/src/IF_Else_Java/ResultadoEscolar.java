package IF_Else_Java;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

	if (nota >= 7)
		System.out.println("Aprovado");
	else if (nota >= 5 && nota < 7)
		System.out.println("Recuperação");
	else
		System.out.println("Reprovado");
    
		int notaA = 6;
		String resultado = notaA >=7 ? "Aprovado" : notaA >=5 && notaA <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
	}
}