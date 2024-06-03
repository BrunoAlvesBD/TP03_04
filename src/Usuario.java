public class Usuario {
    private String userNome;
    private String senha;
    private String email;

    public Usuario(String userNome, String senha, String email) {
        this.userNome = userNome;
        this.senha = senha;
        this.email = email;
    }
    public Usuario(){

    }

    public String getUserNome() {
        return userNome;
    }

    public void setUserNome(String userNome) {
        this.userNome = userNome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //-----------------------------------------------
    public boolean verificaUserNameESenha(String nome, String senha){
        if(nome.isEmpty() || senha.isEmpty()){
            System.out.println("Erro, nome e senha não podem estar vazios");
            return false;
        }
        else if(nome.equals(senha)){
            System.out.println("Erro, nome e senha iguais");
            return false;
        } else if (nome.length() < 5) {
            System.out.println("Erro, nome de usuário deve ter no mínimo 5 caracteres");
            return false;
        } else if (senha.length() < 8) {
            return false;
        }
        return true;
    }
    //-----------------------------------------------
    @Override
    public String toString() {
        return getUserNome() + " " + getSenha() + " " + getEmail();
    }
}
