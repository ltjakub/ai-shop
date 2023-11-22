package pl.merito.shopai.model;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;
@Data
public class ProductRequest {

    private UUID uuid;
    private String name;
    private String description;
    private String price;
    private Integer quantity;
    private MultipartFile image;

}