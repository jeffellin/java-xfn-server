package io.crossplane.sdk.xfn.javasdk.mappers;

import apiextensions.fn.proto.v1beta1.RunFunction;
import com.google.gson.internal.LinkedTreeMap;
import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import io.crossplane.sdk.xfn.javasdk.model.Resource;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.core.convert.converter.Converter;

import java.util.Map;

//@Mapper(componentModel = "spring")
@Mapper()

public interface ToRunFunctionMapper extends Converter<Resource,RunFunction.Resource> {
    @Override
    @Mapping(source = "resource", target = "resource")
    RunFunction.Resource  convert(Resource state);


}
