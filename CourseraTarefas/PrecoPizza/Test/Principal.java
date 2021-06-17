package CourseraTarefas.PrecoPizza.Test;

import CourseraTarefas.PrecoPizza.Classes.Carrinho.CarrinhoDeCompras;
import CourseraTarefas.PrecoPizza.Classes.Pizza.Pizza;

public class Principal {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Pizza portuguesa = new Pizza();
        Pizza calabresa = new Pizza();
        Pizza frango = new Pizza();

        //atribuindo ingredientes às pizzas
        portuguesa.adicionaIngrediente("Ovo");
        portuguesa.adicionaIngrediente("Ervilha");
        portuguesa.adicionaIngrediente("Presunto");
        portuguesa.adicionaIngrediente("Queijo");
        portuguesa.adicionaIngrediente("Molho de tomate");
        portuguesa.adicionaIngrediente("Cebola");

        frango.adicionaIngrediente("Frango");
        frango.adicionaIngrediente("Catupiry");
        frango.adicionaIngrediente("Cebola");

        //adicionando as pizzas ao carrinho
        carrinho.adicionarPizza(portuguesa);
        carrinho.adicionarPizza(calabresa);
        carrinho.adicionarPizza(frango);

        //retornando o valor total do carrinho com as pizzas
        System.out.println("O valor total do carrinho é de: " + carrinho.retornaValorTotal() + "\n");

        //retornando todos os ingredientes e suas respectivas quantidades
        for (String ingredientes : Pizza.ingredientes.keySet()) {
            System.out.println("Ingrediente = " + ingredientes + "\n" + "Quantidade = " + Pizza.ingredientes.get(ingredientes) + "\n");
        }

        Pizza.zerarRegistro();
        System.out.println(Pizza.ingredientes);

    }
}
