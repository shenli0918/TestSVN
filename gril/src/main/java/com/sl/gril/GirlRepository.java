package com.sl.gril;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlRepository extends JpaRepository<Girl, Integer> {  //<Girl, Integer> Integer 是 id 的类型

}
