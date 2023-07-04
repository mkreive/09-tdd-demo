package lt.javau5.testdemo;

import lt.javau5.testdemo.entity.Thing;
import lt.javau5.testdemo.repository.ThingRepository;
import lt.javau5.testdemo.service.MainService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
public class MainServiceTests {

    @Mock
    private ThingRepository thingMockRepository;

    @InjectMocks
    MainService mainService;

    @Test
    void checkNullReferenceMainService() {
        assertNotNull(mainService);
    }

    @Test
    void shouldReturnNotNullObject() {
        Thing thing = mainService.getThing();
        assertNotNull(thing);
    }

    @Test
    void shouldAddThingToRepo() {
        // Arrange
        Long expectedId = 1L;
        Thing thing = new Thing();
        when(thingMockRepository
                .save(thing))
                .thenAnswer(invocation -> {
                    Thing saveThing  = invocation.getArgument(0);
                    saveThing.setId(1L);
                    return saveThing;
                });

        // Act
        Thing savedThing = mainService.saveThing(thing);

        // Assert
        assertNotNull(savedThing);
        assertEquals(expectedId, savedThing.getId());
    }

    @Test
    void shouldFindThingById() {
        // Arrange
        Long id = 1L;
        Long expectedId = 1L;
        Thing thing = new Thing();
        thing.setId(1L);
        when(thingMockRepository
                .findById(expectedId))
                .thenReturn(Optional.of(thing));

        // Act
        Thing expectedItem = mainService.getById(id);

        // Assert
        assertNotNull(expectedItem);
        assertEquals(expectedId, expectedItem.getId());
    }

}
