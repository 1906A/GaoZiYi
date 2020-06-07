package com.leyou.search.client;

import com.leyou.client.CategoryClientServer;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("item-service")
public interface CategoryClient extends CategoryClientServer {
}
