package pl.edu.vistula.firstrestapi.product.support.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(long id) {
        super(String.format("Product with %d (id) not found", id));
    }
}
