
public class Bebida extends Produto {
	private int militros;
	private Insumo composicao[];

	public Bebida(String nome, String tipo, float preco, int militros) {
		super();
		this.militros = militros;
		this.setNome(nome);
		this.setTipo(tipo);
		this.setPreco(preco);
	}
	public void fazerBebida() {
		
	}
	public int getMilitros() {
		return militros;
	}
	public void setMilitros(int militros) {
		this.militros = militros;
	}
	public Insumo[] getComposicao() {
		return composicao;
	}
	public void setComposicao(Insumo[] composicao) {
		this.composicao = composicao;
	}
}
