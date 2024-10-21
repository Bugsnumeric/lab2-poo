public class Doctor {
    private String nume;
    int nrRatinguri;
    Integer[] ratings;
    Doctor(String nume){
        this.nume = nume;
        this.medieRating = 0.0;
        this.ratings = new Integer[0];
        this.nrRatinguri = 0;
    }
    Doctor(){
        this.ratings = new Integer[0];
        this.medieRating = 0.0;
        this.nrRatinguri = 0;
    }
    public void setNameDoc(String nume) {
    }
    public String getNameDoc() {
        return nume;
    }
    double medieRating;
    public void adaugaRating(int rating) {
        Integer[] newRatings = new Integer[ratings.length + 1];
        for (int i = 0; i < ratings.length; i++) {
            newRatings[i] = ratings[i];
        }
        newRatings[ratings.length] = rating;
        this.ratings = newRatings;
        double media = 0.0;
        for (int i : ratings) {
            media += i;
        }
        this.nrRatinguri = ratings.length;
        this.medieRating = media / nrRatinguri;
    }
    public String afisareDoctor() {
        return "Doctor: " + this.nume + ", Medie Rating: " + this.medieRating;
    }
}
class Pacient {
    private String nume;
    private Integer id;
    private static int id_contor = 1;

    Pacient(String nume) {
        this.nume = nume;
        this.id = id_contor++;
    }

    Pacient() {
        this.id = id_contor++;
    }

    public void setNamePac(String nume) {
        this.nume = nume;
    }

    public String getNamePac() {
        return nume;
    }

    public Integer getIdPac() {
        return id;
    }

    public String afisarePacient() {
        return "Pacient ID: " + this.id + ", Nume: " + this.nume;
    }
}
