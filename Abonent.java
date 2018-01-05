//КОМПАРАТОР ,сортировка КОЛЕКЦИЙ
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Abonent {
    private String imya;
    private String familiya;
    private boolean pilgy;
    private long nomer_telefona;
    private LocalDate dateofbirth;
    Abonent(){
        imya = "";
        familiya = "";
        pilgy = false;
        nomer_telefona = 0;
        dateofbirth = LocalDate.of(1998,04,12);
    }
    Abonent(String imya,String familiya, boolean pilgy, long nomer_telefona, LocalDate d){
        this.imya = imya;
        this.familiya = familiya;
        this.pilgy = pilgy;
        this.nomer_telefona = nomer_telefona;
        this.dateofbirth = d;

    }
    public void setImya(String imya) {
        this.imya = imya;
    }
    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }
    public void setPilgy(boolean pilgy) {
        this.pilgy = pilgy;
    }
    public void setNomer_telefona(long nomer_telefona) {
        this.nomer_telefona = nomer_telefona;
    }
    public void setDateofbirth(LocalDate d){
        this.dateofbirth = d;
    }

    public String getImya() {
        return imya;
    }
    public String getFamiliya() {
        return familiya;
    }
    public boolean getPilgy(){
        return pilgy;
    }
    public long getNomer_telefona() {
        return nomer_telefona;
    }
    public LocalDate getDateofbirth(){
        return  this.dateofbirth;
    }

    public boolean IfPilgoviy(){
        return this.pilgy;
    }
    public boolean IfPensioner(){
        Period p = Period.between(this.dateofbirth, LocalDate.now());
        return p.getYears() >= 60;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abonent abonent = (Abonent) o;
        return pilgy == abonent.pilgy &&
                nomer_telefona == abonent.nomer_telefona &&
                Objects.equals(imya, abonent.imya) &&
                Objects.equals(familiya, abonent.familiya) &&
                Objects.equals(dateofbirth, abonent.dateofbirth);
    }

    @Override
    public int hashCode() {

        return Objects.hash(imya, familiya, pilgy, nomer_telefona, dateofbirth);
    }

    public static void main(String args[]){
       /* Abonent A = new Abonent("Vitaly", "Sand",false,03722424, LocalDate.of(1998,12,14));
        A.IfPensioner();*/
    }
}
