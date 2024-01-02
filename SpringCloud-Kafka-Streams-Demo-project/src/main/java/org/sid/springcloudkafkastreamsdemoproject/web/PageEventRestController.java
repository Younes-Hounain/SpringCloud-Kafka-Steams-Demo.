package org.sid.springcloudkafkastreamsdemoproject.web;

import org.sid.springcloudkafkastreamsdemoproject.entities.PageEvent;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@RestController
public class PageEventRestController {
    private StreamBridge streamBridge;
    @GetMapping("/publish/{topic}/{name}")
    public PageEvent publish(@PathVariable String topic,@PathVariable String name) {
        PageEvent pageEvent = new PageEvent(name, "user_"+new Random().nextInt(100), new Date(), new Random().nextInt(10000));
        streamBridge.send(topic, pageEvent);
        return pageEvent;
    }
}
