package com.carro.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carro.service.entity.Carro;
import com.carro.service.repository.CarroRepository;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public List<Carro> getAll() {
        return carroRepository.findAll();
    }

    public Carro getCarroById(int id) {
        return carroRepository.findById(id).orElse(null);
    }

    public Carro save(Carro carro) {
        Carro newCarro = carroRepository.save(carro);
        return newCarro;
    }

    public List<Carro> carroByUsuarioId(int usuarioid) {
        return carroRepository.findByUsuarioId(usuarioid);
    }
}
