package ro.ubb.lab7.web.converter;



import ro.ubb.lab7.core.model.BaseEntity;
import ro.ubb.lab7.web.dto.BaseDto;


public interface Converter<Model, Dto> {

    Model convertDtoToModel(Dto dto);

    Dto convertModelToDto(Model model);

}

