package com.sparta.cicdtest;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepository extends JpaRepository<Test,Long> {

}
