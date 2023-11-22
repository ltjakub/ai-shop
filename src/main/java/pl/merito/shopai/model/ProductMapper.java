package pl.merito.shopai.model;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public class ProductMapper {

    public static ProductResponse map(Product product) {
        ProductResponse productResponse = new ProductResponse();
        productResponse.setUuid(product.getUuid());
        productResponse.setName(product.getName());
        productResponse.setDescription(product.getDescription());
        productResponse.setPrice(product.getPrice());
        productResponse.setImage(product.getImage());

        return productResponse;
    }

    public static Product map(ProductRequest productRequest) {
        try {
            Product product = new Product();
            product.setUuid(productRequest.getUuid());
            product.setName(productRequest.getName());
            product.setDescription(productRequest.getDescription());
            product.setPrice(productRequest.getPrice());
            product.setImage(productRequest.getImage().getBytes());
            return product;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}