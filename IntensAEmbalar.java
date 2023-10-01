import java.util.ArrayList;
import java.util.List;

public class IntensAEmbalar {

    private List<ItemASerEmbaladoIF> itens = new ArrayList();

    public int adicionaItem (ItemASerEmbaladoIF item){
        itens.add(item);
        return itens.size()-1;
    }

    public double calculaQtDeEmbalar(int posicao){
        return  itens.get(posicao).getArea()*itens.get(posicao).getPeso();
    }

    public double calculaQtTotalDeEmbalar(){
        int total = 0;
        for (int i = 0; i < itens.size(); i++){
            total += calculaQtDeEmbalar(i);
        }
        return total;
    }
}