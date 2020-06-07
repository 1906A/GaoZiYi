package com.leyou.search.client;

import com.leyou.client.SpecClientServer;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("item-service")
public interface SpecClient extends SpecClientServer {

}
