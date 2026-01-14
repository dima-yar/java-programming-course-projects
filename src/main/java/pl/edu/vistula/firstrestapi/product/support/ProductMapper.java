package pl.edu.vistula.firstrestapi.product.support;

import pl.edu.vistula.firstrestapi.product.api.request.ProductRequest;
import pl.edu.vistula.firstrestapi.product.api.request.UpdateProductRequest;
import pl.edu.vistula.firstrestapi.product.api.responce.ProductResponce;
import pl.edu.vistula.firstrestapi.product.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public Product toProduct(ProductRequest productRequest) {
        return new Product(productRequest.getName());
    }
    public Product toProduct(Product product, UpdateProductRequest updateProductRequest) {
        product.setName(updateProductRequest.getName());
        return product;
    }
    public ProductResponce toProductResponce(Product product) {
        return new ProductResponce(product.getId(), product.getName());
    }
}
