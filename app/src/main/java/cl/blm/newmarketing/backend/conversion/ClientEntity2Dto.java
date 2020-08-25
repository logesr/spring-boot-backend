package cl.blm.newmarketing.backend.conversion;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import cl.blm.newmarketing.backend.model.entities.Client;
import cl.blm.newmarketing.backend.rest.dtos.ClientDto;
import cl.blm.newmarketing.backend.rest.dtos.PersonDto;

/**
 *
 * @author Benjamin La Madrid <bg.lamadrid at gmail.com>
 */
@Component
public class ClientEntity2Dto
    implements Converter<Client, ClientDto> {

  @Override
  public ClientDto convert(Client source) {
    ClientDto target = new ClientDto();
    target.setClientId(source.getId());
    PersonDto person = new PersonEntity2Dto().convert(source.getPerson());
    target.setPerson(person);
    return target;
  }
}