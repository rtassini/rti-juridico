package br.com.rti.juridico.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.rti.juridico.models.Processo;

@Repository
@Transactional
public class ProcessoDAO {

	@PersistenceContext
	private EntityManager manager;
	
	public void gravar(Processo processo){
		manager.persist(processo);
	}

	public List<Processo> listar() {
		return manager.createQuery("select p from Processo p", Processo.class)
				.getResultList();
	}
}
