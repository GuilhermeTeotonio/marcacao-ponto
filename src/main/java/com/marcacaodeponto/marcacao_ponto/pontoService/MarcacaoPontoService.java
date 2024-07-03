package com.marcacaodeponto.marcacao_ponto.pontoService;
import com.marcacaodeponto.marcacao_ponto.PontoModel.MarcacaoPontoModel;
import com.marcacaodeponto.marcacao_ponto.pontoRepository.MarcacaoPontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcacaoPontoService {
    @Autowired
    private MarcacaoPontoRepository marcacaoPontoRepository;

    public List<MarcacaoPontoModel> getAllUsers(){
        return marcacaoPontoRepository.findAll();
    }

    public MarcacaoPontoModel saveUser(MarcacaoPontoModel user){
        return marcacaoPontoRepository.save(user);
    }

}