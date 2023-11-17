CREATE TABLE corpos_celestes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    tipo VARCHAR(255) NOT NULL,
    tamanho DECIMAL(10, 2) NOT NULL,
    distancia_do_sol DECIMAL(10, 2) NOT NULL,
    elemento_quimico_predominante VARCHAR(255) NOT NULL
);
