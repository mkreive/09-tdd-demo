package lt.javau5.testdemo;

import lt.javau5.testdemo.controller.HomeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HomeController.class)
public class HomeControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetThingEndpoint() throws Exception{
        mockMvc.perform(get("/thing"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L));
    }

}
