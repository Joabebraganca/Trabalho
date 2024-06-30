package mgs;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private Map<String, Funcionario> funcionarios;

    public Database() {
        funcionarios = new HashMap<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.put(funcionario.getCpf(), funcionario);
    }

    public Funcionario consultarFuncionario(String cpf) {
        return funcionarios.get(cpf);
    }
}

