package Controller;

import Model.Pedido;
import View.Cadastro;
import View.Comanda;
import View.MenuPrincipal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuPrincipalController {

    private final MenuPrincipal view;
    private final List<Pedido> itensClicados;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
        this.itensClicados = new ArrayList<>();

        view.getTable().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = view.getTable().getSelectedRow();
                if (selectedRow != -1) {
                    decrementarQuantidadeItem(selectedRow);
                }
            }
        });
    }

    public void navegarParaAgenda() {
        Comanda agenda = new Comanda();
        agenda.setVisible(true);
        agenda.getController().preencherTabelaPedidos(itensClicados);
    }

    public void navegarParaCadastro() {
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
    }

    public void adicionarItemClicado(Pedido item) {
        // Verificar se o item já está na lista
        Optional<Pedido> existingItem = itensClicados.stream()
                .filter(i -> i.getId() == item.getId())
                .findFirst();

        if (existingItem.isPresent()) {
            // Se o item já estiver na lista, incrementar a quantidade
            existingItem.get().setQuantidade(existingItem.get().getQuantidade() + 1);
        } else {
            // Caso contrário, adicionar o item com quantidade 1
            item.setQuantidade(1);
            itensClicados.add(item);
        }

        preencherTabela((ArrayList<Pedido>) itensClicados);
    }

    public void decrementarQuantidadeItem(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < itensClicados.size()) {
            Pedido item = itensClicados.get(rowIndex);
            int quantidadeAtual = item.getQuantidade();

            if (quantidadeAtual > 1) {
                // Se a quantidade for maior que 1, decrementar
                item.setQuantidade(quantidadeAtual - 1);
            } else {
                // Se a quantidade for 1 ou menos, remover o item da lista
                itensClicados.remove(rowIndex);
            }

            preencherTabela((ArrayList<Pedido>) itensClicados);
        }
    }

    public void preencherTabela(ArrayList<Pedido> itensClicados) {

        DefaultTableModel tableModel = (DefaultTableModel) view.getTable().getModel();
        tableModel.setNumRows(0);

        //Percorrer lista preenchendo tableModel
        for (Pedido pedido : itensClicados) {
            tableModel.addRow(new Object[]{
                pedido.getNome(),
                pedido.getQuantidade(),
                pedido.getValorTotal()
            });
        }
    }

}
