# CONSIGNADO HEXAGONAL ARCHITECTURE
<p>Aplicação de Demonstração para Crédito Consignado, seguindo conceitos de Arquitetura Hexagonal</p>
<p>Copyright © 2020 Richardson Software Ltda.</p>

## Introdução

Essa aplicação tem o intuito de apresentar um CRUD simples, que realiza busca de ofertas de crédito consignado, respeitando a nova <b>Instrução Normativa nº 100, do Instituto Nacional do Seguro Social, de 28/12/2018</b>.

Com a nova Instrução Normativa, os bancos somente poderão oferecer crédito consignado, aos aposentados e pensionistas, mediante as regras abaixo:

* **Regra nº 1**

  * Todo cidadão que se aposentar a partir de 30/03/2019, terá seu benefício bloqueado automaticamente, pelo período de 90 dias, a partir da data de concessão pelo INSS (Data de Despacho do Benefício - DDB).

* **Regra nº 2**

  * Após 90 dias da Data de Despacho do Benefício, o aposentado ou pensionista poderá contratar um crédito consignado. Para isto, é necessário que um termo de pré-autorização seja assinado pelo beneficiário para que a instituição financeira possa solicitar o acesso às informações do benefício ao INSS. Com a aprovação, pelo INSS, do termo, será considerado mais um prazo de 90 dias a partir da Data de Despacho do Benefício para que seja permitido aos bancos ofertarem crédito consignado.

* **Regra nº 3**

  * Passados 180 dias da Data de Despacho do Benefício (DDB), 90 dias do bloqueio mais 90 dias para frente, os bancos podem iniciar o processo de oferta de crédito consignado aos seus clientes aposentados e pensionistas, desde que o intervalo entre a Data de Despacho do Benefício, e a Data de Autorizaão da Consulta, seja de, no mínimo, 90 dias (DDB - DAC >= 90).

## Tecnologias Utilizadas

* Java (JDK 13);
* Spring Boot;
* Maven;
* REST;
* H2 In-memory Database

## Prova de Conceito (Proof of Concept)

  Essa aplicação é somente uma prova de conceito, desenvolvida segundo as práticas da Arquitetura Hexagonal.
  Não está operacional.