import java.util.Scanner;

// Classe Sanduiche
class Sanduiche {
    private String nome;

    public Sanduiche(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

// Classe Sobremesa
class Sobremesa {
    private String nome;

    public Sobremesa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

// Classe Bebida
class Bebida {
    private String nome;

    public Bebida(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

// Classe Combo (Fachada)
class Combo {
    private Sanduiche sanduiche;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public void criarCombo(int tipo) {
        if (tipo == 1) {
            sanduiche = new Sanduiche("Combo Master - Sanduiche");
            sobremesa = new Sobremesa("Combo Master - Sobremesa");
            bebida = new Bebida("Combo Master - Bebida");
        } else if (tipo == 2) {
            sanduiche = new Sanduiche("Super Combo - Sanduiche");
            sobremesa = new Sobremesa("Super Combo - Sobremesa");
            bebida = new Bebida("Super Combo - Bebida");
        } else {
            System.out.println("Tipo de combo inválido.");
        }
    }

    public String toString() {
        if (sanduiche != null && sobremesa != null && bebida != null) {
            return "Combo:\n" + sanduiche.getNome() + "\n" + sobremesa.getNome() + "\n" + bebida.getNome();
        } else {
            return "Combo não foi criado.";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Selecione seu combo");
        System.out.println("1. Combo Master");
        System.out.println("2. Super Combo");
        System.out.print("Sua escolha: ");

        Scanner input = new Scanner(System.in);

        int tipo = input.nextInt();
        Combo combo = new Combo();
        combo.criarCombo(tipo);
        System.out.println(combo);
    }
}
