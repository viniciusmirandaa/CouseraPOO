package CourseraTarefas.PrecoPizza.Classes.Carrinho;

import CourseraTarefas.PrecoPizza.Classes.Pizza.Pizza;

import java.util.Iterator;
import java.util.LinkedList;

public class CarrinhoDeCompras {

    private int valorTotal;
    LinkedList<Pizza> carrinho = new LinkedList<>();
    Iterator<Pizza> iterator;
    Pizza aux;

    public boolean adicionarPizza(Pizza pizza) {
        if (pizza.ingredientesPizza == 0) {
            System.out.println("Não é possível adicionar uma pizza sem ingredientes.\n");
            return false;
        } else
            carrinho.add(pizza);
        return true;
    }

    public int retornaValorTotal() {
        iterator = carrinho.iterator();

        while (iterator.hasNext()) {
            aux = iterator.next();
            valorTotal += aux.getPreco();
        }
        return valorTotal;
    }
}
