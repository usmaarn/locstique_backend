package dev.usmaarn.locstique.service;

import dev.usmaarn.locstique.dto.ProductRequest;
import dev.usmaarn.locstique.entity.Product;
import dev.usmaarn.locstique.exception.ResourceNotFoundException;
import dev.usmaarn.locstique.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(String id) {
        return productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

    public Product createProduct(ProductRequest productRequest) {
        Product product = new Product();
        return saveProduct(productRequest, product);
    }

    public Product updateProduct(String id, ProductRequest productRequest) {
        Product product = getProductById(id);
        return saveProduct(productRequest, product);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

    private Product saveProduct(ProductRequest productRequest, Product product) {
        product.setName(productRequest.getName());
        product.setPrice(productRequest.getPrice());
        product.setImage(productRequest.getImage());
        product.setDescription(productRequest.getDescription());
        product.setStock(productRequest.getStock());
        product.setDiscount(productRequest.getDiscount());
        product.setDetails(productRequest.getDetails());
        product.setTag(productRequest.getTag());
        return productRepository.save(product);
    }
}
