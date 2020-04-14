public class Disciplina{

   private String materia;
   private boolean pratica;
   
   public Disciplina(String materia, boolean pratica){
      this.materia=materia;
      this.pratica=pratica;
   }
      
   public String getMateria(){
      return materia;
   }
   
   public boolean getPratica(){
      return pratica;
   }
   
   public void setMateria(String materia){
      this.materia=materia;
   }
   
   public void setPratica(boolean pratica){
      this.pratica=pratica;
   }
   public String getDados(){
      return "Disciplina: " +materia+ ", " +pratica;
   }
}