package Desafio;

public class Usuario {
    private final String login;
    private final String senha;
    String nome;

    public Usuario(final String login, final String senha) {
        this.login = login;
        this.senha = senha;
    }
    public String getLogin(){
        return login;
    }

    protected String getSenha(){
        return senha;
    }

    static class getLogin {

        public getLogin() {
        }
    }

    static class getSenha {

        public getSenha() {
        }
    }
