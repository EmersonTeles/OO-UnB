package FastFood;
public abstract class Produto {
private String nome;
private int id;
private float preco;
private String tipo;
//private float taxaDeLucro; 
public void cadastrar() {
}
public void editar() {
}
public void deletar() {
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
private int getId() {
	return id;
}
private void setId(int id) {
	this.id = id;
}
public float getPreco() {
	return preco;
}
public void setPreco(float preco) {
	this.preco = preco;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
}