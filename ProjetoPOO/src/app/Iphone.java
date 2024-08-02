package app;
import app.servicos.AparelhoTelefonico;
import app.servicos.NavegadorInternet;
import app.servicos.ReprodutorMusical;

public class Iphone {public static void main(String[] args) {
	
	AparelhoTelefonico ap = new AparelhoTelefonico();	
	NavegadorInternet ni = new NavegadorInternet();
	ReprodutorMusical rm = new ReprodutorMusical();
	
	String appEscolhido = "url";
		
	switch(appEscolhido) {
		case "numero":
			ap.ligar();
			ap.atender();
			ap.iniciarCorreioVoz();
			break;
			
		case "url":
			ni.exibirPagina();
			ni.adicionarNovaAba();
			ni.atualizarPagina();
			break;
				
		case "musica":
			rm.selecionarMusica();
			rm.tocar();
			rm.pausar();
			break;
			
		default:
			System.out.println("Aplicativo não reconhecido.");
			break;
		
		}
	}
}
