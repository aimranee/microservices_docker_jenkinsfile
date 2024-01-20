package ma.emsi.demande_service.service;

import ma.emsi.demande_service.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="SERVICE-USER")
public interface UserService {
        @GetMapping(path = "/api/user/find/{id}")
        User userById (@PathVariable("id") Long id);
}