public class ComprasAtacadao {

 public int quantidadeProdutos;
 private float precoUnitario;
 private float valorTotal;
 private int idProduto;


 public void computarCompra(int quantidadeProdutos, float precoUnitario, int idProduto){
  this.idProduto=idProduto;
  this.precoUnitario = precoUnitario;
  this.quantidadeProdutos =quantidadeProdutos;
 }

 public double calcularValorTotal() {
  return quantidadeProdutos * precoUnitario;
 }

 public float getPrecoUnitario() {
  return precoUnitario;
 }

 public void setPrecoUnitario(float precoUnitario) {
  this.precoUnitario = precoUnitario;
 }

 public int getQuantidadeProdutos() {
  return quantidadeProdutos;
 }

 public void setQuantidadeProdutos(int quantidadeProdutos) {
  this.quantidadeProdutos = quantidadeProdutos;
 }

 public float getValorTotal() {
  return valorTotal;
 }

 public void setValorTotal(float valorTotal) {
  this.valorTotal = valorTotal;
 }

 public int getIdProduto() {
  return idProduto;
 }

 public void setIdProduto(int idProduto) {
  this.idProduto = idProduto;
 }
 float aplicarDescontoPorQuantidade() {
  if (quantidadeProdutos > 5 && quantidadeProdutos <= 15) {
   valorTotal *= 0.9;
  } else if (quantidadeProdutos > 15 && quantidadeProdutos <= 25) {
   valorTotal *= 0.8;
  } else if (quantidadeProdutos > 25) {
   valorTotal *= 0.75;
  }
  return valorTotal;
 }
}