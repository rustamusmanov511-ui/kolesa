package com.example.kolesaproject.Repository;

import com.example.kolesaproject.Entity.Car;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface CarRepo extends JpaRepository<Car, Long> {
    List<Car> findByBrandIgnoreCase(String brand);

    List<Car> findByCityIgnoreCase(String city);

}
