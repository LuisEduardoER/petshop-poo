package negocio.basica;
// Generated 22/09/2011 20:56:27 by Hibernate Tools 3.2.0.CR1



/**
 * AgendaHasServicoId generated by hbm2java
 */
public class AgendaHasServicoId  implements java.io.Serializable {


     private int agendaCodAgenda;
     private int servicoCodServico;

    public AgendaHasServicoId() {
    }

    public AgendaHasServicoId(int agendaCodAgenda, int servicoCodServico) {
       this.agendaCodAgenda = agendaCodAgenda;
       this.servicoCodServico = servicoCodServico;
    }
   
    public int getAgendaCodAgenda() {
        return this.agendaCodAgenda;
    }
    
    public void setAgendaCodAgenda(int agendaCodAgenda) {
        this.agendaCodAgenda = agendaCodAgenda;
    }
    public int getServicoCodServico() {
        return this.servicoCodServico;
    }
    
    public void setServicoCodServico(int servicoCodServico) {
        this.servicoCodServico = servicoCodServico;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AgendaHasServicoId) ) return false;
		 AgendaHasServicoId castOther = ( AgendaHasServicoId ) other; 
         
		 return (this.getAgendaCodAgenda()==castOther.getAgendaCodAgenda())
 && (this.getServicoCodServico()==castOther.getServicoCodServico());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getAgendaCodAgenda();
         result = 37 * result + this.getServicoCodServico();
         return result;
   }   


}


