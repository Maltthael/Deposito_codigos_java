

 class Professor extends Funcionario{
    String curso;
    void setCurso(String c){
        curso = c;
    }
    Professor(String n, int m, float s, String c){
        super(n,m,s);
        curso = c;
    }
    String getCurso(){
        return curso;
    }

    
     public String toString(){
           String saida = "Nome....:" + nome + "\n";
           saida += "Matricula" + matricula + "\n";
           saida += "Salario..:" + salario + "\n";
           saida += "Curso...:" + curso;
           return saida;
           
       }
}
