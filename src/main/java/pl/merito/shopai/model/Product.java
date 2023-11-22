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
    private String category;
    private String style;
    private String color;
    private String price;
    @Lob
    private byte[] image;
}