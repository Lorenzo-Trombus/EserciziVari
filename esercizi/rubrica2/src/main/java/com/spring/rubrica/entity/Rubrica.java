package com.spring.rubrica.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Rubrica {

    @Id
    private int idRubrica;

    private String proprietario;
    private int annoCreazione;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "FK_Rubrica")
    private List<Contatto> contatti = new ArrayList<>();

    public Rubrica() {
        // TODO Auto-generated constructor stub
    }

    public Rubrica(int idRubrica, String proprietario, int annoCreazione) {
        super();
        this.idRubrica = idRubrica;
        this.proprietario = proprietario;
        this.annoCreazione = annoCreazione;
    }

    public int getIdRubrica() {
        return idRubrica;
    }

    public void setIdRubrica(int idRubrica) {
        this.idRubrica = idRubrica;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public int getAnnoCreazione() {
        return annoCreazione;
    }

    public void setAnnoCreazione(int annoCreazione) {
        this.annoCreazione = annoCreazione;
    }

    public List<Contatto> getContatti() {
        return contatti;
    }

    public void setContatti(List<Contatto> contatti) {
        this.contatti = contatti;
    }

    // aggiungo qualche metodo di business
    public void aggiungiContatto(Contatto contatto) {
        contatti.add(contatto);
    }

}