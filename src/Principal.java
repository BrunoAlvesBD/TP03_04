import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        /*Faça um programa que implemente uma classe Usuário com os atributos username,
        senha e email. A classe deve implementar um método que retorne se o username e a senha são válidos.
        Implemente a sobrecarga de construtor e uma sobrescrita, além dos gets e sets. Instancie um objeto e
        inicialize os seus atributos. O programa deverá fazer a leitura, a partir da console, do username e da
        senha e exibir se o login é válido ou não.
        Utilizar métodos e passagem de parâmetros, se necessários, para a leitura do username e da senha.*/

        Usuario usuario = new Usuario();
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu Email: ");
        usuario.setEmail(sc.nextLine());
        System.out.print("Digite o nome do usuario: ");
        usuario.setUserNome(sc.nextLine());
        System.out.print("Digite o senha: ");
        usuario.setSenha(sc.nextLine());
        sc.close();
        if (usuario.verificaUserNameESenha(usuario.getUserNome(), usuario.getSenha())) {
            System.out.println("login realizado com sucesso!");
        } else {
            System.out.println("login falhou");
        }

        System.out.println(usuario.toString());

    }

}
