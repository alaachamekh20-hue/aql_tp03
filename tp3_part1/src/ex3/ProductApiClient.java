package ex3;

import tpaql_shared.Product;

public interface ProductApiClient {
    Product getProduct(String productId);
}
