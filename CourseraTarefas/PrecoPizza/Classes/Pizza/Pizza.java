package CourseraTarefas.PrecoPizza.Classes.Pizza;

import java.util.HashMap;

public class Pizza {
    public int ingredientesPizza;
    static int valor = 1;
    static int cloneValor;

    public static HashMap<String, Integer> ingredientes = new HashMap<String, Integer>();

    public static void contabilizaIngrediente(String ingrediente) {
        if (ingredientes.containsKey(ingrediente)) {
            cloneValor = ingredientes.get(ingrediente);
            cloneValor++;
            ingredientes.replace(ingrediente, cloneValor);
        } else {
            ingredientes.put(ingrediente, valor);
        }
    }

    public void adicionaIngrediente(String ingrediente) {
        ingredientesPizza++;
        contabilizaIngrediente(ingrediente);
    }

    public int getPreco() {
        if (ingredientesPizza <= 2) {
            return 15;
        } else if (ingredientesPizza > 2 && ingredientesPizza <= 5) {
            return 20;
        } else {
            return 23;
        }
    }

    public static void zerarRegistro() {
        HashMap<String, Integer> ingred = new HashMap<String, Integer>();
        ingredientes = ingred;
    }
}
