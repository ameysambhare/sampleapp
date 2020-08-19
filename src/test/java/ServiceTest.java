import com.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;

import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class ServiceTest {

    @InjectMocks
    EmployeeService service;
    @Test
    public void getEmployeeTest() {
        assertEquals(1,service.getEmployee("1").getId());
        assertEquals("John",service.getEmployee("1").getName());
        assertEquals("consultant",service.getEmployee("3").getDesignation());
        assertEquals("Jack",service.getEmployee("2").getName());
        assertNull(service.getEmployee("5"));
    }



}
