package jdbc.desafio;

import jdbc.Pessoa;

public class PessoaRepositoryTeste {

    public static void main(String[] args) {
        
        // addPessoa();
        // getPessoaById();
        //deletePessoa();
         
        //var deletePessoa = getPessoaById(19);   
        //deletePessoa(deletePessoa);
        //getPessoas();
        
        //Pessoa pessoa = new Pessoa("Fabio","26059224806");   
        //addPessoa(pessoa);

        getPessoas();
    }

    private static void getPessoas() {
        PessoaRepository pessoa = new PessoaRepository();

        var pessoas = pessoa.getPessoas();

        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }

    private static Pessoa getPessoaById(int id) {

        PessoaRepository pessoa = new PessoaRepository();
        System.out.println(pessoa.getPessoaByCodigo(id));
        
        return pessoa.getPessoaByCodigo(id);
    }

    private static void addPessoa(Pessoa pessoa) {

        if(pessoa == null) return;
        
        PessoaRepository rep = new PessoaRepository();

        rep.addPessoa(pessoa);
    }
    
    private static void deletePessoa(Pessoa pessoa) {
        if( pessoa == null ) return ;
        PessoaRepository rep = new PessoaRepository();

        rep.deletePessoa(pessoa);
    }

    private static void updatePessoa(Pessoa pessoa) {
        
       if( pessoa == null ) return ;
        
        PessoaRepository rep = new PessoaRepository();
        
        Pessoa upPessoa = getPessoaById(pessoa.getCodigo());
        
        upPessoa.setNome(pessoa.getNome());
        upPessoa.setCpf(pessoa.getCpf());

        rep.updatePessoa(upPessoa);

    }
}
