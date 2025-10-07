package Dependencia;

public class ImpressoraMain {
	public static void main(String[] args) {
		
		Documento documento = new Documento("teste1");
		Impressora impressora = new Impressora();
		
		documento.setTexto("teste");
		impressora.imprimir(documento);
	}
}

/* Sistema Academico Básico
 * 1. é necessário ter a informação de qual curso que o aluno está cursando
 * 2. Curso é estruturado em fases, e cada um dessas fases tem suas disciplinas ( rol ) 
 * 3. A dsciplina pode ser lecionada por 1 até 4 professores 
 * 4. É preciso ter um controle dos alunos e suas frequências 
 * 5. É necessário saber qual professor fez o registro da frequencia e da avaliação
 * 6. Como o curso vai progredindo, preciso saber quais disciplinas já foram ofertadas
 * 7. Um aluno tem a possibilidade de se matricular em fases diferentes ( sem pré requisitos ) 
 * 8. Preciso saber a situação do aluno em uma determinada disciplina ( Aprovado, Reprovado, Reprovado por falta, trancado, Cancelado ) 

 */

