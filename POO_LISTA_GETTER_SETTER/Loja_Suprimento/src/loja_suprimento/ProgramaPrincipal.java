package loja_suprimento;

public class ProgramaPrincipal {

    public static void main(String[] args) {
        Item equipamento;
        equipamento = new Item();
        
        equipamento.setCodigo(710000);
        equipamento.setDescricao("Teclados sem fio - Multilaser");
        equipamento.setValor_item(80);
        equipamento.setQuantidade(14);
        
        
        System.out.println("Item..........: " + equipamento.getCodigo() + " | " + equipamento.getDescricao());
        System.out.println("Quantidade....: "+ equipamento.getQuantidade());
        System.out.println("Valor unitário: R$" + equipamento.getValor_item());
        System.out.println("Valor total...: R$" + equipamento.getTotal());
    } 
}
