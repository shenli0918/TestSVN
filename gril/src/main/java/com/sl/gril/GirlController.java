package com.sl.gril;

import org.hibernate.boot.jaxb.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    /*
     *查询所有女生列表
     */
    @GetMapping("/girlList")
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }

    /*
     * 添加女生
     */
    @PostMapping("/addGirl")
    public Girl addGirl(@RequestParam("cupSize") String cupSize,
                          @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);
    }

    @GetMapping(value = "/findOne/{id}")
    public Girl findOne(@PathVariable("id") Integer id) {
        System.out.println(girlRepository.getOne(id).toString());
        Girl girl = girlRepository.getOne(id);
        return girl;
    }

    @PostMapping(value = "/getOne")
    public Girl getOne(@RequestParam("id") Integer id) {
        System.out.println(girlRepository.getOne(id).toString());
        Girl girl = girlRepository.getOne(id);
        return girl;
    }


}
