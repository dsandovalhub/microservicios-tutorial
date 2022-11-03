package com.usuario.service1.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.usuario.service1.models.Car;
import com.usuario.service1.models.Moto;

@FeignClient(name = "carro-service", url = "http://localhost:8082")
@RequestMapping("/carro")
public interface CarFeignClient {
	
	@PostMapping()
	public Car save(@RequestBody Car car);
	
	@GetMapping("/usuario/{usuarioId}")
	public List<Car> getCarros(@PathVariable("usuarioId") int usuarioId);

}
