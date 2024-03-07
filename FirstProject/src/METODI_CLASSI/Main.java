package METODI_CLASSI;

public class Main {
    public static void main(String[] args) {
Student salvatore= new Student("Salvatore", "Malanchino", TipoSudent.FRONTEND);

Student luca= new Student("Luca","Provenzanno", TipoSudent.BACKEND);
salvatore.sayHello();
luca.sayHello();
    }
}
