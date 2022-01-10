package bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonRootName;


@Entity
@Table(name = "salle")
@JsonRootName(value = "Salle")
public class Salle {
	@Id
	@Column(name = "salle_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int salle_id;
    private int capacité;
	@Column(name = "numéro_salle")
    private int numero_salle;
	@Column(name = "équipement_3D")
    private int equipement_3D;
    private Integer cinemas_id;

    public Salle(int salle_id, int capacité, int numero_salle, int equipement_3D, int cinemas_id) {
        this.salle_id= salle_id;
        this.capacité = capacité;
        this.numero_salle = numero_salle;
        this.equipement_3D = equipement_3D;
        this.cinemas_id = cinemas_id;
    }

    public Salle() {

    }

    @JsonGetter("SalleId")
    public int getSalle_id() {
        return salle_id;
    }

    public void setSalle_id(int salle_id) {
        this.salle_id = salle_id;
    }
    @JsonGetter("Capacité")
    public int getCapacité() {
        return capacité;
    }

    public void setCapacité(int capacité) {
        this.capacité = capacité;
    }

    @JsonGetter("NuméroSalle")
    public int getNumero_salle() {
        return numero_salle;
    }

    public void setNumero_salle(int numero_salle) {
        this.numero_salle = numero_salle;
    }

    @JsonGetter("Equipement3D")
    public int getEquipement_3D() {
        return equipement_3D;
    }

    public void setEquipement_3D(int equipement_3D) {
        this.equipement_3D = equipement_3D;
    }

    @JsonGetter("CinemasId")
    public Integer getCinemas_id() {
        return cinemas_id;
    }

    public void setCinemas_id(Integer cinemas_id) {
        this.cinemas_id = cinemas_id;
    }

    @Override
    public String toString() {
        return "Salle{" +
                "salle_id=" + salle_id +
                ", capacité=" + capacité +
                ", numero_salle=" + numero_salle +
                ", equipement_3D=" + equipement_3D +
                ", cinemas_id=" + cinemas_id +
                '}';
    }
}
