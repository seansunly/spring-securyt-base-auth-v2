package co.ruppcstat.ecomercv1.ecomV1.feature.product;

import co.ruppcstat.ecomercv1.ecomV1.feature.product.dtoProduct.ProductCreate;
import co.ruppcstat.ecomercv1.ecomV1.feature.product.dtoProduct.ProductResponse;
import co.ruppcstat.ecomercv1.ecomV1.feature.product.dtoProduct.ProductUpdate;

import java.util.List;

public interface ProductService {
    ProductResponse createProduct(ProductCreate productCreate);
    ProductResponse updateProduct(String keyId,ProductUpdate productUpdate);
    void deleteProduct(String keyId);
    ProductResponse getProduct(String keyId);
    List<ProductResponse> getProducts();
    ProductResponse isDeletedProduct(String keyId);

}
