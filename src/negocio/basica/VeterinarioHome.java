package negocio.basica;
// Generated 22/09/2011 20:56:28 by Hibernate Tools 3.2.0.CR1


import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Veterinario.
 * @see negocio.basica.Veterinario
 * @author Hibernate Tools
 */
public class VeterinarioHome {

    private static final Log log = LogFactory.getLog(VeterinarioHome.class);

    private final SessionFactory sessionFactory = getSessionFactory();
    
    protected SessionFactory getSessionFactory() {
        try {
            return (SessionFactory) new InitialContext().lookup("SessionFactory");
        }
        catch (Exception e) {
            log.error("Could not locate SessionFactory in JNDI", e);
            throw new IllegalStateException("Could not locate SessionFactory in JNDI");
        }
    }
    
    public void persist(Veterinario transientInstance) {
        log.debug("persisting Veterinario instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(Veterinario instance) {
        log.debug("attaching dirty Veterinario instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Veterinario instance) {
        log.debug("attaching clean Veterinario instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(Veterinario persistentInstance) {
        log.debug("deleting Veterinario instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Veterinario merge(Veterinario detachedInstance) {
        log.debug("merging Veterinario instance");
        try {
            Veterinario result = (Veterinario) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Veterinario findById( int id) {
        log.debug("getting Veterinario instance with id: " + id);
        try {
            Veterinario instance = (Veterinario) sessionFactory.getCurrentSession()
                    .get("negocio.basica.Veterinario", id);
            if (instance==null) {
                log.debug("get successful, no instance found");
            }
            else {
                log.debug("get successful, instance found");
            }
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    public List findByExample(Veterinario instance) {
        log.debug("finding Veterinario instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("negocio.basica.Veterinario")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        }
        catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    } 
}

