package giref.database;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class EnzymeService {
    
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("girefPU");
    private static final EntityManager em = emf.createEntityManager();
    
    public List<RestrictionEnzymeEntity> getAll() {
        
        List<RestrictionEnzymeEntity> enzymes;
        
        enzymes = em.createNativeQuery("SELECT * FROM restriction_enzymes", RestrictionEnzymeEntity.class).getResultList();
        
        emf.close();
        
        return enzymes;
    }
}
