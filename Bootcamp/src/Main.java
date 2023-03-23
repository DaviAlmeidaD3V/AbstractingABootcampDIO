import java.time.LocalDate;

import br.com.dio.challenge.domain.Bootcamp;
import br.com.dio.challenge.domain.Course;
import br.com.dio.challenge.domain.Developer;
import br.com.dio.challenge.domain.Mentoring;

public class Main {
    public static void main(String[] args) {
        
        System.out.println();

        Course courseJava = new Course();

        courseJava.setTitle("Course Java Oriented Objects");
        courseJava.setDescription("Java OOP Beginner to Intermediary");
        courseJava.setWorkload(10);

        Course dataStructure = new Course();
        dataStructure.setTitle("data Structure and algorithm");
        dataStructure.setDescription("Data Structure, learn queues, stacks, set, and trees. ");
        dataStructure.setWorkload(10);



        Mentoring mentoringJava = new Mentoring();
        mentoringJava.setTitle("Java OOP, Solid, and Conventions 6.0");
        mentoringJava.setDescription("Prof Rick Deniz, and Louis Van Glauss, Experients Software Developers in Language Java");
        mentoringJava.setDate(LocalDate.now());



        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setName("Java Dio Bank Pan Developer ");
        bootcamp.setDescription("A Learning Immersion in the java Programming language with code challenges, lives and projects");


        bootcamp.getContents().add(courseJava);
        bootcamp.getContents().add(dataStructure);
        bootcamp.getContents().add(mentoringJava);


        Developer dev = new Developer();
        dev.setName("Davi Almeida");
        dev.registerBootcamp(bootcamp);
        System.out.println("Grid Contents" +  dev.getWritedContents() + " Final Date "   + bootcamp.getFinalDate());
        dev.advance();
        dev.advance();
        dev.advance();
        System.out.println();
        System.out.println("Conclude Contents" + dev.getConcludeContents() +  " Experience " + dev.computeTotalExperience());

        System.out.println();
        System.out.println();
        System.out.println();

        Developer dev2 = new Developer();
        dev2.registerBootcamp(bootcamp);
        dev.advance();
        dev2.setName("João Barros");
        System.out.println("Grid Contents" +  dev2.getWritedContents() +  " Experience " + dev2.computeTotalExperience() +   "  Final Date " + bootcamp.getFinalDate());
        System.out.println();
        System.out.println("Conclude Contents" + dev2.getConcludeContents() +  " Experience " + dev2.computeTotalExperience());

    }
}
