package io.crossplane.sdk.xfn.javasdk;

import apiextensions.fn.proto.v1beta1.RunFunction;
import com.google.protobuf.Struct;
import com.google.protobuf.Value;
//import io.crossplane.sdk.xfn.javasdk.config.ConversionServiceAdapter;
import io.crossplane.sdk.xfn.javasdk.mappers.*;
import io.crossplane.sdk.xfn.javasdk.model.*;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.ConversionService;

import java.util.TreeMap;

@SpringBootApplication
public class JavaSdkApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSdkApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx
											  ) {
		return args -> {
			Struct s = Struct.newBuilder().putFields("key", Value.newBuilder()
					.setStringValue("e")
					.setBoolValue(false).build()).build();
			//RunFunction.Resource resource = RunFunction.Resource.newBuilder().setResource(s).build();
			//RunFunctionMapper rfm = new RunFunctionMapperImpl();
			StructMapper sm = new StructMapperImpl();
			ResourceDTO rdto = new ResourceDTO();
			rdto.setResource(s);
			Resource r = sm.fromStruct(rdto);
			System.err.println(r);

			ResourceDTO dt = sm.toStruct(r);

			System.err.println(dt);


			//System.err.println(adapter.mapResourceToResource(resource));

		};
	}
}