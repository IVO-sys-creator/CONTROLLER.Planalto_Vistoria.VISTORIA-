package controller;

import dao.VistoriaDAO;
import model.Vistoria;

import java.sql.Date;
import java.util.List;


public class VistoriaController {
	
	private VistoriaDAO vistoriaDAO;
	
//CONSTRUTOR
	
	public VistoriaController() {
		this.vistoriaDAO = new VistoriaDAO();
	}
	public void cadastrarVistoria(int idVistoria, Date dataVistoria, String itensVerificados,
			String observacoes, int idAgendamento, int idFuncionario) {
		
		Vistoria vistoria = new Vistoria(idVistoria, dataVistoria, itensVerificados, observacoes, idAgendamento, idFuncionario);
		
		vistoriaDAO.salvar(vistoria);
	}
	
	public void atualizarVistoria(Vistoria vistoria) {
		vistoriaDAO.atualizar(vistoria);
	}
	
	public void excluirVistoria(int id) {
		vistoriaDAO.excluir(id);
	}
	
	public Vistoria buscarVistoria(int id) {
		return vistoriaDAO.buscarPorId(id);
	}
	
	public List<Vistoria> listarVistorias() {
		return vistoriaDAO.listar();
	}

}
