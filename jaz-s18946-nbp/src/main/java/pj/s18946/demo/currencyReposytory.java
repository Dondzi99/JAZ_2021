package pj.s18946.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

public interface currencyReposytory  extends JpaRepository<currency,Integer> {
    @Override
    <S extends currency> S save(S s);

}