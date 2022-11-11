import java.time.LocalDate;

import com.bootcamp.dominio.Bootcamp;
import com.bootcamp.dominio.Curso;
import com.bootcamp.dominio.Dev;
import com.bootcamp.dominio.Mentoria;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Pratic Bootcamp!");

        Curso cursoJavaPoo = new Curso("Introdução à POO em Java", "Conceitos de POO em Java", 12);

        Mentoria mentoriaJavaPoo = new Mentoria("Mentoria Java P00", "Dar mentoria sobre Java POO", LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java");
        bootcampJava.setDescricao("Descrição do bootcamp java");
        bootcampJava.getConteudos().add(mentoriaJavaPoo);
        bootcampJava.getConteudos().add(cursoJavaPoo);

        Dev ana = new Dev();
        ana.setNome("Ana Maria");
        ana.inscreverBootcamp(bootcampJava);
        System.out.println(ana);
        System.out.println("Conteudo inscritos: "+ana.getConteudosInscritos());
        System.out.println("Conteudo finalizados: "+ana.getConteudosConcluidos());
        System.out.println("XP Total de Ana: "+ana.calcularTotalXp());
        System.out.println("Progredindo...");
        ana.progredir();
        System.out.println("Conteudo inscritos: "+ana.getConteudosInscritos());
        System.out.println("Conteudo finalizados: "+ana.getConteudosConcluidos());
        System.out.println("XP Total de Ana: "+ana.calcularTotalXp());
        System.out.println("Progredindo...");
        ana.progredir();
        System.out.println("Conteudo inscritos: "+ana.getConteudosInscritos());
        System.out.println("Conteudo finalizados: "+ana.getConteudosConcluidos());
        System.out.println("XP Total de Ana: "+ana.calcularTotalXp());
    }
}
