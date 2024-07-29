import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
    private List<Contato> contatos;

    public AgendaTelefonica() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso!");
    }

    public void removerContato(String nome) {
        Contato contatoRemover = buscarContato(nome);
        if (contatoRemover != null) {
            contatos.remove(contatoRemover);
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado!");
        }
    }

    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        System.out.println("Contato não encontrado!");
        return null;
    }

    public void atualizarContato(String nome, Contato novoContato) {
        Contato contatoAtualizar = buscarContato(nome);
        if (contatoAtualizar != null) {
            contatoAtualizar.setNome(novoContato.getNome());
            contatoAtualizar.setNumero(novoContato.getNumero());
            System.out.println("Contato atualizado com sucesso!");
        } else {
            System.out.println("Contato não encontrado!");
        }
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
        }
    }
}

