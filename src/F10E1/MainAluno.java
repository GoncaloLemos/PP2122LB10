package F10E1;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * @author Pedro Simões [30007732], Gonçalo Lemos [30007523], LEI, D
 */
public class MainAluno {
    public static void main(String[] args) {
        //A.
        List<Aluno> student_list = new ArrayList<>();
        student_list.add(new Aluno(1, "Ana Silva", 8));
        student_list.add(new Aluno(2, "João Carlos", 13));
        student_list.add(new Aluno(3, "Joana Maia", 18));
        student_list.add(new Aluno(4, "José Helder", 9));
        student_list.add(new Aluno(5, "Vera Camargo", 10));
        student_list.add(new Aluno(6, "Ana Dias", 18));
        student_list.add(new Aluno(7, "Paulo de Tarso", 10));
        student_list.add(new Aluno(8, "Eva Sousa", 8));
        //B.
        Consumer<Aluno> print_name = a -> System.out.println("Id: " + a.getId() + " Nome: " + a.getNome());
        //C.
        student_list.forEach(print_name);
        //D.
        List<Aluno> student_list2 = new ArrayList<>(student_list);
        Consumer<Aluno> greeting_print = a -> System.out.println("Olá.");
        Consumer<Aluno> name_print = a -> System.out.println(a.getNome());
        student_list2.forEach(greeting_print.andThen(name_print));
        //E.
        Predicate<Aluno> check_negative = ((Aluno a) -> a.getNota() < 10);
        //F.
        student_list2.removeIf(check_negative);
        //G.
        UnaryOperator<Aluno> grade_increase = MainAluno::increase_grade;
        //H.
        student_list2.stream().map(Aluno::toString).forEach(System.out::println);
        //I.
        student_list.replaceAll(grade_increase);
        student_list.forEach(System.out::println);
    }

    /**
     *
     * @param a
     * @return
     */
    @Contract("_ -> param1")
    private static @NotNull Aluno increase_grade(Aluno a){
        a.setNota(a.getNota() + 1);
        return a;
    }
}
