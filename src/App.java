import java.util.Scanner;

abstract class Equipe 
{
    protected int vitorias;
    protected int empates;
    protected int derrotas;

    public Equipe(int vitorias, int empates, int derrotas)
    {
        setVitorias(vitorias);
        setEmpates(empates);
        setDerrotas(derrotas);
    }

    public int getVitorias() 
    {
        return vitorias;
    }
    public void setVitorias(int vitorias) 
    {
        if (vitorias >= 0)
        {
            this.vitorias = vitorias;
        }
    }

    public int getEmpates() 
    {
        return empates;
    }
    public void setEmpates(int empates) 
    {
        if (empates >= 0)
        {
            this.empates = empates;
        }
    }

    public int getDerrotas() 
    {
        return derrotas;
    }
    public void setDerrotas(int derrotas) 
    {
        if (derrotas >= 0)
        {
            this.derrotas = derrotas;
        }
    }

    public abstract int calcularPontos();

    public int calcularQuantidadeDeJogos()
    {
        return vitorias + empates + derrotas;
    }

    public String toString() {
        return "Vitórias: " + vitorias +
               "\nEmpates: " + empates +
               "\nDerrotas: " + derrotas +
               "\nPontos: " + calcularPontos() +
               "\nQuantidade de jogos: " + calcularQuantidadeDeJogos();
    }
}

class EquipeFutebol extends Equipe
{
    public EquipeFutebol(int vitorias, int empates, int derrotas)
    {
        super(vitorias, empates, derrotas);
    }

    public int calcularPontos()
    {
        return (vitorias * 3) + (empates);
    }
}

class EquipeBasquete extends Equipe
{
    public EquipeBasquete(int vitorias, int empates, int derrotas)
    {
        super(vitorias, empates, derrotas);
    }

    public int calcularPontos()
    {
        return (vitorias * 2) + empates;
    }
}

public class App {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Instanciando equipes de futebol
        System.out.println("Equipe de Futebol 1");
        System.out.println("Digite o número de vitórias:");
        int vitoriasFutebol1 = scanner.nextInt();
        System.out.println("Digite o número de empates:");
        int empatesFutebol1 = scanner.nextInt();
        System.out.println("Digite o número de derrotas:");
        int derrotasFutebol1 = scanner.nextInt();
        EquipeFutebol equipeFutebol1 = new EquipeFutebol(vitoriasFutebol1, empatesFutebol1, derrotasFutebol1);

        System.out.println("Equipe de Futebol 2");
        System.out.println("Digite o número de vitórias:");
        int vitoriasFutebol2 = scanner.nextInt();
        System.out.println("Digite o número de empates:");
        int empatesFutebol2 = scanner.nextInt();
        System.out.println("Digite o número de derrotas:");
        int derrotasFutebol2 = scanner.nextInt();
        EquipeFutebol equipeFutebol2 = new EquipeFutebol(vitoriasFutebol2, empatesFutebol2, derrotasFutebol2);

        // Instanciando equipes de basquete
        System.out.println("Equipe de Basquete 1");
        System.out.println("Digite o número de vitórias:");
        int vitoriasBasquete1 = scanner.nextInt();
        System.out.println("Digite o número de empates:");
        int empatesBasquete1 = scanner.nextInt();
        System.out.println("Digite o número de derrotas:");
        int derrotasBasquete1 = scanner.nextInt();
        EquipeBasquete equipeBasquete1 = new EquipeBasquete(vitoriasBasquete1, empatesBasquete1, derrotasBasquete1);

        System.out.println("Equipe de Basquete 2");
        System.out.println("Digite o número de vitórias:");
        int vitoriasBasquete2 = scanner.nextInt();
        System.out.println("Digite o número de empates:");
        int empatesBasquete2 = scanner.nextInt();
        System.out.println("Digite o número de derrotas:");
        int derrotasBasquete2 = scanner.nextInt();
        EquipeBasquete equipeBasquete2 = new EquipeBasquete(vitoriasBasquete2, empatesBasquete2, derrotasBasquete2);

        scanner.close();

        // Verificando a equipe de futebol vencedora
        if (equipeFutebol1.calcularPontos() > equipeFutebol2.calcularPontos()) {
            System.out.println("A equipe vencedora de futebol 1 é:\n" + equipeFutebol1);
        } else {
            System.out.println("A equipe vencedora de futebol 2 é:\n" + equipeFutebol2);
        }
    }
}