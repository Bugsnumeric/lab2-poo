public class Student {
    long nrMatricol;
    String nume;
    String prenume;
    double mediaFinala;
    public long getNrMatricol() {
        return nrMatricol;
    }
    public void setNrMatricol(long nrMatricol) {
        this.nrMatricol = nrMatricol;
    }
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public String getPrenume() {
        return prenume;
    }
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    public double getMediaFinala() {
        return mediaFinala;
    }
    public void setMediaFinala(double mediaFinala) {
        this.mediaFinala = mediaFinala;
    }
    public String detaliiStudenti() {
        return "nrMatricol: "+this.nrMatricol+", nume: "+this.nume+", prenume: "+this.prenume+ ", mediaFinala: "+this.mediaFinala;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.setNrMatricol(1);
        s1.setNume("Ion");
        s1.setPrenume("Ionescu");
        s1.setMediaFinala(9.8);
        s2.setNrMatricol(2);
        s2.setNume("Ana");
        s2.setPrenume("Pavel");
        s2.setMediaFinala(8.9);
        s3.setNrMatricol(3);
        s3.setNume("Marius");
        s3.setPrenume("Latos");
        s3.setMediaFinala(7.8);
        Student[] vector_medie = new Student[3];
        double medie = 0;
        vector_medie[0] = s1;
        vector_medie[1] = s2;
        vector_medie[2] = s3;
        for (int i = 0; i < vector_medie.length; i++) {
            medie += vector_medie[i].getMediaFinala();
        }
        medie = medie / vector_medie.length;
        System.out.println(s1.detaliiStudenti());
        System.out.println(s2.detaliiStudenti());
        System.out.println(s3.detaliiStudenti());
        System.out.println(medie);

        //task 2
        Pacient[] vector_pac = new Pacient[3];
        Pacient p1 = new Pacient("Ioana");
        Pacient p2 = new Pacient("Ana");
        Pacient p3 = new Pacient("Marius");
        vector_pac[0] = p1;
        vector_pac[1] = p2;
        vector_pac[2] = p3;
        for (int i = 0; i < vector_pac.length; i++) {
            System.out.println(vector_pac[i].afisarePacient());
        }
        Doctor[] vector_doc = new Doctor[3];
        vector_doc[0] = new Doctor("Ana");
        vector_doc[1] = new Doctor("Marius");
        vector_doc[2] = new Doctor("Latos");
        vector_doc[0].adaugaRating(8);
        vector_doc[0].adaugaRating(7);
        vector_doc[0].adaugaRating(6);
        vector_doc[1].adaugaRating(8);
        vector_doc[1].adaugaRating(10);
        vector_doc[1].adaugaRating(9);
        vector_doc[2].adaugaRating(3);
        vector_doc[2].adaugaRating(4);
        vector_doc[2].adaugaRating(9);
        for (Doctor doctor : vector_doc) {
            System.out.println(doctor.afisareDoctor());
        }

    }
}