package io.crossplane.sdk.xfn.javasdk;

import apiextensions.fn.proto.v1beta1.RunFunction;
import io.crossplane.sdk.xfn.javasdk.config.ConversionServiceAdapter;
import io.crossplane.sdk.xfn.javasdk.mappers.CarMapper;
import io.crossplane.sdk.xfn.javasdk.model.Car;
import io.crossplane.sdk.xfn.javasdk.model.CarDto;
import io.crossplane.sdk.xfn.javasdk.model.CarType;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.ConversionService;

@SpringBootApplication
public class JavaSdkApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSdkApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx,
											   ConversionServiceAdapter adapter) {
		return args -> {

			RunFunction.Resource resource = RunFunction.Resource.newBuilder().build();


			final Car car = new Car();
			car.setMake("Ford");
			car.setNumberOfSeats(2);
			car.setType(CarType.SEDAN);
			adapter.mapCarToCarDto(car);
			System.err.println(adapter.mapCarToCarDto(car));
			//final CarDto carDto = conversionService.convert(car, CarDto.class);
			//System.err.println(carDto);
		};
	}
}