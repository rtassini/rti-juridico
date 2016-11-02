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

	public Processo find(Integer id) {
		return manager.createQuery("select distinct(p) from Processo p"
				+ " join fetch p.parte parte where p.id = :id", Processo.class)
			.setParameter("id", id)
			.getSingleResult();
//		return manager.find(Processo.class, id);
	}
}
