package br.com.rti.juridico.daos;

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
}
