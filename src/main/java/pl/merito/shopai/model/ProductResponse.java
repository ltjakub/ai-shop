package pl.merito.shopai.model;

import lombok.Data;

import java.util.UUID;
@Data
public class ProductResponse {

    private UUID uuid;
    private String name;
    private String description;
    private String category;
    private String style;
    private String color;
    private String price;

    private byte[] image;

}