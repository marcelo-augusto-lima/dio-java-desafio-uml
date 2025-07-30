package equipamento;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Reprodutor musical
    public void tocar(){
        System.out.println("TOCANDO MUSICA");
    }

    public void pausar(){
        System.out.println("MUSICA PAUSADA");
    }

    public void selecionarMusica(String url){
        System.out.println("MUSICA SELECIONADA " + url);
    }

    // Aparelho telefonico
    public void ligar(String numero){
        System.out.println("LIGANDO PARA NUMERO " + numero);
    }

    public void atender(){
        System.out.println("ATENDENDO TELEFONE");
    }

    public void iniciarCorreioVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    // Navegador de internet
    public void exibirPagina(String url){
        System.out.println("EXIBINDO PAGINA " + url);
    }

    public void adicionarNovaAba(){
        System.out.println("NOVA ABA ADICIONADA");
    }

    public void atualizarPagina(){
        System.out.println("ATUALIZANDO PAGINA");
    }
    
}
