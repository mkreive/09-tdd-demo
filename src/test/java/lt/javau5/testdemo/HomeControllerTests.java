package lt.javau5.testdemo;

import lt.javau5.testdemo.controller.HomeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(HomeController.class)
public class HomeControllerTests {

    @Autowired
    private MockMvc mockMvc;

//    @Test
//    public void testGetThingEndpoint() throws Exception{
//        mockMvc.perform(get("/thing"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.id").value(1L));
//    }

}
