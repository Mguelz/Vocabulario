package vocabulario.v2;

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
	
	String[] words = {"elementary","each","horse","glasses"}; // estou usando para embaralhar
	
	String[] palavras = {"fundamental","cada","cavalo","oculos"}; // nao estou usando
	
	// nao esta mudando em nada este toString
	@Override
	public String toString() {
		return "word " + words + "";
	}
}
