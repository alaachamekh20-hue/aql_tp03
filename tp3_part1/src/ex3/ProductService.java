package ex3;

import tpaql_shared.Product;

public class ProductService {
    private final ProductApiClient apiClient;

    public ProductService(ProductApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public Product getProduct(String productId) {
        return apiClient.getProduct(productId);
    }
}
