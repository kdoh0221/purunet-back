package kr.co.kumsung.purunet.prunetback;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.jpa.mapping.JpaMetamodelMappingContext;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.filter.CharacterEncodingFilter;

import java.nio.charset.StandardCharsets;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@ExtendWith(MockitoExtension.class)
public abstract class MockMvcControllerTest {
    @MockBean
    protected MockMvc mockMvc;
    @MockBean
    private JpaMetamodelMappingContext jpaMetamodelMappingContext;

    abstract protected Object controller();

    @BeforeEach
    private void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(controller())
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .addFilter(new CharacterEncodingFilter(StandardCharsets.UTF_8.name(), true))
                .alwaysDo(print())
                .build();
    }
}
