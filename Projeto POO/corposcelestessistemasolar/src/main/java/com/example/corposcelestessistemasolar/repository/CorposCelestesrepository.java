package com.example.corposcelestessistemasolar.repository;  // Ajuste o pacote conforme necessário

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.corposcelestessistemasolar.models.CorposCelesteSistemaSolar; // Adicione a importação correta

@Repository
public interface CorposCelestesrepository extends JpaRepository<CorposCelesteSistemaSolar, Long> {

    // Exemplo de consulta personalizada para buscar corpos celestes por tipo
    List<CorposCelesteSistemaSolar> findByTipo(String tipo);

    // Adicione outros métodos de consulta personalizados, se necessário
    // List<CorposCelesteSistemaSolar> findByAlgumaOutraPropriedade(Tipo parametro);

}
