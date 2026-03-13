import java.awt.event.*;
import javax.swing.*;

public class TrataEventosRadio implements ItemListener, KeyListener {
    private int casasDecimais = 2; // Número de casas decimais padrão

    // Método que lida com mudanças de estado de itens
    @Override
    public void itemStateChanged(ItemEvent event) {
        if (event.getSource() == botao2dig) {
            casasDecimais = 2;
        } else if (event.getSource() == botao4dig) {
            casasDecimais = 4;
        } else if (event.getSource() == botao6dig) {
            casasDecimais = 6;
        }
    }

    // Método que lida com pressionamento de teclas
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            int selectedOption = JOptionPane.showConfirmDialog(this, "Deseja Sair mesmo???", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION) {
                dispose();
                System.exit(0);
            }
        }

        // Trata diferentes teclas
        switch (e.getKeyCode()) {
            case KeyEvent.VK_C:
                teclouC();
                break;
            case KeyEvent.VK_E:
                teclouCE();
                break;
            case KeyEvent.VK_BACK_SPACE:
                teclouBackspace();
                break;
            case KeyEvent.VK_V:
                teclouVirgula();
                break;
            case KeyEvent.VK_0:
            case KeyEvent.VK_NUMPAD0:
                teclouNumeros("0");
                break;
            // Adicione os outros casos conforme necessário
            case KeyEvent.VK_ENTER:
                teclouEnter();
                break;
            // Adicione outros casos para operações
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyTyped(KeyEvent e) {}

    // Métodos para tratar eventos de teclas
    public void teclouC() {
        // Implementação do evento C
    }

    public void teclouCE() {
        // Implementação do evento CE
    }

    public void teclouBackspace() {
        // Implementação do evento Backspace
    }

    public void teclouVirgula() {
        // Implementação do evento vírgula
    }

    public void teclouNumeros(String numero) {
        // Implementação do evento números
    }

    public void teclouEnter() {
        // Implementação do evento Enter
    }
}
