package test.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import test.config.kafka.KafkaProcessor;
import test.domain.*;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    CccRepository cccRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Aaa'"
    )
    public void wheneverAaa_Ccc(@Payload Aaa aaa) {
        Aaa event = aaa;
        System.out.println("\n\n##### listener Ccc : " + aaa + "\n\n");

        // Sample Logic //
        Ccc.ccc(event);
    }
}
