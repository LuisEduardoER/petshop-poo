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
 * Home object for domain model class AgendaHasServico.
 * @see negocio.basica.AgendaHasServico
 * @author Hibernate Tools
 */
public class AgendaHasServicoHome {

    private static final Log log = LogFactory.getLog(AgendaHasServicoHome.class);

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
    
    public void persist(AgendaHasServico transientInstance) {
        log.debug("persisting AgendaHasServico instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(AgendaHasServico instance) {
        log.debug("attaching dirty AgendaHasServico instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(AgendaHasServico instance) {
        log.debug("attaching clean AgendaHasServico instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(AgendaHasServico persistentInstance) {
        log.debug("deleting AgendaHasServico instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public AgendaHasServico merge(AgendaHasServico detachedInstance) {
        log.debug("merging AgendaHasServico instance");
        try {
            AgendaHasServico result = (AgendaHasServico) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public AgendaHasServico findById( negocio.basica.AgendaHasServicoId id) {
        log.debug("getting AgendaHasServico instance with id: " + id);
        try {
            AgendaHasServico instance = (AgendaHasServico) sessionFactory.getCurrentSession()
                    .get("negocio.basica.AgendaHasServico", id);
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
    
    public List findByExample(AgendaHasServico instance) {
        log.debug("finding AgendaHasServico instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("negocio.basica.AgendaHasServico")
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

