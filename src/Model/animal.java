
package Model;


public class animal {
    
    String id_animal,raca,cor,tamanho,obs,nome_animal,data_animal;

    public animal(String id_animal, String raca, String cor, String tamanho, String obs, String nome_animal, String data_animal) {
        this.id_animal = id_animal;
        this.raca = raca;
        this.cor = cor;
        this.tamanho = tamanho;
        this.obs = obs;
        this.nome_animal = nome_animal;
        this.data_animal = data_animal;
    }

    public String getId_animal() {
        return id_animal;
    }

    public void setId_animal(String id_animal) {
        this.id_animal = id_animal;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getNome_animal() {
        return nome_animal;
    }

    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }

    public String getData_animal() {
        return data_animal;
    }

    public void setData_animal(String data_animal) {
        this.data_animal = data_animal;
    }
    
    
}
