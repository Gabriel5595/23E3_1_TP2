abstract class Equipe 
{
    protected int vitorias;
    protected int empates;
    protected int derrotas;

    public abstract int calcularPontos();

    public int calcularQuantidadeDeJogos()
    {

    }
}

class EquipeFutebol extends Equipe
{
    public int calcularPontos()
    {

    }
}

class EquipeBasquete extends Equipe
{
    public int calcularPontos()
    {
        
    }
}