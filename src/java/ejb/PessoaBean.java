package ejb;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import model.Pessoa;

@Stateless
public class PessoaBean {

    @PersistenceContext(unitName = "ejbPU")
    private EntityManager em;

    public void salvarPessoa(String nome) {
        Pessoa p = new Pessoa();
        p.setNome(nome);
        em.persist(p);
    }
}
