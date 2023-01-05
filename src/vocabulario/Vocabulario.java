package vocabulario;

public class Vocabulario {
	// nao estou usando
	String[][] wordPalavra = {
			{"hello", "ola"},
			{"elementary","fundamental"},
			{"each","cada"},
			{"for","para"},
			{"while","enquanto"},
			{"if","se"},
			{"",""},
			};
	
	String[] words = {"word","for","while","if"}; // estou usando para embaralhar
	
	String[] palavras = {"palavra","para","enquanto","se"}; // nao estou usando
	
	// nao esta mudando em nada este toString
	@Override
	public String toString() {
		return "word " + words + "";
	}
}
