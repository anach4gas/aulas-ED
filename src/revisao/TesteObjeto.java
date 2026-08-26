package revisao;

public class TesteObjeto {
    public static void main(String[] args) throws Exception {
        VetorObjeto vetor = new VetorObjeto(5);
        Contato c1 = new Contato("Ana Clara", "112345678", "ana@gmail.com");
        Contato c2 = new Contato("Andressa", "1198664532", "andressa@gmail.com");
        Contato c3 = new Contato("Andrade viado", "11986543223", "andradevia@gmail.com");

            vetor.adiciona(c1);
            vetor.adiciona(c2);
            vetor.adiciona(c3);
        System.out.println("Tamanho do vetor: " + vetor.tamanho());

        System.out.println(vetor);
    }
}

/* try {
} catch (Exception e) {
        e.printStackTrace();
        }
--> Não é necessário quando utilizamos o throws Exception
 */