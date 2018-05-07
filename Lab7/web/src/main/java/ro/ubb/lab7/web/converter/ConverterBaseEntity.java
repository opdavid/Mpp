package ro.ubb.lab7.web.converter;

import ro.ubb.lab7.core.model.BaseEntity;
import ro.ubb.lab7.web.dto.BaseDto;


public interface ConverterBaseEntity<Model extends BaseEntity<Long>, Dto extends BaseDto>
        extends Converter<Model, Dto> {

}

