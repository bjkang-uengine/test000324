package test.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import test.domain.*;

@Component
public class BbbHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Bbb>> {

    @Override
    public EntityModel<Bbb> process(EntityModel<Bbb> model) {
        return model;
    }
}
