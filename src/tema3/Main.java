package tema3;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        //TODO 1: Declara o variabila de tip String
        String firstName;

        //TODO 2: Atribuie-i acestei variabile valoarea prenumelui tau
        firstName = "Robert";

        //TODO 3: Concateneaza aceasta variabila la textul printat mai jos
        System.out.println("Hello World " + firstName);
        //TODO 4: Ruleaza programul. Rezultatul pentru numele meu in consola ar trebui sa fie:
        //Hello World Laura

        //TODO: 5: Creaza o variabila de tip String si atribuie-i valoarea numelui tau de familie
        String lastName = "Szanto";
        //TODO 6: Creaza o variabila de tip Integer si atribuie-i valoarea varstei tale
        Integer age = 19;
        //TODO 7: Creaza o variabila de tip String si atribuie-i valoarea numelui orasului unde locuiesti
        String city = "Brasov";
        //TODO 8: Creaza o variabila de tip boolean si atribuie-i valoarea de adevar a afirmatiei "este casatorita?" (true/false)
        boolean esteCasatorita = false;
        //TODO 9: Foloseste System.out.println si concatenarea string-urilor pentru a afisa informatiile tale personale
        //Model pentru rezultatul in consola:
        //Nume: Antonache, Prenume: Laura, Varsta: 26, Oras: Bucuresti, casatorita: false
//        System.out.println("Nume: " + lastName + ", " + "Prenume: " + firstName + ", " + "Varsta: " +  age + ", " + "Oras: " + city + ", " + "casatorita: " + esteCasatorita);
        StringBuilder str = new StringBuilder();
        str.append("Nume: ");
        str.append(lastName);
        str.append(", ");
        str.append("Prenume: ");
        str.append(firstName);
        str.append(", ");
        str.append("Varsta: ");
        str.append(age);
        str.append(", ");
        str.append("Oras: ");
        str.append(city);
        str.append(", ");
        str.append("casatorit: ");
        str.append(esteCasatorita);

        String str1 = "sadf";
        str1 = str1.concat("231231231231");
        System.out.println("my string: " + str1);

        System.out.println(str.toString());

        //Creaza o noua clasa (New>Class) cu numele "Persoana"
        //TODO 10-13 vor fi realizate in aceasta noua clasa

        //TODO 10: Adauga variabilele declarate mai sus ca proprietati ale clasei:
        //nume, prenume, oras, varsta, casatorita

        //TODO 11: Faceti aceste proprietati private/Setati pentru toate aceste variabile modificatorul de acces "private"

        //TODO 12: Generati un constructor cu toti parametrii -> fie scrieti de la zero constructorul
        //fie folositi eclipse pentru a-l genera: Click Dreapta in editor> Source > Generate Constructor using Fields...


        //TODO 13: Generati getters/setters pentru toate variabilele (La fel ca TODO 12)

        //TODO 14: Inapoi in clasa Main creati o instanta pentru un obiect de tip Persoana folosind date la alegere pentru constructor
        Persoana robert = new Persoana("Robert", "Szanto", 19, "Brasov", false);

        //TODO 15: Printati instanta folosind System.out.println();
        System.out.println(robert);

        //TODO 16: Ati observat ca mesajul afisat nu ofera informatii despre valorile instantei si nu este "inteligibil"
        //In clasa Persoana, generati o metoda publica toString ce returneaza un String format din proprietatile clasei concatenate
        //astfel incat sa ofere un mesaj coerent (asemanator cu modelul de la TODO 9)

        //TODO 17: In clasa Main, declarati o noua variabila folosind un constructor fara niciun parametru
        Persoana edy = new Persoana();
        //TODO 18: HINT! Un constructor default fara parametrii este disponibil doar daca in clasa nu este definit un alt constructor
        //Adaugati un constructor cu niciun parametru in clasa Persoana pentru a rezolva eroarea din clasa Main

        //TODO 19: In Main Printati instanta fara valori initializate folosind System.out.println();
        System.out.println(edy);
        //TODO 20: Setati valorile proprietatilor acestei instante una cate una (folosind setterii) si afisati din nou instanta
        edy.setFirstName("Edi");
        edy.setLastName("Szanto");
        edy.setAge(24);
        edy.setCity("Brasov");
        System.out.println(edy);
        //TODO 21: In Persoana, adaugati o proprietate publica statica "curs" (fara a acorda o valoare acesteia)

        //TODO 22: Concatenati si valoarea acesteia cu mesajul din metoda toString()


        //TODO 23: Rulati clasa main pentru a vedea diferentele in mesajele afisate

        //TODO 24: In clasa Main acordati proprietatii curs valoarea "JAVA" fara a folosi niciuna dintre instante (inainte de afisarea celorlalte variabile - ex langa TODO 14)
        Persoana.curs = "JAVA";
        //TODO 25: Rulati din nou clasa main si observati diferentele

        //TODO 26: In clasa Persoana, adaugati o metoda ce este apelata atunci cand varsta persoanei se schimba (metoda ce aduna 1 la varsta curenta)

        //TODO 27: In clasa Main apelati metoda nou creata pentru una dintre instante si afisati instanta pentru a vedea rezultatele
        edy.setAge(5);
        System.out.println(edy.getAge());
        //TODO 28: In clasa Persoana, adaugati o metoda numita obtineIdentificator() ce returneaza un String

        //TODO 29: In metoda adaugata procesati numele si prenumele din una dintre instantele obiectului Persoane astfel incat sa returnati un ID formatat astfel:
        //andralaura_ANTONACHE
        //pentru nume: "Andra LAura", prenume: "Antonache" sau pentru nume = "Andra-LAURA   ", prenume = "antonache"
        //Folosind metodele puse la dispozitie de obiectele de tip String - descrise aici: https://www.w3schools.com/java/java_ref_string.asp

        //TODO 30: In Main, apelati metoda si afisati stringul returnat de aceasta

        System.out.println(edy.obtineIdentificator(edy.getFirstName(), edy.getLastName()));

        //TODO BONUS: Realizeaza un test Junit care sa valideze valorile unor instante ale clasei Persoana
    }

}
