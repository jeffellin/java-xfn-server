package io.crossplane.sdk.xfn.javasdk.mappers;

import apiextensions.fn.proto.v1beta1.RunFunction;
import io.crossplane.sdk.xfn.javasdk.model.Car;
import io.crossplane.sdk.xfn.javasdk.model.CarDto;
import io.crossplane.sdk.xfn.javasdk.model.Resource;
import io.crossplane.sdk.xfn.javasdk.model.State;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;
import org.springframework.core.convert.converter.Converter;

@Mapper(componentModel = "spring")

public interface RunFunctionMapper extends Converter<RunFunction.Resource,Resource> {
    @Override
    Resource convert(RunFunction.Resource state);
}
