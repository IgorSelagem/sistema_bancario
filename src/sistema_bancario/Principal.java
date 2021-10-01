package sistema_bancario;

public class Principal {

	public static void main(String[] args) {
		ListaDeGerentes gerentes = new ListaDeGerentes();
		
//		 Criando elementos
		Gerente paulo = new Gerente ("Paulo","1234");
		Gerente maria = new Gerente ("Maria","5678");
		
//		 Adicionando elementos na lista
		gerentes.cadastrar(paulo);
		gerentes.cadastrar(maria);
		
//		Listando elementos
		System.out.println(gerentes.listar());
		
//		Modificando Gerente
		Gerente novaMaria = new Gerente("Maria","4444");		
		gerentes.editar(novaMaria);
		System.out.println(gerentes.listar());
		
//		Removendo Gerente
		gerentes.remover(maria);
		System.out.println(gerentes.listar());
		
		ListaDeContas banco = new ListaDeContas();
//		Criando elementos
		Conta conta1 = new Conta(1, 100);
		Conta conta2 = new Conta(2, 200);
		
//		Cadastrando contas
		banco.cadastrar(conta1);
		banco.cadastrar(conta2);
		System.out.println(banco.listar());
		
//		Editando Conta
		Conta contaEditada = new Conta(1,1000);
		banco.editar(contaEditada);
		System.out.println(banco.listar());
		
//		Removendo conta		
		banco.remover(contaEditada);
		System.out.println(banco.listar());
		
		ListaDeClientes clientes = new ListaDeClientes();
		
//		Criando elementos		
		Cliente cliente1 = new Cliente("888.777.666.222-40","Igor Mendes");
		Cliente cliente2 = new Cliente("111.222.333.444-10","Carlos Mathias");
//		Cadastrando Elementos
		clientes.cadastrar(cliente1);
		clientes.cadastrar(cliente2);
		System.out.println(clientes.listar());
//		Editando Elemento
		Cliente clienteEditado = new Cliente("888.777.666.222-40","Marcos Mendes Botelho");
		clientes.editar(clienteEditado);
		System.out.println(clientes.listar());
// 		Removendo Cliente
		clientes.remover(clienteEditado);
		System.out.println(clientes.listar());
		
	}
	
}
