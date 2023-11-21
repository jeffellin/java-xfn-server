package io.crossplane.sdk.xfn.javasdk.mappers;

import org.mapstruct.MapperConfig;
import org.mapstruct.extensions.spring.SpringMapperConfig;
import io.crossplane.sdk.xfn.javasdk.config.ConversionServiceAdapter;

@MapperConfig(componentModel = "spring", uses = ConversionServiceAdapter.class)
@SpringMapperConfig(conversionServiceAdapterPackage ="io.crossplane.sdk.xfn.javasdk.config", conversionServiceAdapterClassName ="ConversionServiceAdapter")
public interface MapperSpringConfig {
}