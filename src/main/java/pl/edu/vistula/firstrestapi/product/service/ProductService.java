package pl.edu.vistula.firstrestapi.product.service;

import org.springframework.stereotype.Service;
import pl.edu.vistula.firstrestapi.product.api.request.ProductRequest;
import pl.edu.vistula.firstrestapi.product.api.responce.ProductResponce;
import pl.edu.vistula.firstrestapi.product.domain.Product;
import pl.edu.vistula.firstrestapi.product.api.request.UpdateProductRequest;
import pl.edu.vistula.firstrestapi.product.repository.ProductRepository;
import pl.edu.vistula.firstrestapi.product.support.ProductExceptionSupplier;
import pl.edu.vistula.firstrestapi.product.support.ProductMapper;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public ProductResponce Create(ProductRequest productRequest) {
        Product product = productRepository.save(productMapper.toProduct(productRequest));
        return productMapper.toProductResponce(product);
    }
    public ProductResponce Find(long id) {
        Product product = productRepository.findById(id).orElseThrow(ProductExceptionSupplier.ProductNotFound(id));
        return productMapper.toProductResponce(product);
    }
    public List<ProductResponce> FindAll() {
        return productRepository.findAll().stream().map(productMapper::toProductResponce).collect(Collectors.toList());
    }
    public ProductResponce Update(long id, UpdateProductRequest updateProductRequest){
        Product product = productRepository.findById(id).orElseThrow(ProductExceptionSupplier.ProductNotFound(id));
        productRepository.save(productMapper.toProduct(product, updateProductRequest));
        return productMapper.toProductResponce(product);
    }
    public void Delete(long id){
        Product product = productRepository.findById(id).orElseThrow(ProductExceptionSupplier.ProductNotFound(id));
        productRepository.deleteById(product.getId());
    }
}
