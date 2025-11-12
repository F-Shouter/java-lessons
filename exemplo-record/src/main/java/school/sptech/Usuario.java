package school.sptech;

import java.util.Objects;

public record Usuario(
        Integer id,
        String nome,
        String email,
        String telefone,
        String senha
) {
//    public Usuario(String senha, String email, String nome, Integer id) {
//        this(id, nome, email, "", senha);
//    }
//
//    @Override
//    public Integer id() {
//        return id;
//    }
//
//    @Override
//    public String nome() {
//        return nome;
//    }
//
//    @Override
//    public String email() {
//        return email;
//    }
//
//    @Override
//    public String telefone() {
//        return telefone;
//    }
//
//    @Override
//    public String senha() {
//        return senha;
//    }
//
//    @Override
//    public String toString() {
//        return "Usuario{" +
//                "id=" + id +
//                ", nome='" + nome + '\'' +
//                ", email='" + email + '\'' +
//                ", telefone='" + telefone + '\'' +
//                ", senha='" + senha + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Usuario usuario = (Usuario) o;
//        return Objects.equals(id, usuario.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(id);
//    }
}
