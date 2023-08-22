package com.usuario.service.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.usuario.service.models.Moto;

/**
 * MotoFeignClient
 */
@FeignClient(name = "moto-service") // , url = "http://localhost:8083/moto"
public interface MotoFeignClient {

    @PostMapping("moto")
    public Moto save(@RequestBody Moto moto);

    @GetMapping("moto/usuario/{usuarioId}")
    public List<Moto> getMotos(@PathVariable("usuarioId") int usuarioId);
}
