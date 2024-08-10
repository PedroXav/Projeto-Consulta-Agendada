# ConsultaAgendada - Projeto Java
Trabalho prático de CBTLPR1
Gerenciamento de consultas médicas agendadas.

## Descrição do Projeto

O projeto **ConsultaAgendada** é uma aplicação Java simples que permite o agendamento de consultas médicas, gerenciando informações como data, hora, nome do paciente e nome do médico. A aplicação também conta com a funcionalidade de alteração desses dados após a consulta ter sido agendada.

## Funcionalidades

- Agendamento de consultas com data, hora, paciente e médico.
- Alteração dos dados de uma consulta agendada.
- Contagem automática do número total de consultas agendadas.
- Exibição da data e hora da consulta em formatos específicos.

## Estrutura do Código

### Classes Principais

- `Data`: Representa a data da consulta (dia, mês, ano) e oferece métodos para validação e formatação da data.
- `Hora`: Representa a hora da consulta (hora, minutos, segundos) e oferece métodos para validação e formatação da hora.
- `ConsultaAgendada`: Gerencia a consulta, incluindo data, hora, paciente, médico e a contagem total de consultas.
- `TestaConsultaAgendada`: Classe principal que realiza testes na classe `ConsultaAgendada`, exibindo e alterando seus dados.

## Conclusão

Este projeto foi desenvolvido como uma forma de praticar conceitos de orientação a objetos em Java, incluindo encapsulamento, validação de dados e uso de construtores e métodos getters e setters conforme padrão UML.

## Exemplo de Saída

```plaintext
----------------------------------------------
 Agendamento de consulta do primeiro paciente 
Hora: 08:30:00
Data: 12/03/2024
Nome do Paciente: Luciana
Nome do Médico: Dr. Gerônimo
----------------------------------------------
  Agendamento de consulta do segundo paciente 

...
----------------------------------------------
Quantidade Final de Consultas: 2


