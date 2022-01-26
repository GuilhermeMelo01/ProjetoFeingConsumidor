package com.projetoonefeing2.projetoonefeing2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="agenda", url="http://localhost:8080/contato")
public interface ConsumidorApi {

    @RequestMapping(method = RequestMethod.GET, value="/")
    Contato retornaContato();
}
