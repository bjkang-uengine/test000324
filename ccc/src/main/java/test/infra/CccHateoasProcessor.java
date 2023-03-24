package test.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import test.domain.*;

@Component
public class CccHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Ccc>> {

    @Override
    public EntityModel<Ccc> process(EntityModel<Ccc> model) {
        return model;
    }
}
