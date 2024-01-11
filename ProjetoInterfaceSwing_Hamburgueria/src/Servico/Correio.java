package Servico;

import Model.Agendamento;

public class Correio {
    public void NotificarPorEmail(Agendamento agendamento){
        
        String emailFormatado = formatarEmail(agendamento);
        String destinatario = agendamento.getCliente().getEmail();
        
        Email email = new Email("Agendamento Hamburgueria #710", emailFormatado, destinatario);
        email.enviar();
    }

    private String formatarEmail(Agendamento agendamento) {
       String cliente = agendamento.getCliente().getNome();
       String pedido = agendamento.getPedido().getNome();
       int quantidade = agendamento.getQuantidade();
       String dataAgendamento = agendamento.getDataFormatada();
       String horaAgendamento = agendamento.getHoraFormatada();
       double valor = agendamento.getValor();
       String formaPagamento = agendamento.getFormaPagamento();
       String observacao = agendamento.getObservacao();
       
       return "Olá " + cliente + "! Hoje é dia de #710!!! Seu pedido está marcado para  " +
               dataAgendamento + " às " + horaAgendamento + ". O valor total é igual a R$ " + valor + 
               ". Agradescemos a preferência!";
    }
}
