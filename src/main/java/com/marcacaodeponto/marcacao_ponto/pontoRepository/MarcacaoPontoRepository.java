package com.marcacaodeponto.marcacao_ponto.pontoRepository;

import com.marcacaodeponto.marcacao_ponto.PontoModel.MarcacaoPontoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcacaoPontoRepository extends JpaRepository<MarcacaoPontoModel, Long> {
}
