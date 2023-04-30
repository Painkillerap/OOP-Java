import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Product.*;
import VendingMachina.*;

public class MainFrame extends JFrame {

    private Font mainFont = new Font("Arial", Font.BOLD, 18);
    JLabel LbName, SumName;
    private JTextField moneyInput;
    private JButton BtnOk;
    private DefaultListModel<Product> productListName;
    private JList<Product> ListName;
    private VendingMachina vendingMachines;

    public MainFrame(VendingMachina vendingMachines) {
        super("Vending Machina");
        this.vendingMachines = vendingMachines;
        // Создаем список продуктов
        productListName = new DefaultListModel<>();
        for (Product product : vendingMachines.getProdAll()) {
            productListName.addElement(product);
        }
        ListName = new JList<>(productListName);
        ListName.setFont(mainFont);
        // Создаем поле ввода наличности
        moneyInput = new JTextField(10);
        moneyInput.setFont(mainFont);

        // Создаем кнопку "Купить товар"
        BtnOk = new JButton("Купить", null);
        BtnOk.setFont(mainFont);
        BtnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Получаем выбранный продукт и введенную наличность
                Product selectedProduct = ListName.getSelectedValue();
                Double money = Double.parseDouble(moneyInput.getText());

                // Покупаем продукт и выводим результат в диалоговом окне
                String result = vendingMachines.FinalFrame(selectedProduct, money);
                JOptionPane.showMessageDialog(MainFrame.this, result);
            }
        });
        // Создаем главную панель для размещения элементов интерфейса
        JPanel panel = new JPanel(new BorderLayout());
        // panel.setLayout(new GridLayout(2, 1, 5, 5));
        panel.setBackground(new Color(128, 128, 255));
        LbName = new JLabel("Выберите товар и введите сумму, затем нажмите \"Купить товар\"");
        LbName.setFont(mainFont);
        panel.add(LbName, BorderLayout.NORTH);
        panel.add(new JScrollPane(ListName), BorderLayout.CENTER);
        panel.add(BtnOk, BorderLayout.AFTER_LINE_ENDS);
        // Создаем панель для размещения элементов ввода суммы
        JPanel panelSum = new JPanel(new BorderLayout());
        panelSum.setBackground(new Color(128, 128, 255));
        SumName = new JLabel("Введите сумму");
        panelSum.add(SumName, BorderLayout.NORTH);
        SumName.setFont(mainFont);
        panelSum.add(moneyInput, BorderLayout.SOUTH);
        // Добавляем на главную панель элементы ввода суммы
        panel.add(panelSum, BorderLayout.SOUTH);

        // Добавляем панель на форму
        setContentPane(panel);
        setTitle("Welcome to VendingMashina");
        setSize(400, 400);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
