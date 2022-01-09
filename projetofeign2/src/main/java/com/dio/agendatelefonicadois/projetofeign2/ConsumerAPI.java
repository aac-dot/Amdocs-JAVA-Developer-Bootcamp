package com.dio.agendatelefonicadois.projetofeign2;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="agenda", url"http://localhost:8080/contato")
public interface ConsumerAPI {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    Contato retornarContato();
}
