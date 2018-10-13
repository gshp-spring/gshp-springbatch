package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class MemeberShipProcessor implements ItemProcessor<MemeberShip, MemeberShip> {

    private static final Logger log = LoggerFactory.getLogger(MemeberShipProcessor.class);

    @Override
    public MemeberShip process(final MemeberShip person) throws Exception {
    	
    	log.info("Person process(final Person person) throws Exception......PersonItemProcessor");
        final String firstName = person.getFirstName().toUpperCase();
        final String lastName = person.getLastName().toUpperCase();

        final MemeberShip transformedPerson = new MemeberShip(firstName, lastName);

        log.info("Converting (" + person + ") into (" + transformedPerson + ")");

        return transformedPerson;
    }

}
