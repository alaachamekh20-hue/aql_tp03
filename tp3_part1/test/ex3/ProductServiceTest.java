package ex3;

import tpaql_shared.Product;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    private ProductApiClient apiClient;

    @InjectMocks
    private ProductService productService;

    @Test
    public void testGetProduct_Success() {
        // Arrange
        String productId = "P123";
        Product mockProduct = new Product(productId, "Smartphone", 599.99);
        when(apiClient.getProduct(productId)).thenReturn(mockProduct);

        // Act
        Product result = productService.getProduct(productId);

        // Assert
        assertNotNull(result);
        assertEquals("Smartphone", result.getName());
        verify(apiClient).getProduct(productId);
    }

    @Test
    public void testGetProduct_IncompatibleDataFormat() {
        // Arrange
        String productId = "P456";
        // Mocking behavior where the API might return null or handle malformed data by
        // throwing an exception
        // Let's assume the client throws a RuntimeException if data is incompatible
        when(apiClient.getProduct(productId)).thenThrow(new RuntimeException("Incompatible data format"));

        // Act & Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            productService.getProduct(productId);
        });
        assertEquals("Incompatible data format", exception.getMessage());

        // Verify that the call was actually made
        verify(apiClient).getProduct(productId);
    }

    @Test
    public void testGetProduct_ApiFailure() {
        // Arrange
        String productId = "P789";
        // Simulating a network failure or server error
        when(apiClient.getProduct(productId)).thenThrow(new RuntimeException("API Call Failed"));

        // Act & Assert
        assertThrows(RuntimeException.class, () -> {
            productService.getProduct(productId);
        });

        // Verify that the call was actually made
        verify(apiClient).getProduct(productId);
    }
}
