package pl.merito.shopai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.merito.shopai.model.Product;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}