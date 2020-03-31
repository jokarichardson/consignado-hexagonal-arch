-- Crédito Contratado
DROP TABLE IF EXISTS credito_contratado;

CREATE TABLE beneficiarios_INSS (
  id                         INT         PRIMARY KEY AUTO_INCREMENT,
  cpf_cliente                INT, 
  valor_contratado           DECIMAL, 
  quantidade_parcelas        INT,
  data_vencimento_parcela    VARCHAR(02) 
  data_inicio_contrato       DATE,
  data_encerramento_contrato DATE,
  numero_beneficio           INT
);