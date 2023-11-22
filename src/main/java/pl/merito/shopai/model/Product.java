package pl.merito.shopai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue
    private UUID uuid;
    private String name;
    private String description;
    private String price;
    private Integer quantity;
    @Lob
    private byte[] image;

}