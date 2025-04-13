package com.geladaExpress.CadastroDeFuncionarios.Cargos;

import com.geladaExpress.CadastroDeFuncionarios.Funcionarios.UsuarioModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cargos")
public class CargoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private double sal;

    @OneToMany(mappedBy = "cargo")
    private List<UsuarioModel> usuarios;

    public CargoModel() {
    }

    public CargoModel(String nome, double sal) {
        this.nome = nome;
        this.sal = sal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
