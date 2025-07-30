package usuario;

import equipamento.IPhone;

public class Usuario {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        // Reprodutor musical
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica("Believe (Coldplay)");

        // Aparelho telefonico
        iPhone.ligar("1234");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        // Navegador de internet
        iPhone.exibirPagina("www.google.com");
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}
