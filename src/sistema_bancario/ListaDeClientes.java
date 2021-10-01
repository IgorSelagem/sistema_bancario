package sistema_bancario;

import java.util.ArrayList;

public class ListaDeClientes {
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public void cadastrar(Cliente cliente) {
		if(cliente != null) {
			clientes.add(cliente);
		}
	}
	
	public void remover(Cliente cliente) {
		clientes.removeIf(
			(elemento)->elemento.getCpf().equals(cliente.getCpf())
		);
	}
	public Cliente buscar(Cliente cliente) {
		for(Cliente elemento : this.clientes) {
			if(elemento.getCpf().equals(cliente.getCpf())) {
				return elemento;
			}
		}
		return null;
	}
	
	public void editar(Cliente cliente) {
		int indice = clientes.indexOf(this.buscar(cliente));
		if(indice != -1) {
			clientes.set(indice, cliente);
		}
	}
	
	public String listar() {
		StringBuilder builder = new StringBuilder();
		for(Cliente cliente : this.clientes) {
			builder.append(cliente.toString());
		}
		return builder.toString();
	}
}
