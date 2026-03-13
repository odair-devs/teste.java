import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TratarEventosAcao {
    private class trataEventosAcao implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == botaoC)
                teclouC();
            else if (event.getSource() == botaoCE)
                teclouCE();
            else if (event.getSource() == botaoPerc)
                teclouP(); // Método teclouP() não definido na imagem, assumindo 'teclouP'
            else if (event.getSource() == botaoVirgula)
                teclouVirgula();
            else if (event.getSource() == botaoBackspace)
                teclouBackspace();
            else if (event.getSource() == botao1)
                teclouNumeros("1");
            else if (event.getSource() == botao2)
                teclouNumeros("2");
            else if (event.getSource() == botao3)
                teclouNumeros("3");
            else if (event.getSource() == botao4)
                teclouNumeros("4");
            else if (event.getSource() == botao5)
                teclouNumeros("5");
            else if (event.getSource() == botao6)
                teclouNumeros("6");
            else if (event.getSource() == botao7)
                teclauNumeros("7");
            else if (event.getSource() == botao8)
                teclauNumeros("8");
            else if (event.getSource() == botao9)
                teclauNumeros("9");
            else if (event.getSource() == botao0)
                teclauNumeros("0");
            else if (event.getSource()== botaoMais) teclouMais();
            else if (event.getSource()== botaoMenos) teclouMenos();
            else if (event.getSource()== botaoDiv) teclouDiv();
            else if (event.getSource()== botaoMultip) teclouMultip();
            else if (event.getSource()== botaoTotal) teclouEnter();
        }
    }
}



