package hn.restaurante.restaurante.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.restaurante.restaurante.modelos.Ingrediente;

public interface repositorioIngrediente extends JpaRepository<Ingrediente, Integer> {
}
