package com.ironhack.ecomerce;

import io.swagger.model.CustomerTicket;
import io.swagger.model.Order;
import io.swagger.model.Product;
import io.swagger.model.UserPersonalData;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-11-12T23:41:18.210738873Z[GMT]")
@RestController
public class DefaultApiController implements DefaultApi {

    private static final Logger log = LoggerFactory.getLogger(DefaultApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DefaultApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Order>> ordersGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Order>>(objectMapper.readValue("[ {\n  \"totalAmount\" : 1500.75,\n  \"id\" : \"o67890\",\n  \"userId\" : \"u12345\",\n  \"items\" : [ {\n    \"quantity\" : 1,\n    \"productId\" : \"p78901\"\n  }, {\n    \"quantity\" : 1,\n    \"productId\" : \"p78901\"\n  } ],\n  \"status\" : \"pending\"\n}, {\n  \"totalAmount\" : 1500.75,\n  \"id\" : \"o67890\",\n  \"userId\" : \"u12345\",\n  \"items\" : [ {\n    \"quantity\" : 1,\n    \"productId\" : \"p78901\"\n  }, {\n    \"quantity\" : 1,\n    \"productId\" : \"p78901\"\n  } ],\n  \"status\" : \"pending\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Order>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Order>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Order> ordersOrderIdGet(@Parameter(in = ParameterIn.PATH, description = "ID del pedido", required=true, schema=@Schema()) @PathVariable("orderId") String orderId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Order>(objectMapper.readValue("{\n  \"totalAmount\" : 1500.75,\n  \"id\" : \"o67890\",\n  \"userId\" : \"u12345\",\n  \"items\" : [ {\n    \"quantity\" : 1,\n    \"productId\" : \"p78901\"\n  }, {\n    \"quantity\" : 1,\n    \"productId\" : \"p78901\"\n  } ],\n  \"status\" : \"pending\"\n}", Order.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Order>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Order> ordersOrderIdPut(@Parameter(in = ParameterIn.PATH, description = "ID del pedido a actualizar", required=true, schema=@Schema()) @PathVariable("orderId") String orderId
,@Parameter(in = ParameterIn.DEFAULT, description = "Datos actualizados del pedido", required=true, schema=@Schema()) @Valid @RequestBody Order body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Order>(objectMapper.readValue("{\n  \"totalAmount\" : 1500.75,\n  \"id\" : \"o67890\",\n  \"userId\" : \"u12345\",\n  \"items\" : [ {\n    \"quantity\" : 1,\n    \"productId\" : \"p78901\"\n  }, {\n    \"quantity\" : 1,\n    \"productId\" : \"p78901\"\n  } ],\n  \"status\" : \"pending\"\n}", Order.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Order>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Order> ordersPost(@Parameter(in = ParameterIn.DEFAULT, description = "Objeto del pedido a crear", required=true, schema=@Schema()) @Valid @RequestBody Order body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Order>(objectMapper.readValue("{\n  \"totalAmount\" : 1500.75,\n  \"id\" : \"o67890\",\n  \"userId\" : \"u12345\",\n  \"items\" : [ {\n    \"quantity\" : 1,\n    \"productId\" : \"p78901\"\n  }, {\n    \"quantity\" : 1,\n    \"productId\" : \"p78901\"\n  } ],\n  \"status\" : \"pending\"\n}", Order.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Order>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Product>> productsGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Product>>(objectMapper.readValue("[ {\n  \"price\" : 2499.99,\n  \"name\" : \"Aspiradora Electrolux\",\n  \"description\" : \"Aspiradora con potencia de 2000W, ideal para limpieza profunda de alfombras y pisos. Precio en pesos.\",\n  \"id\" : \"p78901\",\n  \"stock\" : 20\n}, {\n  \"price\" : 2499.99,\n  \"name\" : \"Aspiradora Electrolux\",\n  \"description\" : \"Aspiradora con potencia de 2000W, ideal para limpieza profunda de alfombras y pisos. Precio en pesos.\",\n  \"id\" : \"p78901\",\n  \"stock\" : 20\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Product>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Product>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Product> productsPost(@Parameter(in = ParameterIn.DEFAULT, description = "Objeto de producto a agregar", required=true, schema=@Schema()) @Valid @RequestBody Product body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Product>(objectMapper.readValue("{\n  \"price\" : 2499.99,\n  \"name\" : \"Aspiradora Electrolux\",\n  \"description\" : \"Aspiradora con potencia de 2000W, ideal para limpieza profunda de alfombras y pisos. Precio en pesos.\",\n  \"id\" : \"p78901\",\n  \"stock\" : 20\n}", Product.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Product>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Product>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> productsProductIdDelete(@Parameter(in = ParameterIn.PATH, description = "ID del producto a eliminar", required=true, schema=@Schema()) @PathVariable("productId") String productId
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Product> productsProductIdGet(@Parameter(in = ParameterIn.PATH, description = "ID del producto", required=true, schema=@Schema()) @PathVariable("productId") String productId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Product>(objectMapper.readValue("{\n  \"price\" : 2499.99,\n  \"name\" : \"Aspiradora Electrolux\",\n  \"description\" : \"Aspiradora con potencia de 2000W, ideal para limpieza profunda de alfombras y pisos. Precio en pesos.\",\n  \"id\" : \"p78901\",\n  \"stock\" : 20\n}", Product.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Product>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Product>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Product> productsProductIdPut(@Parameter(in = ParameterIn.PATH, description = "ID del producto a actualizar", required=true, schema=@Schema()) @PathVariable("productId") String productId
,@Parameter(in = ParameterIn.DEFAULT, description = "Objeto del producto con los datos a actualizar", required=true, schema=@Schema()) @Valid @RequestBody Product body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Product>(objectMapper.readValue("{\n  \"price\" : 2499.99,\n  \"name\" : \"Aspiradora Electrolux\",\n  \"description\" : \"Aspiradora con potencia de 2000W, ideal para limpieza profunda de alfombras y pisos. Precio en pesos.\",\n  \"id\" : \"p78901\",\n  \"stock\" : 20\n}", Product.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Product>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Product>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<CustomerTicket>> supportTicketsGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<CustomerTicket>>(objectMapper.readValue("[ {\n  \"createdDate\" : \"2023-10-01T12:30:00Z\",\n  \"subject\" : \"Producto no entregado\",\n  \"description\" : \"El producto nunca llegó y necesito una solución.\",\n  \"id\" : \"t78902\",\n  \"userId\" : \"u12345\",\n  \"status\" : \"open\"\n}, {\n  \"createdDate\" : \"2023-10-01T12:30:00Z\",\n  \"subject\" : \"Producto no entregado\",\n  \"description\" : \"El producto nunca llegó y necesito una solución.\",\n  \"id\" : \"t78902\",\n  \"userId\" : \"u12345\",\n  \"status\" : \"open\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<CustomerTicket>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<CustomerTicket>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CustomerTicket> supportTicketsPost(@Parameter(in = ParameterIn.DEFAULT, description = "Objeto del ticket de soporte a crear", required=true, schema=@Schema()) @Valid @RequestBody CustomerTicket body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CustomerTicket>(objectMapper.readValue("{\n  \"createdDate\" : \"2023-10-01T12:30:00Z\",\n  \"subject\" : \"Producto no entregado\",\n  \"description\" : \"El producto nunca llegó y necesito una solución.\",\n  \"id\" : \"t78902\",\n  \"userId\" : \"u12345\",\n  \"status\" : \"open\"\n}", CustomerTicket.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CustomerTicket>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CustomerTicket>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<UserPersonalData>> usersGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<UserPersonalData>>(objectMapper.readValue("[ {\n  \"address\" : \"Av. Insurgentes Sur 123, Ciudad de México\",\n  \"phone\" : \"+52 55 1234 5678\",\n  \"name\" : \"Alejandro Olivares\",\n  \"id\" : \"u12345\",\n  \"email\" : \"aolivaresg@digitalfemsa.com\"\n}, {\n  \"address\" : \"Av. Insurgentes Sur 123, Ciudad de México\",\n  \"phone\" : \"+52 55 1234 5678\",\n  \"name\" : \"Alejandro Olivares\",\n  \"id\" : \"u12345\",\n  \"email\" : \"aolivaresg@digitalfemsa.com\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<UserPersonalData>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<UserPersonalData>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserPersonalData> usersPost(@Parameter(in = ParameterIn.DEFAULT, description = "Objeto del usuario a crear", required=true, schema=@Schema()) @Valid @RequestBody UserPersonalData body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserPersonalData>(objectMapper.readValue("{\n  \"address\" : \"Av. Insurgentes Sur 123, Ciudad de México\",\n  \"phone\" : \"+52 55 1234 5678\",\n  \"name\" : \"Alejandro Olivares\",\n  \"id\" : \"u12345\",\n  \"email\" : \"aolivaresg@digitalfemsa.com\"\n}", UserPersonalData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserPersonalData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserPersonalData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> usersUserIdDelete(@Parameter(in = ParameterIn.PATH, description = "ID del usuario a eliminar", required=true, schema=@Schema()) @PathVariable("userId") String userId
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserPersonalData> usersUserIdGet(@Parameter(in = ParameterIn.PATH, description = "ID del usuario", required=true, schema=@Schema()) @PathVariable("userId") String userId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserPersonalData>(objectMapper.readValue("{\n  \"address\" : \"Av. Insurgentes Sur 123, Ciudad de México\",\n  \"phone\" : \"+52 55 1234 5678\",\n  \"name\" : \"Alejandro Olivares\",\n  \"id\" : \"u12345\",\n  \"email\" : \"aolivaresg@digitalfemsa.com\"\n}", UserPersonalData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserPersonalData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserPersonalData>(HttpStatus.NOT_IMPLEMENTED);
    }

}
