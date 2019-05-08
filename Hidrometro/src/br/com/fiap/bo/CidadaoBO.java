package br.com.fiap.bo;

import java.util.ArrayList;

import br.com.fiap.bean.CidadaoTO;

public class CidadaoBO {
	
	private static CidadaoBO cidadaoBO;
	private static ArrayList<CidadaoTO> lista = new ArrayList<CidadaoTO>();
	
	public static CidadaoBO getInstance() {
		if (cidadaoBO == null){
			cidadaoBO = new CidadaoBO();
		}
		
		return cidadaoBO;
	}
	
	public CidadaoBO() {
		lista.add(new CidadaoTO(123, "João da Silva", "Av paulista", "38144478920", 963));
		lista.add(new CidadaoTO(456, "Antonio de Oliveira", "Rua Vaticano", "98745632170", 852));
		lista.add(new CidadaoTO(789, "Maria de Jesus", "Rua da Consolação", "97864532195", 741));
	}
	
	public static CidadaoTO buscar(int codigo) {
		for(CidadaoTO cidadao : lista) {
			if(cidadao.getCodigo() == codigo) {
				return cidadao;
			}
		}
		
		return null;
	}

	public CidadaoTO cadastrar(CidadaoTO cidadao) {
		lista.add(cidadao);		
		return cidadao;
	}

}
