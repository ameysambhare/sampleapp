import com.controller.EmployeeServlet;
import com.model.Employee;
import com.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RunWith(MockitoJUnitRunner.class)
public class ServletTest {
    @InjectMocks
    EmployeeServlet servlet;
    @Mock
    HttpServletRequest request;
    @Mock
    HttpServletResponse response;

    @Mock
    RequestDispatcher dispatcher;

    @Test
    public void testDoPostWhenEmployeeFound() throws Exception {
        Employee emp = new Employee(1,"abc","xyz");
        when(request.getParameter("employeeid")).thenReturn("1");

        when(request.getRequestDispatcher("result.jsp")).thenReturn(dispatcher);

        servlet.doPost(request,response);
        
    }

}
