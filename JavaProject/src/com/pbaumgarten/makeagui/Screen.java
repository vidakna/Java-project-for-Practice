package com.pbaumgarten.makeagui;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Screen extends JFrame{
    private JPanel panelTop;
    private JPanel panelLeft;
    private JPanel panelRight;
    private JList listPeople;
    private JButton buttonNew;
    private JButton buttonSave;
    private JTextField textName;
    private JTextField textEmail;
    private JTextField textPhoneNumber;
    private JTextField textAddress;
    private JLabel labelAge;
    private JTextField textDateOfBirth;
    private JPanel panelMain;
    private ArrayList<Person> people;
    private DefaultListModel listPeopleModel;

    Screen(){
        super("My fancy Contacts project");
        this.setContentPane(this.panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        people=new ArrayList<Person>();
        listPeopleModel=new DefaultListModel();
        listPeople.setModel(listPeopleModel);
        buttonSave.setEnabled(false);

        buttonNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 Person p=new Person(textName.getText(),textEmail.getText(),textPhoneNumber.getText(),textDateOfBirth.getText());
                 people.add(p);
                  refreshPeopleList();


            }
        });
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int personNumber=listPeople.getSelectedIndex();
                if (personNumber>=0){
                    Person p=people.get(personNumber);
                    p.setName(textName.getText());
                    p.setEmail(textEmail.getText());
                    p.setPhoneNumber(textPhoneNumber.getText());
                    p.setDateOfBirth(textDateOfBirth.getText());
                    refreshPeopleList();
                }
            }
        });
        listPeople.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
              int personNumber= listPeople.getSelectedIndex();
              if(personNumber>=0){
                  Person p=people.get(personNumber);
                  textName.setText(p.getName());
                  textEmail.setText(p.getEmail());
                  textPhoneNumber.setText(p.getPhoneNumber());
                  textDateOfBirth.setText(p.getDateOfBirth().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                  labelAge.setText(Integer.toString (p.getAge())+"years");
                  buttonSave.setEnabled(true);
              }
              else {
                  buttonSave.setEnabled(false);
              }
            }
        });

    }
    public void refreshPeopleList(){
       listPeopleModel.removeAllElements();
        System.out.println("Removing all person to List :");
       for (Person p:people){
           System.out.println("Adding person to List :" +p.getName());
           listPeopleModel.addElement(p.getName());

       }
    }

    public void addPerson(Person p){
        people.add(p);
        refreshPeopleList();
    }

    public static void main(String[] args) {
        Screen screen=new Screen();
        screen.setVisible(true);

        Person Vidakna = new Person("Vidakna Perera", "vidakna@gmail.com","0775391353","26/11/1999");
        Person Sayuri = new Person("Sayuri Kulasinghe", "sayuri@gmail.com","0712635664","27/10/1999");
        Person Thilini = new Person("Thilini Perera", "thilini@gmail.com","0717736665","16/02/1998");
        Person Janeesha = new Person("Janeesha Tharani", "janeesha@gmail.com","0772827272","20/09/1999");
        Person Himesh= new Person("Himesh Fenando", "himesh@gmail.com","0742662626","12/04/1997");
        Person Isuru = new Person("Isuru Sanjana", "isuri@gmail.com","0778362255","03/04/1998");
        Person Chandima = new Person("Chandima Wishwajith", "chandima@gmail.com","0756262552","24/10/1998");

        screen.addPerson(Vidakna);
        screen.addPerson(Sayuri);
        screen.addPerson(Thilini);
        screen.addPerson(Janeesha);
        screen.addPerson(Himesh);
        screen.addPerson(Isuru);
        screen.addPerson(Chandima);
    }
}
