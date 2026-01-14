package pl.edu.vistula.firstrestapi.product.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import pl.edu.vistula.firstrestapi.product.support.exception.ProductNotFoundException;
import pl.edu.vistula.firstrestapi.shared.api.response.ErrorMessageResponse;

@ControllerAdvice
public class ProductExeptionAdvisor {

    private static final Logger log = LoggerFactory.getLogger(ProductExeptionAdvisor.class);

    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorMessageResponse ProductNotFound(Exception e){
        log.error(e.getMessage(), e);
        return new ErrorMessageResponse(e.getLocalizedMessage());
    }
}
