package br.com.levelup.programa.modelo;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "USER")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false, length = 50)
    private String name;

    @Column(name = "SENHA", length = 100, nullable = false)
    private String hashsenha;


    public User() {
    }

    public User(Long id, String name, String hashsenha) {
        this.id = id;
        this.name = name;
        this.hashsenha = hashsenha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHashsenha() {
        return hashsenha;
    }

    public void setHashsenha(String hashsenha) {
        this.hashsenha = hashsenha;
    }

    //
//    private User(@NotNull String name, @NotNull String hashsenha) {
//        this.name = Objects.requireNonNull(name, "name must not be null");
//        this.hashsenha = Objects.requireNonNull(hashsenha, "password must not be null");
//    }
//
//
//    public static class UserrBuilder {
//
//        private User pessoa;
//
//        public void UserConstructor(@NotNull String name, @NotNull String hashsenha) {
//            this.pessoa = new User(name, hashsenha);
//        }
//
//
//        public User build() {
//            return this.pessoa;
//        }
//
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//    public String getSenha() {return hashsenha;}


}