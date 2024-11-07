package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

    private List<Figura> figuras = new ArrayList<>();

    public Imagem() {}

    public void adicionar(Figura figura) {
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas() {
        Double somaAreas = 0.0;

        for (Figura figura : figuras) {
            somaAreas += figura.calcularArea();
        }

        return somaAreas;
    }

    public List<Figura> buscarPorAreaMaiorQue20() {
        List<Figura> maioresVinte = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura.calcularArea() > 20)
                maioresVinte.add(figura);
        }

        return maioresVinte;
    }

    public List<Figura> buscarQuadrados() {
        List<Figura> quadrados = new ArrayList<>();

        for(Figura figura : figuras) {
            if (figura instanceof Quadrado)
                quadrados.add(figura);
        }

        return quadrados;
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }

}
