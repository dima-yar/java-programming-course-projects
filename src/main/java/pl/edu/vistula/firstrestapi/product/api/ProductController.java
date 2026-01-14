package pl.edu.vistula.firstrestapi.product.api;


import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.edu.vistula.firstrestapi.product.api.request.ProductRequest;
import pl.edu.vistula.firstrestapi.product.api.request.UpdateProductRequest;
import pl.edu.vistula.firstrestapi.product.api.responce.ProductResponce;
import pl.edu.vistula.firstrestapi.product.domain.Product;
import pl.edu.vistula.firstrestapi.product.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {this.productService = productService;}

    @PostMapping
    @Operation(summary = "Create Product")
    public ResponseEntity<ProductResponce> Create(@RequestBody ProductRequest productRequest) {
        ProductResponce productResponce = productService.Create(productRequest);
        return new ResponseEntity<>(productResponce, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Find a product")
    public ResponseEntity<ProductResponce> Find(@PathVariable long id) {
        ProductResponce productResponce = productService.Find(id);
        return ResponseEntity.status(HttpStatus.OK).body(productResponce);
    }

    @GetMapping
    @Operation(summary = "Find all products")
    public ResponseEntity<List<ProductResponce>> FindAll() {
        List<ProductResponce> productResponces = productService.FindAll();
        return ResponseEntity.status(HttpStatus.OK).body(productResponces);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update product")
    public ResponseEntity<ProductResponce> Update(@PathVariable long id, @RequestBody UpdateProductRequest updateProductRequest) {
        ProductResponce productResponce = productService.Update(id, updateProductRequest);
        return  ResponseEntity.status(HttpStatus.OK).body(productResponce);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete product")
    public ResponseEntity<ProductResponce> Delete(@PathVariable long id) {
        productService.Delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
