package METODI_CLASSI;

import java.util.Objects;
import java.util.Random;

public class Student {
    //LISTA ATTRIBUTI
   private int id;
 private  String name;
   private String surname;
   private TipoSudent tipo;
    //LISTA COOSTRUTTORI
    //se nonn dichiaro nnessun costruttore, ci sarà sempre
    //quello vuoto come default
    public Student(String name,  String surname , TipoSudent tipo){
        Random rndm= new Random();
        this.name= name;
        this.surname= surname;
        this.id= rndm.nextInt(1,10000);
        this.tipo= tipo;
    }
    //GETTERS & SETTERS
    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name.length() < 3){
            System.out.println("il nome deve essere più lungo di 2 caratteri");
        }else{this.name=name;}
    }
    //LISTA METODI
   private void sayHello(){
        System.out.println("ciao sono " +this.name + " "+ this.surname + " "+ this.id);
    }
//TASTO DESTRO->GENERATE->tostring()
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
    //TASTO DESTRO->GENERATE->toequals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//in questo caso this si riferisce al primo nome e "o" a quello con cui lo deve comparare
        if (o == null || getClass() != o.getClass()) return false;// se "o" è null oppure appartengono a classi diverse aòlora è false
        Student student = (Student) o;//(Student) è  un casting  esplicito
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }


}

