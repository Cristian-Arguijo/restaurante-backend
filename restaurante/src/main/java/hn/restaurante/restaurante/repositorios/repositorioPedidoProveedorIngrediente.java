package hn.restaurante.restaurante.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.restaurante.restaurante.modelos.PedidoProveedorIngrediente;
import hn.restaurante.restaurante.modelos.PedidoProveedorIngredienteId;

public interface repositorioPedidoProveedorIngrediente extends JpaRepository<PedidoProveedorIngrediente, PedidoProveedorIngredienteId> {
}
