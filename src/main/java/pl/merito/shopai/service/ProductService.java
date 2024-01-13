package pl.merito.shopai.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.merito.shopai.model.Product;
import pl.merito.shopai.model.ProductMapper;
import pl.merito.shopai.model.ProductRequest;
import pl.merito.shopai.model.ProductResponse;
import pl.merito.shopai.repository.ProductRepository;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<ProductResponse> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(ProductMapper::map)
                .toList();
    }

    public void createProduct(ProductRequest request) {
        Product product = ProductMapper.map(request);
        productRepository.save(product);
    }

}