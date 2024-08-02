package app;
import app.servicos.AparelhoTelefonico;
import app.servicos.NavegadorInternet;
import app.servicos.ReprodutorMusical;

public class Iphone {
	public static void main(String[] args) {
		
		AparelhoTelefonico ap = null;	
		NavegadorInternet ni = null;
		ReprodutorMusical rm = null;
		
		String appEscolhido = "musica";
		
		if (appEscolhido.equals("numero")) {
			ap = new AparelhoTelefonico();
			ap.ligar();
			ap.atender();
			ap.iniciarCorreioVoz();

		}else if(appEscolhido.equals("url")) {
			ni = new NavegadorInternet();
			ni.exibirPagina();
			ni.adicionarNovaAba();
			ni.atualizarPagina();
			
		}else if(appEscolhido.equals("musica")) {
			rm = new ReprodutorMusical();
			rm.selecionarMusica();
			rm.tocar();
			rm.pausar();

		}
	}
}