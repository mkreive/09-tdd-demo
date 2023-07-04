package lt.javau5.testdemo.service;

import lt.javau5.testdemo.entity.Thing;
import lt.javau5.testdemo.repository.ThingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    @Autowired
    ThingRepository thingRepository;

    public Thing getThing() {
        return new Thing();
    }

    public Thing saveThing(Thing thing) {
        return thingRepository.save(thing);
    }

    public Thing getById(Long id) {
        return thingRepository.findById(id).orElse(new Thing());
    }
}
