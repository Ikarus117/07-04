import javax.swing.JOptionPane;

public class AtribuicaoTeste{

   public static void main(String [] args){
      
      String nome = "Icaro";
      int idade = 20;
      String materia = "POO";
      boolean pratica = true;
      
      JOptionPane.showMessageDialog(null,"Atribuicao: "+ atribuicao.getDados());
      
      Professor professor = new Professor(nome, idade);
      Disciplina disciplina = new Disciplina(materia, pratica);
      Atribuicao atribuicao = new Atribuicao(professor, disciplina);
   }
}