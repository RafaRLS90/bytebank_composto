package bytebank_composto;

public class TestaBanco {
  public static void main(String[] args) {
	Cliente rafael = new Cliente();
	rafael.nome = "Rafael Lima";
	rafael.cpf = "222.222.222-22";
	rafael.profissao = "programador";
	
	Conta contaRafael = new Conta();
	contaRafael.depositar(100);
	
	contaRafael.titular = rafael;
	System.out.println(contaRafael.titular.nome);
	System.out.println(contaRafael.titular);
	System.out.println(rafael);
}
}
