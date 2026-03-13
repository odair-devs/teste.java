import javax.swing.*;
import java.awt.*;

public ProjetoCalculadora() {
    super ("Calculadora 6.0 (Orrico)");
    container = getContentPane();
    layout = new GridBagLayout();
    container.setLayout(layout);
    constraints = new GridBagLayout();

    botão1 = new JButton ("1");
    botão2 = new JButton ("2");
    botão3 = new JButton ("3");
    botão4 = new JButton ("4");
    botão5 = new JButton ("5");
    botão6 = new JButton ("6");
    botão7 = new JButton ("7");
    botão8 = new JButton ("8");
    botão9 = new JButton ("9");
    botão0 = new JButton ("0");
    botaoC = new JButton ("C");
    botaoC.setToolTipText("Tecle C");
    botaoCE = new Jbutton ("CE");
    botaoCE = setToolTiptext("Tecle E");
    botaoDiv= new JButton("/");
    botaoMultip = new JButton("*");
    botaoMenos = new JButton("-");
    botaoMais = new JButton("+");
    botaoVirgula = new JButton(",");
    botaoVirgula.setToolipText("Tecle , (Virgula) ");
    botaoTotal = new JButton("T");
    botaoTotal.setTollTiptext ("Tecle ENTER");
    botaoPerc = new JButton("%");
    botaoPerc.setToolTipText ("Tecle P");







}
