package io.crossplane.sdk.xfn.javasdk.mappers;

import io.crossplane.sdk.xfn.javasdk.model.Car;
import io.crossplane.sdk.xfn.javasdk.model.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

@Mapper(componentModel = "spring")
public interface CarMapper extends Converter<Car, CarDto> {
    @Override
    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDto convert(Car car);
}