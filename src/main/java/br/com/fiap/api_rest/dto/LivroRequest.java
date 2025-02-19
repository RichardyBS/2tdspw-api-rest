package br.com.fiap.api_rest.dto;

import br.com.fiap.api_rest.model.Categoria;
import jakarta.validation.constraints.*;

public class LivroRequest {

    @NotBlank(message = "O titulo não pode ser Vazio :)" )
    @Size(min = 3,max = 254, message = "O titulo deve ter entre 3 e 254 caracteres")
    private String titulo;
    private String autor;
    @NotBlank(message = "O titulo não pode ser Vazio :)" )
    @Size(min = 3,max = 150, message = "O titulo deve ter entre 3 e 150 caracteres")
    private int preco;
    @Min(value = 1, message = "O preço deve ser no minimo 1")
    @Max(value = 99, message = "O valor maximo pode ser de 99")
    @NotNull(message = "A categoria e obrigatoria")
    private Categoria categoria;
    @Pattern(regexp = "^970\\d{10}$|^970\\d{7}$");
    private String isbn;


    public String getTitulo(){
        System.out.println("Alguma\nCoisa");
        return titulo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
