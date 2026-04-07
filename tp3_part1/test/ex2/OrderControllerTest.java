package ex2;

import tpaql_shared.Order;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class OrderControllerTest {

    @Mock
    private OrderService orderService;

    @Mock
    private OrderDao orderDao; // Mocking the DAO even if not directly used by controller for verification if
                               // needed

    @InjectMocks
    private OrderController orderController;

    @Test
    public void testCreateOrder() {
        // Arrange
        Order order = new Order(1L, "Laptop", 1);

        // Act
        orderController.createOrder(order);

        // Assert/Verify
        // The exercise asks to verify that OrderService.createOrder is called
        verify(orderService).createOrder(order);

        // Note: verifying OrderDao.saveOrder would typically be in OrderServiceTest,
        // but Exercise 2 task 5 says "verify that OrderService.createOrder is called
        // with the correct argument
        // and that OrderDao.saveOrder is called with the created order object."
        // Since we are testing OrderController, and it calls OrderService, if we want
        // to verify OrderDao.saveOrder
        // in the SAME test, we'd need to mock OrderService to call the REAL
        // OrderService or mock it to call the DAO.
        // However, usually these are separate tests. Let's provide a test that verifies
        // both as requested.
    }

    @Test
    public void testCreateOrderFlow() {
        // To verify both as requested in task 5 of Exercise 2:
        // "vérifiez que OrderService.createOrder est appelé avec le bon argument et que
        // OrderDao.saveOrder est appelé avec l'objet de commande créé."

        // We can use a real OrderService with a mocked OrderDao to test the integration
        // from Controller.
        OrderDao mockDao = mock(OrderDao.class);
        OrderService realService = new OrderService(mockDao);
        OrderController controller = new OrderController(realService);

        Order order = new Order(2L, "Mouse", 2);

        controller.createOrder(order);

        verify(mockDao).saveOrder(order);
    }
}
