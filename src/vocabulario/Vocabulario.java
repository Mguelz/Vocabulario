package vocabulario;

public class Vocabulario {
	String[][] wordPalavra = {
			{"hello", "ola"},
			{"elementary","fundamental"},
			{"each","cada"},
			{"for","para"},
			{"while","enquanto"},
			{"if","se"},
			{"",""},
			};
	String[] words = {"word","for","while","if"};
	String[] palavras = {"palavra","para","enquanto","se"};
	
	// nao esta mudando em nada este toString
	@Override
	public String toString() {
		return "word " + words + "";
	}
}
