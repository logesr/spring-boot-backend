package cl.blm.trebol.converters.topojo;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import cl.blm.trebol.api.pojo.ProductTypePojo;
import cl.blm.trebol.jpa.entities.ProductType;

/**
 *
 * @author Benjamin La Madrid <bg.lamadrid at gmail.com>
 */
@Component
public class ProductType2Pojo
    implements Converter<ProductType, ProductTypePojo> {

  @Override
  public ProductTypePojo convert(ProductType source) {
    ProductTypePojo target = new ProductTypePojo();
    target.setId(source.getId());
    target.setName(source.getName());
    return target;
  }
}