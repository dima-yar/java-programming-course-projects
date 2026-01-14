package pl.edu.vistula.firstrestapi.product.api.responce;

import com.fasterxml.jackson.annotation.JsonCreator;

public class ProductResponce {
    private final long id;
    private final String name;

    @JsonCreator
    public ProductResponce(long id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {return name;}

    public long getId() {
        return id;
    }
}
