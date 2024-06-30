package mgs;

import java.util.Date;

public class Funcionario {
    private int id;
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;
    private String alergias;
    private String problemasMedicos;
    private String contatoEmergenciaNome;
    private String contatoEmergenciaTelefone;
    private String contatoEmergenciaEmail;

    // Construtor
    public Funcionario(int id, String nome, Date dataNascimento, String cpf, String telefone, String email, String endereco, String alergias, String problemasMedicos, String contatoEmergenciaNome, String contatoEmergenciaTelefone, String contatoEmergenciaEmail) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.alergias = alergias;
        this.problemasMedicos = problemasMedicos;
        this.contatoEmergenciaNome = contatoEmergenciaNome;
        this.contatoEmergenciaTelefone = contatoEmergenciaTelefone;
        this.contatoEmergenciaEmail = contatoEmergenciaEmail;
    }

    // Getters e Setters
    public int getId() { return id; }
    public String getNome() { return nome; }
    public Date getDataNascimento() { return dataNascimento; }
    public String getCpf() { return cpf; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
    public String getEndereco() { return endereco; }
    public String getAlergias() { return alergias; }
    public String getProblemasMedicos() { return problemasMedicos; }
    public String getContatoEmergenciaNome() { return contatoEmergenciaNome; }
    public String getContatoEmergenciaTelefone() { return contatoEmergenciaTelefone; }
    public String getContatoEmergenciaEmail() { return contatoEmergenciaEmail; }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Data de Nascimento: " + dataNascimento + "\n" +
                "CPF: " + cpf + "\n" +
                "Telefone: " + telefone + "\n" +
                "Email: " + email + "\n" +
                "Endereço: " + endereco + "\n" +
                "Alergias: " + alergias + "\n" +
                "Problemas Médicos: " + problemasMedicos + "\n" +
                "Contato de Emergência: " + contatoEmergenciaNome + "\n" +
                "Telefone de Emergência: " + contatoEmergenciaTelefone + "\n" +
                "Email de Emergência: " + contatoEmergenciaEmail + "\n";
    }
}
