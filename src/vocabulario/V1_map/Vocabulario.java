package vocabulario.V1_map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Vocabulario {
	/**
	 * Criando e adicionando elementos num map que contem tanto a tradução da
	 * palavra quanto a palavra em ingles  
	 * 
	 * @return map
	 * @author Miguel Arcanjo
	 */
	public Map<String, String> allWords() {
		Map<String, String> map = new HashMap<>();
		map.put("fundamental", "elementary");
		map.put("cada", "each");
		map.put("inicio", "beginning");
		map.put("conteudo", "contents");
		map.put("escolher", "choose");
		map.put("fazer", "made");
		map.put("destinado", "intended");
		map.put("medir", "measure");
		map.put("utilizacao", "usage");
		map.put("quais", "which");
		map.put("guia", "guide");
		map.put("funciona", "works");
		map.put("deixar", "give");
		map.put("ativo", "active");
		map.put("promove", "promotes");
		map.put("formulario", "forms");
		map.put("recursos", "features");
		map.put("variar", "differ");
		map.put("acordo", "deal");
		map.put("ensinou", "taught");
		map.put("dirigido", "addressed");
		map.put("perto", "near");
		map.put("bem", "well");
		map.put("chuveiro", "shower");
		map.put("inverno", "winter");
		map.put("local", "site");
		map.put("falar", "tell");
		map.put("carne", "meat");
		map.put("pao", "bread");
		map.put("a_partir", "starting");
		map.put("manteiga", "butter");
		map.put("novo_e_folha", "breand_new");
		map.put("riacho", "creek");
		map.put("rio", "river");
		map.put("lago", "lake");
		map.put("piscina", "pool");
		map.put("suficiente", "enough");
		map.put("sempre", "always");
		map.put("roubar", "steal");
		map.put("xingar", "course");
		map.put("morrendo_de_fome", "starving");
		map.put("atrasar", "late");
		map.put("labios", "lips");
		map.put("cavalo", "hourse");
		map.put("graveto", "stick");
		map.put("vidro", "glass");
		map.put("vender", "sell");
		map.put("mar", "sea");
		map.put("atualmente", "currently");
		map.put("seguradora", "insurance");
		map.put("nasceu", "born");
		map.put("vivo", "alive");
		map.put("manter", "keep");
		map.put("oculos", "glasses");
		map.put("emprestar", "lend");
		map.put("parceiros", "partners");
		map.put("forte", "stronger");
		map.put("monitoramento", "tracking");
		map.put("manter", "remain");
		map.put("doente", "sick");
		map.put("sozinho", "alone");
		map.put("instalacao", "facilaty");
		map.put("significar", "mean");
		map.put("quente", "warm");
		map.put("monitorar", "monitor");
		map.put("confiante", "confident");
		map.put("voou", "flew");
		map.put("escondido", "hiding");
		map.put("estranho", "weird");
		map.put("assegurar", "assure");
		map.put("inesquecivel", "unforgettable");
		map.put("ficar", "stay");
		map.put("juntos", "together");
		map.put("tubo", "tube");
		map.put("solto", "loose");
		map.put("lei", "law");
		map.put("menos", "less");
		map.put("com_medo", "afraid");
		map.put("parafusar", "screw");
		map.put("prateleira", "shelf");
		map.put("barba", "beard");
		map.put("movimentadas", "bustling");
		map.put("correndo", "rushed");
		map.put("diariamente", "daily");
		map.put("recados", "errands");
		map.put("fresco", "fresh");
		map.put("artesanal", "handmade");
		map.put("artesanato", "crafts");
		map.put("palpite", "hunch");
		map.put("trazendo", "bringing");
		map.put("ambos", "both");
		map.put("preso", "stuck");
		map.put("arrepios", "creeps");
		map.put("feliz", "glad");
		map.put("inteligente", "smart");
		map.put("noivo", "groom");
		map.put("uniao", "togetherness");
		map.put("perdoar", "forgive");
		map.put("puxado", "pulled");
		map.put("filho", "son");
		map.put("substituir", "replace");
		map.put("roubou", "stole");
		map.put("carne_de_porco", "pork");
		map.put("voltando", "comming_back");
		map.put("encontro", "meeting");
		map.put("procurar", "find");
		map.put("ouvir", "hear");
		map.put("xadrez", "chess");
		map.put("montar", "ride");
		map.put("cavaleiro", "knight");
		map.put("tempestade", "storm");
		map.put("dispositivos", "devices");
		map.put("acima", "above");
		map.put("alvo", "target");
		map.put("poder", "might");
		map.put("chegar", "arrive");
		map.put("viajar", "travel");
		map.put("vendido", "sould");

		map.put("morto", "dying");
		map.put("procesos", "suit");
		map.put("anel", "ring");
		map.put("bastante", "quite");
		map.put("me_perguntando", "wondering");
		map.put("gostaria", "would");
		map.put("louco", "nuts");
		map.put("parece", "seems");
		map.put("poderia", "could");
		map.put("escuridao", "blackness");
		map.put("preso", "trapped");
		map.put("queimar_se", "burn_up");
		map.put("entrada", "entry");
		map.put("forcada", "forcible");

		map.put("duvida", "doubts");
		map.put("limpeza", "clearing");
		map.put("acontecendo", "happening");
		map.put("desde_que", "since");
		map.put("que", "than");
//		map.put("", "");
//		map.put("", "");
//		map.put("", "");
//		map.put("", "");
//		map.put("", "");

		map = aleatorizarElementos(map);
		return map;
	}

	/**
	 * Apresenta ao usuario uma mensagem de acerto
	 */
	public void mensagemAcertou() {
		System.out.println("---------------------------------------");
		System.out.println("Parabéns!!! você ACERTOU");
		System.out.println("---------------------------------------");
	}

	/**
	 * Apresenta ao usuario uma mensagem que o programa fechou
	 */
	public void mensagemFecharPrograma() {
		System.out.println("\n---------------------------------------");
		System.out.println("O Programa Fechou!");
		System.out.println("---------------------------------------");
	}

	/**
	 * Reinbaralhando a sequencia do HashMap, tornando todas as vezes que rodar o
	 * código, a sequencia das palavras iram ser aleatorias
	 * 
	 * @param Map<String, String> map
	 * @return novoMap
	 * @author Miguel com a ajuda do Wiu
	 */
	private static Map<String, String> aleatorizarElementos(Map<String, String> map) {
		Map<String, String> novoMap = new LinkedHashMap<String, String>();
		List<String> chaves = new ArrayList<String>(map.keySet());
		Collections.shuffle(chaves);
		chaves.forEach(e -> novoMap.put(e, map.get(e)));
		return novoMap;
	}

	/**
	 * instruções iniciais para orientação de como escrever as palavras e outras
	 * orientações de: como parar o programa e ver a quantidade de palavras
	 * acertadas e erradas
	 * 
	 */
	public void instrucoes() {
		System.out.println("-----------------------------INSTRUÇÕES INICIAIS-------------------------------------------\n");
		System.out.println("1. TODAS AS PALAVRAS TERÃO QUE SER DIGITADAS EM CAIXA BAIXA");
		System.out.println("   EXEMPLO: for --> para");
		System.out.println("2. A SEPARACAO ENTRE AS PALAVRAS É \"_\" E NÃO UM \"ESPAÇO\"");
		System.out.println("   EXEMPLO: around --> em_torno_de");
		System.out.println("3. A ACENTUAÇÃO DAS PALAVRAS SERÃO IGNORADAS, ENTÃO DIGITE COMO SE NÃO TIVESSE ACENTUAÇÃO");
		System.out.println("   EXEMPLO: bread --> pao");
		System.out.println("4. PARA PARAR O PROGRAMA DIGITE: \"close\"");
		System.out.println("5. DIGITE \"close\" QUANDO VOCE QUISER SABER QUANTAS PALAVRAS VOCE ACERTOU E ERROU");
		System.out.println("   APOS ESSE COMANDO VOCE IRA PARAR DE JOGAR");
		System.out.println("-------------------------------------------------------------------------------------------\n");

	}

}
