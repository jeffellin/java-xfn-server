package io.crossplane.sdk.xfn.javasdk.mappers;

import apiextensions.fn.proto.v1beta1.RunFunction;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.google.protobuf.util.JsonFormat;
import io.crossplane.sdk.xfn.javasdk.model.Car;
import io.crossplane.sdk.xfn.javasdk.model.CarDto;
import io.crossplane.sdk.xfn.javasdk.model.Resource;
import io.crossplane.sdk.xfn.javasdk.model.State;
import org.mapstruct.*;
import org.springframework.core.convert.converter.Converter;

import java.util.Map;

//@Mapper(componentModel = "spring")
@Mapper()

public interface RunFunctionMapper extends Converter<RunFunction.Resource,Resource> {
    @Override
    @Mapping(source = "resource", target = "resource", qualifiedByName = "inchToCentimeter")
    Resource  convert(RunFunction.Resource state);

    @Named("inchToCentimeter")
    public static LinkedTreeMap map(Struct value) {
        Map asMap = null;
        try {
            String asJson = JsonFormat.printer().print(value);
           asMap = new Gson().fromJson(asJson, Map.class);

            System.err.print(asJson);
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException(e);
        }

        return (LinkedTreeMap) asMap;
    }

    @Named("mapToStruct")
    public static Struct map(LinkedTreeMap asMap) {
        Struct s = null;
        try {
            String backToJson = new Gson().toJson(asMap);
            Struct.Builder builder = Struct.newBuilder();
            JsonFormat.parser().merge(backToJson, builder);
            s = builder.build();
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException(e);
        }

        return s;
    }

}
